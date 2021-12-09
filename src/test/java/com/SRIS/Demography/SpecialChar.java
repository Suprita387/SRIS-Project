package com.SRIS.Demography;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class SpecialChar extends BaseTest implements SRIS_TestData
{
	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void DemographyModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DemographyMethod();
		Thread.sleep(1000);
		//masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSpecialCharForLocationName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeLGAMethod();
		Thread.sleep(700);
		masterdata.LocationNameClearMethod();
		Thread.sleep(700);
		masterdata.LocationNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.LocationNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForLocationDesc()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeLGAMethod();
		Thread.sleep(700);
		masterdata.LocationDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.LocationDescriptionSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.LocationDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		}
	}
}
