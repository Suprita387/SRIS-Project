package com.SRIS.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.apache.commons.io.FileUtils;

import com.SRIS.GenericsLibrary.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListener extends BaseTest implements ITestListener
{
	static ExtentReports report;
	ExtentTest logger;

	public void onTestStart(ITestResult result) {
				
		logger = report.createTest(result.getMethod().getMethodName());
		ExtentFactory.getInstance().setExtent(logger);
			
	}

	public void onTestSuccess(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.PASS,"Testcase: "+result.getMethod().getMethodName()+ " is Passed.");
		ExtentFactory.getInstance().removeExtentObject();
	}

	public void onTestFailure(ITestResult result) {
		
		ExtentFactory.getInstance().getExtent().log(Status.FAIL,"Testcase: "+result.getMethod().getMethodName()+ " is Failed.");
		ExtentFactory.getInstance().getExtent().log(Status.FAIL,result.getThrowable());
		
		// Extend BrowserFactory Class here (under TestListener Class)
		// Add the access of static WebDriver as protected under BrowserFactoryNew
		// Replace BrowserFactoryNew.StartApplication() with driver under TestListener
		// Class
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//File src = ((TakesScreenshot) BaseTest.openBrowser()).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format= new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String actualDate=format.format(date);
		
		String SSPath=System.getProperty("user.dir")+"/Screenshots/" +actualDate +".png";
		
		File dest =new File(SSPath);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {

			System.out.println("Unable to capture screenshot" + e.getMessage());
			e.printStackTrace();
		}
		ExtentFactory.getInstance().getExtent().addScreenCaptureFromPath(SSPath,"Failed Testcase Screenshot");
		ExtentFactory.getInstance().removeExtentObject();	
	
	}

	public void onTestSkipped(ITestResult result) {
		
		ExtentFactory.getInstance().getExtent().log(Status.SKIP,"Testcase: "+result.getMethod().getMethodName()+ " is Skipped.");
		ExtentFactory.getInstance().removeExtentObject();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
		try {
			report = ExtentReportNG.setupExtentReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onFinish(ITestContext context) {
		//close extent
		report.flush();
		
	}
}
