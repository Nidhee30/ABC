package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.Practice_ZerodhaDashboardPage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.parametrization;

public class Practice_ZerodhaDashboardPageTest
{
	WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		driver=Browser.openBrowser();
		
	}
	@Test
	public void ClickOnSearchTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaloginpage= new ZerodhaLoginPage(driver);
		String username= parametrization.getData("Sheet",0, 1);
		String password=parametrization.getData("Sheet",1,1);
		zerodhaloginpage.EnterUserId(username);
		zerodhaloginpage.EnterPassword(password);
		zerodhaloginpage.ClickOnLogin();
		Thread.sleep(3000);
		ZerodhaPinPage zerodaPinPage= new ZerodhaPinPage(driver);
		//Thread.sleep(2000);
		String pin=parametrization.getData("Sheet",2,1);
		zerodaPinPage.enterPin(pin);
		//Thread.sleep(2000);
		zerodaPinPage.ClickOnSubmit();
		Practice_ZerodhaDashboardPage zerodhadashboardpage = new Practice_ZerodhaDashboardPage(driver);
		String nameofshare= parametrization.getData("Sheet", 4, 1);
		zerodhadashboardpage.EnterShareName(nameofshare);
		zerodhadashboardpage.SelectShare(driver);
		zerodhadashboardpage.ClickOnBuy();
	}
	
}
