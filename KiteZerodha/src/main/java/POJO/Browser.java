package POJO;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openBrowser()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\software\\updatedChrome_101\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);//universal weight applicable for every instance of WebDriver
		
		return driver;
	}

}
