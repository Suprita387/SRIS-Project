package com.SRIS.ReasonNeverAttendSchool;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class SqlChar extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void ReasonNeverAttendSchoolModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ReasonNeverAttendSchoolLinkMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSqlCharForNeverAttendSchoolReason()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.NeverAttendSchoolReasonClearMethod();
		Thread.sleep(700);
		masterdata.NeverAttendSchoolReasonSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.NeverAttendSchoolReasonGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ReasonNeverAttendSchool_Sheet, Column_name, 12, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(ReasonNeverAttendSchool_Sheet, Column_name, 12, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSqlCharForNeverAttendSchoolReasonDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.NeverAttendSchoolReasonDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.NeverAttendSchoolReasonDescriptionSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.NeverAttendSchoolReasonDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ReasonNeverAttendSchool_Sheet, Column_name, 13, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(ReasonNeverAttendSchool_Sheet, Column_name, 13, "Pass");
			System.out.println("Pass");
		}
	}
	
}
