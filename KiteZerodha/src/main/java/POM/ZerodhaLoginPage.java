package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage 
{
	@FindBy(xpath="//input[@id='userid']") private WebElement UserId;
	@FindBy(xpath="//input[@id='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement Login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement ForgotPassword;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;

	public ZerodhaLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterUserId(String Username )
	{
		UserId.sendKeys(Username);
	}
	public void EnterPassword(String Pass)
	{
		Password.sendKeys(Pass);
		
	}
	public void ClickOnLogin()
	{
		Login.click();
	}
	public void ClickOnForgotPassword()
	{
		ForgotPassword.click();
	}
	public void ClickOnSignUp()
	{
		SignUp.click();
	}
}