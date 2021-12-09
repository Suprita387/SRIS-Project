package com.SRIS.ExtentReports;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {

		ExtentSparkReporter reporter = new ExtentSparkReporter(
				(System.getProperty("user.dir")) + "/Reports/SRISExtentReport.html");
		reporter.config().setReportName("Sample Extent Report");
		extentReports.attachReporter(reporter);

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);
		reporter.config().setTheme(Theme.DARK);
		// sparkReport.config().setReportName("Extent Report");
		try {
			reporter.loadXMLConfig("D:\\SRIS_FieldValidation_UT_2021\\logoconfig.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		extentReports.setSystemInfo("Executed on OS:", System.getProperty("os.name"));
		extentReports.setSystemInfo("Executed by User:", System.getProperty("user.name"));
		return extentReports;

	}

}
