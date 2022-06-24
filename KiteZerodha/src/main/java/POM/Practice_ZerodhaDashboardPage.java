package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice_ZerodhaDashboardPage
{
	@FindBy(xpath="") private WebElement Dashboard;
	@FindBy(xpath="") private WebElement Orders;
	@FindBy(xpath="") private WebElement Holdings;
	@FindBy(xpath="") private WebElement Positions;
	@FindBy(xpath="") private WebElement Funds;
	@FindBy(xpath="") private WebElement Apps;
	@FindBy(xpath="//input[@type='text']") private WebElement Searchbar;
	@FindBy(xpath="(//button[@type='button'])[1]") private WebElement BuyShare;
	@FindBy(xpath="") private WebElement SellShare;
	@FindBy(xpath="(//input [@type='number'])[1]") private WebElement Qty;
	@FindBy(xpath="//input[@label='Price']") private WebElement Price;
	@FindBy(xpath="//button[@type='submit']") private WebElement BuyButton;
	@FindBy(xpath="//span[text()='TATAPOWER'] ") private WebElement Tata ;
	
	public Practice_ZerodhaDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void SearchShareName(String SearchShare)
	{
		Searchbar.sendKeys(SearchShare);
	}
	public void EnterShareName(String ShareName)
	{
		Tata.sendKeys(ShareName);
	}
	public void SelectShare(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(Tata).perform();
		act.moveToElement(BuyShare);
		act.click();
		act.perform();
	
	}
	public void ClickOnBuy()
	{
		BuyButton.click();
	}
	
}

