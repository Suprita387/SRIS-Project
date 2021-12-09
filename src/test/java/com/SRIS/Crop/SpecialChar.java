package com.SRIS.Crop;

import java.util.regex.Matcher;
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
	public void Crop_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CropMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}	
	
	@Test(priority = 2)
	public void CkeckSpecialCharForCrop()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CropClearMethod();
		Thread.sleep(700);
		masterdata.CropSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.CropGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Crop_Sheet, Column_name, 14, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Crop_Sheet, Column_name, 14, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CkeckSpecialCharForCropDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CropDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.CropDescriptionSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.CropDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(Crop_Sheet, Column_name, 15, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(Crop_Sheet, Column_name, 15, "Pass");
			System.out.println("Pass");
		}
	}
}
