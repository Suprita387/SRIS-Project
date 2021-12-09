package com.SRIS.Demography;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class Dropdown extends BaseTest implements SRIS_TestData
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
	public void SelectLocationTypeDropdown()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeLGAMethod();
		Thread.sleep(800);
		String data = masterdata.LocationTypeGetTextMethod();
		Thread.sleep(800);
		if(data.equalsIgnoreCase(LocationTypeLGA))
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 27, "Pass");
		}
		else
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 27, "Fail");
		}
	}
	
	@Test(priority = 3)
	public void SelectLGADropdown()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeSettlementMethod();
		Thread.sleep(800);
		masterdata.SelectLGAdropdownMethod();
		Thread.sleep(800);
		String data = masterdata.LGAdropdownGetTextMethod();
		Thread.sleep(800);
		if(data.equalsIgnoreCase(LGA))
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 28, "Pass");
		}
		else
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 28, "Fail");
		}
	}
	@Test(priority = 4)
	public void SelectDistrictDropdown()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeSettlementMethod();
		Thread.sleep(800);
		masterdata.SelectLGAdropdownMethod();
		Thread.sleep(800);
		masterdata.SelectDistrictdropdownMethod();
		Thread.sleep(800);
		String data = masterdata.DistrictDropdownGetTextMethod();
		Thread.sleep(800);
		if(data.equalsIgnoreCase(DISTRICT))
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 29, "Pass");
		}
		else
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 29, "Fail");
		}
	}
	@Test(priority = 5)
	public void SelectWardDropdown()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.SelectLocationTypeSettlementMethod();
		Thread.sleep(800);
		masterdata.SelectLGAdropdownMethod();
		Thread.sleep(800);
		masterdata.SelectDistrictdropdownMethod();
		Thread.sleep(800);
		masterdata.SelectWarddropdownMethod();
		Thread.sleep(800);
		String data = masterdata.WardDropdownGetTextMethod();
		Thread.sleep(800);
		if(data.equalsIgnoreCase(WARD))
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 30, "Pass");
		}
		else
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(Demography_Sheet, Column_name, 30, "Fail");
		}
	}
}
