package com.SRIS.Nationality;

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
	public void NationalityMasterModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.NationalityMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSqlCharForNationalityName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.NationalityNameClearMethod();
		Thread.sleep(700);
		masterdata.NationalityNameSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.NationalityNameGetTextMethod();
		Thread.sleep(800);
		Pattern Sql = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = Sql.matcher(data);
		boolean constainsSql = matcher.find();
		if (constainsSql == true) {
			AutoConstant.fileone.setCellData(Nationality_Sheet, Column_name, 12, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Nationality_Sheet, Column_name, 12, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSqlCharForNationalityDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.NationalityDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.NationalityDescriptionSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.NationalityDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern Sql = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = Sql.matcher(data);
		boolean constainsSql = matcher.find();
		if (constainsSql == true) {
			AutoConstant.fileone.setCellData(Nationality_Sheet, Column_name, 13, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Nationality_Sheet, Column_name, 13, "Pass");
			System.out.println("Pass");
		}
	}
	
}
