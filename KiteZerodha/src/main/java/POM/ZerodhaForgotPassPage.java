package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPassPage 
{
	@FindBy(xpath="") private WebElement RememberMyUserId;
	@FindBy(xpath="") private WebElement ForgotMyUserId;
	@FindBy(xpath="") private WebElement UserId;
	@FindBy(xpath="") private WebElement Pan;
	@FindBy(xpath="") private WebElement E_mail;
	@FindBy(xpath="") private WebElement Sms;
	@FindBy(xpath="") private WebElement E_mailAsOnAcc;
	@FindBy(xpath="") private WebElement MobNoAsOnAcc;
	@FindBy(xpath="")private WebElement Captcha;
	@FindBy(xpath="") private WebElement Reset;
	@FindBy(xpath="") private WebElement BackToLogin;
	
	public ZerodhaForgotPassPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
