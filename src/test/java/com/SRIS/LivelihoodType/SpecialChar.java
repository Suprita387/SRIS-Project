package com.SRIS.LivelihoodType;

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
	public void LivelihoodType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}	
	
	@Test(priority = 2)
	public void CheckSpecialCharForLivelihoodType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeClearMethod();
		Thread.sleep(700);
		masterdata.LivelihoodTypeSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.LivelihoodTypeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 14, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 14, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckSpecialCharForLivelihoodTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LivelihoodTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.LivelihoodTypeDescriptionSpecialCharMethod();
		Thread.sleep(700);
		String data = masterdata.LivelihoodTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[!@#$%&*<>\\[\\]-]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 15, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(LivelihoodType_Sheet, Column_name, 15, "Pass");
			System.out.println("Pass");
		}
	}
}
