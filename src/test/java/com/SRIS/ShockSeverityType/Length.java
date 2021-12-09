package com.SRIS.ShockSeverityType;

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
	public void ShockSeverityType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckLengthShouldNotMoreThan50ForShockSeverityType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeClearMethod();
		Thread.sleep(700);
		masterdata.ShockSeverityTypeLengthMoreThan50Method();
		Thread.sleep(700);
		String data = masterdata.ShockSeverityTypeGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 50)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, Column_name, 21, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, Column_name, 21, "Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckLengthShouldNotMoreThan200ForShockSeverityTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ShockSeverityTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.ShockSeverityTypeDescriptionLengthMoreThan200Method();
		Thread.sleep(700);
		String data = masterdata.ShockSeverityTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 200)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, Column_name, 22, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(ShockSeverityType_Sheet, Column_name, 22, "Pass");
		}
	}
}