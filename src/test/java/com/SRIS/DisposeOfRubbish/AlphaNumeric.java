package com.SRIS.DisposeOfRubbish;

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
	public void DisposeOfRubbish_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DisposeOfRubbishMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForDisposeOfRubbish()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DisposeOfRubbishClearMethod();
		Thread.sleep(700);
		masterdata.DisposeOfRubbishAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DisposeOfRubbishGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 17, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 17, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForDisposeOfRubbishDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DisposeOfRubbishDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DisposeOfRubbishDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DisposeOfRubbishDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 18, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 18, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 4)
	public void CheckAlphabetsForDisposeOfRubbishName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DisposeOfRubbishClearMethod();
		Thread.sleep(700);
		masterdata.DisposeOfRubbishAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DisposeOfRubbishGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void CheckAlphabetsForDisposeOfRubbishDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DisposeOfRubbishDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DisposeOfRubbishDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DisposeOfRubbishDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(DisposeOfRubbish_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		}
	}
	
}
