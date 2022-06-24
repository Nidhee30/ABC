package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


import POJO.BrowserUrl;

public class ScreenShots 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = BrowserUrl.openBrowser("https://vctcpune.com/selenium/practice.html");
	
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File destination = new File ("C:\\software\\ScreenShots\\Vel.jpeg");
	
		FileHandler.copy(Source, destination);
	}
}