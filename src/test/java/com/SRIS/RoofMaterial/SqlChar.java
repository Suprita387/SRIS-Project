package com.SRIS.RoofMaterial;

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
	public void RoofMaterialModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.RoofMaterialMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CkeckSqlCharForRoofMaterialName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.RoofMaterialCategoryMethod();
		Thread.sleep(700);
		masterdata.RoofMaterialNameClearMethod();
		Thread.sleep(700);
		masterdata.RoofMaterialNameSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.RoofMaterialNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(RoofMaterial_Sheet, Column_name, 9, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(RoofMaterial_Sheet, Column_name, 9, "Pass");
			System.out.println("Pass");
		}
	}
}
