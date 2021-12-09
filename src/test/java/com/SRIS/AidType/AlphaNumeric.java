package com.SRIS.AidType;

import java.util.regex.Matcher;
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
	public void AidType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForAidType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeClearMethod();
		Thread.sleep(700);
		masterdata.AidTypeAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.AidTypeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == false) {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 17, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 17, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForAidTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.AidTypeDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.AidTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == false) {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 18, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 18, "Fail");
			System.out.println("Fail");
		}
	}
	@Test(priority = 4)
	public void CheckAlphabetsForAidType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeClearMethod();
		Thread.sleep(700);
		masterdata.AidTypeAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.AidTypeGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void CheckAlphabetsForAidTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AidTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.AidTypeDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.AidTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(AidType_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		}
	}
}
