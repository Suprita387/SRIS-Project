package com.SRIS.CookingFuel;

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
	public void CookingFuelModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CookingFuelMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckLengthShouldNotMoreThan50ForCookingFuelName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CookingFuelNameClearMethod();
		Thread.sleep(700);
		masterdata.CookingFuelNameLengthMoreThan50Method();
		Thread.sleep(700);
		String data = masterdata.CookingFuelNameGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 50)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(CookingFuel_Sheet, Column_name, 19, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(CookingFuel_Sheet, Column_name, 19, "Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckLengthShouldNotMoreThan200ForCookingFuelDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CookingFuelDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.CookingFuelDescriptionLengthMoreThan200Method();
		Thread.sleep(700);
		String data = masterdata.CookingFuelDescriptionGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 200)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(CookingFuel_Sheet, Column_name, 20, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(CookingFuel_Sheet, Column_name, 20, "Pass");
		}
	}
}
