package com.SRIS.Ethnicity;

import java.util.regex.Matcher;
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
	public void Ethnicity_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.EthnicityMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}	
	
	@Test(priority = 2)
	public void CheckSqlCharForEthnicity()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.EthnicityClearMethod();
		Thread.sleep(700);
		masterdata.EthnicitySqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.EthnicityGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Ethnicity_Sheet, Column_name, 12, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Ethnicity_Sheet, Column_name, 12, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckSqlCharForEthnicityDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.EthnicityDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.EthnicityDescriptionSqlCharMethod();
		Thread.sleep(700);
		String data = masterdata.EthnicityDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Ethnicity_Sheet, Column_name, 13, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Ethnicity_Sheet, Column_name, 13, "Pass");
			System.out.println("Pass");
		}
	}
	
}
