package Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaDashboardPage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.parametrization;




public class ZerodhaDashboardPageTest 
{
	WebDriver driver;
	@BeforeMethod
	public void browser() 
	{
		
		driver = Browser.openBrowser();
	}

	
@Test
	public void SelectSahre() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		ZerodhaLoginPage zerodaLoginPage = new ZerodhaLoginPage(driver);
		String username = parametrization.getData("Sheet", 0, 1);
		String password = parametrization.getData("Sheet", 1, 1);
		zerodaLoginPage.EnterUserId(username);
		zerodaLoginPage.EnterPassword(password);
		zerodaLoginPage.ClickOnLogin();
		Thread.sleep(3000);
		ZerodhaPinPage zerodaPinPage = new ZerodhaPinPage(driver);
		// Thread.sleep(2000);
		String pin = parametrization.getData("Sheet", 2, 1);
		zerodaPinPage.enterPin(pin);
		// Thread.sleep(2000);
		zerodaPinPage.ClickOnSubmit();


		ZerodhaDashboardPage zerodhadashboardpage = new ZerodhaDashboardPage(driver);
		String ShareName = parametrization.getData("Sheet", 4, 1);
		System.out.println(ShareName);
		Thread.sleep(2000);
		zerodhadashboardpage.EnterShare(ShareName);
		zerodhadashboardpage.ClickBuyButtonShare(driver);
		Thread.sleep(2000);
		zerodhadashboardpage.RedioClick();
		Thread.sleep(2000);
		zerodhadashboardpage.RedioClickC();
		Thread.sleep(2000);
		zerodhadashboardpage.MarketValueClick();
		Thread.sleep(2000);
		zerodhadashboardpage.CheckBoxClick();
		Thread.sleep(2000);
		zerodhadashboardpage.ClickonBuy();
		Thread.sleep(2000);
		zerodhadashboardpage.ClickOnSwitchT();
		Thread.sleep(2000);
		zerodhadashboardpage.ClickOnSeelSubmit();
		Thread.sleep(2000);
		

	}
}
