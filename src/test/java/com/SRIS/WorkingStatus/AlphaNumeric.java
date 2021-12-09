package com.SRIS.WorkingStatus;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class AlphaNumeric extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void WorkingStatusModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.WorkingStatusMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForWorkingStatusName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.WorkingStatusNameClearMethod();
		Thread.sleep(700);
		masterdata.WorkingStatusNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.WorkingStatusNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 17, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 17, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForWorkingStatusDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.WorkingStatusDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.WorkingStatusDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.WorkingStatusDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 18, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 18, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 4)
	public void CheckAlphabetsForWorkingStatusName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.WorkingStatusNameClearMethod();
		Thread.sleep(700);
		masterdata.WorkingStatusNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.WorkingStatusNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void CheckAlphabetsForWorkingStatusDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		//masterdata.AddMethod();
		masterdata.WorkingStatusDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.WorkingStatusDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.WorkingStatusDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(WorkingStatus_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		}
	}
}
