package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashboardPage 
{
	@FindBy(xpath = "//input[@type='text']")private WebElement Search; //searchfield
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]")private WebElement Tata;// name of share
	@FindBy(xpath ="(//button[@type='button'])[1]")private WebElement Buy; //Buy Movetoelement
	@FindBy(xpath = "(//label[@class='su-radio-label'])[7]")private WebElement RedioMis;//rediobutton for intraday MIS
	@FindBy(xpath = "(//label[@class='su-radio-label'])[8]")private WebElement RedioCnc; //rediobutton for longterm CNC
	@FindBy(xpath = "(//label[@class='su-radio-label'])[9]")private WebElement RedioMkt; //rediobutton for market
	@FindBy(xpath = "(//span[@class='su-checkbox-box'])[2]")private WebElement CheckTgt; //checkbox for target
	@FindBy(xpath = "//button[@type='submit']")private WebElement Buysubmit;
	@FindBy(xpath="//label[@class='su-switch-control']")private WebElement SwitchT;
	@FindBy(xpath="//button[@type='submit']")private WebElement Selsubmit;
	
	public ZerodhaDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}	
	public void EnterShare(String Share)
	{
		Search.click();
		Search.sendKeys(Share);	
	}
	public void ClickBuyButtonShare(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(Tata).perform();
		action.moveToElement(Buy);
		action.click();
		action.perform();
	}			
	public void RedioClick() throws InterruptedException
	{
		RedioMis.click();
	}
	public void RedioClickC() 
	{
		RedioCnc.click();
	}
	public void MarketValueClick() 
	{
		RedioMkt.click();
	}
	public void CheckBoxClick() 
	{
		CheckTgt.click();
	}
	public void ClickonBuy() 
	{
		Buysubmit.click();
	}
	public void ClickOnSwitchT()
	{
		SwitchT.click();
	}
	public void ClickOnSeelSubmit() 
	{
		Selsubmit.click();
	}
}
