package com.SRIS.RoofMaterial;

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
	public void RoofMaterialModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.RoofMaterialMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForRoofMaterialName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.RoofMaterialCategoryMethod();
		Thread.sleep(700);
		masterdata.RoofMaterialNameClearMethod();
		Thread.sleep(700);
		masterdata.RoofMaterialNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.RoofMaterialNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == false) {
			AutoConstant.fileone.setCellData(RoofMaterial_Sheet, Column_name, 12, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(RoofMaterial_Sheet, Column_name, 12, "Fail");
			System.out.println("Fail");
		}
	}
	@Test(priority = 3)
	public void CheckAlphabetsForRoofMaterialName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.RoofMaterialCategoryMethod();
		Thread.sleep(700);
		masterdata.RoofMaterialNameClearMethod();
		Thread.sleep(700);
		masterdata.RoofMaterialNameAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.RoofMaterialNameGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(RoofMaterial_Sheet, Column_name, 13, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(RoofMaterial_Sheet, Column_name, 13, "Fail");
			System.out.println("Fail");
		}
	}


}
