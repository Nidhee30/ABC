package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaSignUpPage 
{

	@FindBy(xpath = "(//a[@target=\"_blank\"])[3]")private WebElement SignUp;
	@FindBy(xpath = "//input[@id='user_mobile']")private WebElement MobileNumber;
	@FindBy(xpath="//button[@type='submit']") private WebElement Continue;
	
	public ZerodaSignUpPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
    public void ClickOnSignUp()
    {
    	SignUp.click();
    }
    
//    public void SwitchWindow(WebDriver driver) 
//    {
//    	
//		Set<String> SignUp = driver.getWindowHandles();
//        Iterator<String> i=SignUp .iterator();
//        System.out.println(i.next());
//        while( i.hasNext())
//        {
//    		String SignUpWindow = i.next();
//    		driver.switchTo().window(SignUpWindow);
//    		if(driver.getTitle().equals("Signup and open a Zerodh trading and demat account online and start...."))
//    		{
//    			
//    		}
//    	}
//    }
    public void EnterMobileNumber(String Mobile) {
    	MobileNumber.sendKeys(Mobile);
    	
    }
    public void ClickOnContinue()
	 {
		Continue.click();
	 }
		
}

