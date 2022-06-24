package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUrl 
{
	public static WebDriver openBrowser(String Url)
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\software\\updatedChrome_101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		return driver;
	}


}
