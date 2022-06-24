package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodaSignUpPage;
import Utility.parametrization;


public class ZerodhaSignUpPageTest
{


	WebDriver driver;

@BeforeMethod
public void browser() 
{
	driver =Browser.openBrowser();
}

public void SwitchWindow(WebDriver driver) 
{
	
	Set<String> SignUp = driver.getWindowHandles();
	Iterator<String> i=SignUp .iterator();
	System.out.println(i.next());
	while( i.hasNext())
	{
		String SignUpWindow = i.next();
		driver.switchTo().window(SignUpWindow);
		if(driver.getTitle().equals("Signup and open a Zerodh trading and demat account online and start...."))
		{
			
		}
	}
}

  @Test
  public void SignupTest() throws InterruptedException, EncryptedDocumentException, IOException	
  {
	  ZerodaSignUpPage zerodaSignUpPage1= new  ZerodaSignUpPage(driver);
	  zerodaSignUpPage1.ClickOnSignUp();
	  ZerodhaSignUpPageTest zerodhasignuptest= new ZerodhaSignUpPageTest();
	  zerodhasignuptest.SwitchWindow(driver);
	  //Thread.sleep(2000);
	  String number=parametrization.getData("Sheet", 3, 1);
	  //Thread.sleep(2000);
	  zerodaSignUpPage1.EnterMobileNumber(number);
	  System.out.println(number);
	  zerodaSignUpPage1.ClickOnContinue();
 
  }
	
	
	
	



}