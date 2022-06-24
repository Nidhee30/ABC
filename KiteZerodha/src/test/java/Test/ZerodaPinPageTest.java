package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.parametrization;


public class ZerodaPinPageTest {
	
		WebDriver driver;

	@BeforeMethod
	public void Launchbrowser() {
		driver =Browser.openBrowser();
	}
	@Test
	public void LoginWithZerodaPinTest() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ZerodhaLoginPage zerodaLoginPage= new ZerodhaLoginPage(driver);
		String username=parametrization.getData("Sheet",0, 1);
		String password=parametrization.getData("Sheet",1, 1);
		zerodaLoginPage.EnterUserId(username);
		zerodaLoginPage.EnterPassword(password);
		zerodaLoginPage.ClickOnLogin();
		Thread.sleep(3000);
		ZerodhaPinPage zerodaPinPage= new ZerodhaPinPage(driver);
		//Thread.sleep(2000);
		String pin=parametrization.getData("Sheet",2,1);
		zerodaPinPage.enterPin(pin);
		//Thread.sleep(2000);
		zerodaPinPage.ClickOnSubmit();
		
		
}
}
