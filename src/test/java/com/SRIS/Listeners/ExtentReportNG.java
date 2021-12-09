package com.SRIS.Listeners;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportNG {
static ExtentReports report;
	
	public static ExtentReports setupExtentReport() throws Exception {
		
		SimpleDateFormat format= new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String actualDate=format.format(date);
		
		String reportPath = System.getProperty("user.dir")+
				"/Reports/SRISExtentReport.html";
		
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);

		report = new ExtentReports();
		report.attachReporter(sparkReport);
		
		sparkReport.config().setDocumentTitle("Automation Report");
		sparkReport.config().setTheme(Theme.DARK);
		//sparkReport.config().setReportName("Extent Report");
		sparkReport.loadXMLConfig("D:\\SRIS\\logoconfig.xml");
		
//		report.setSystemInfo("Executed on Environment:",System.getProperty(constants.url));
//		report.setSystemInfo("Executed on Browser:", System.getProperty(constants.browser));
		report.setSystemInfo("Executed on OS:", System.getProperty("os.name"));
		report.setSystemInfo("Executed by User:", System.getProperty("user.name"));
		
		return report;
	}
}
