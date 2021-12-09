package com.SRIS.Demography;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class Length extends BaseTest implements SRIS_TestData
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
	
	@Test(priority = 3)
	public void CheckLengthShouldNotMoreThan50ForLocationName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeLGAMethod();
		Thread.sleep(700);
		masterdata.LocationNameClearMethod();
		Thread.sleep(700);
		masterdata.LocationNameLengthMoreThan50Method();
		Thread.sleep(700);
		String data = masterdata.LocationNameGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 50)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 24, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 24, "Pass");
		}
	}
	
	@Test(priority = 4)
	public void CheckLengthShouldNotMoreThan200ForLocationDesc()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeLGAMethod();
		Thread.sleep(700);
		masterdata.LocationDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.LocationDescriptionLengthMoreThan200Method();
		Thread.sleep(700);
		String data = masterdata.LocationDescriptionGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 200)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 25, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 25, "Pass");
		}
	}
}
