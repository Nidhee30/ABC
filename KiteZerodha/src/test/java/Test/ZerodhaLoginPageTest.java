package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.parametrization;
@Listeners(TestListners.class)
public class ZerodhaLoginPageTest extends BaseTest
{
	//WebDriver driver;
	@BeforeMethod
	public void browser()
	{
		driver=Browser.openBrowser();
	}
	@Test
	public void LoginWithValidCredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaloginpage= new ZerodhaLoginPage(driver);
		String username= parametrization.getData("Sheet",0, 1);
		String password=parametrization.getData("Sheet",1,1);
		zerodhaloginpage.EnterUserId(username);
		zerodhaloginpage.EnterPassword(password);
		zerodhaloginpage.ClickOnLogin();
	}
	
	@Test
	public void forgotPasswordLinkTest()
	{
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ClickOnForgotPassword();
	}
	@Test (dependsOnMethods = {"ClickOnLoginWithoutIdPwd"})
	public void SignUpClick()
	{
		ZerodhaLoginPage zerodhaLoginPage= new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ClickOnSignUp();
	}
	@Test
	public void Signup1()
	{
		System.out.println("Hello");
	}
}
