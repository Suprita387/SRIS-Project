package com.SRIS.PMTMaster;

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
	public void PMTMasterModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.PMTMasterMethod();
		Thread.sleep(1000);
		//masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void SelectCategoryDropdown()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(800);
		String data = masterdata.CategoryGetTextMethod();
		Thread.sleep(800);
		if(data.equalsIgnoreCase(Catgory))
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 23, "Pass");
		}
		else
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 23, "Fail");
		}
	}
}
