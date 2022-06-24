package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.TakesScreenshotWithDate;

public class TestListners extends BaseTest implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+ "Test has started");
	}
	public void onTestFailure(ITestResult result)
	{
		//System.out.println(result.getName()+ "Test has failed");
		try
		{
			TakesScreenshotWithDate.takeScreenshot(driver,result.getName());
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
		
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+ "Test Successful");
	}
	public void onTestskipped(ITestResult result)
	{
		System.out.println(result.getName()+ "Test skipped");
		
	}
}
