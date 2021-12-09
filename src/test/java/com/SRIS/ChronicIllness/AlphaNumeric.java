package com.SRIS.ChronicIllness;

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
	public void ChronicIllnessModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ChronicIllnessMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckAlphaNumericForDiseaseName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DiseaseClearMethod();
		Thread.sleep(700);
		masterdata.DiseaseAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DiseaseGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 17, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 17, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckAlphaNumericForDiseaseDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DiseaseDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DiseaseDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DiseaseDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("(([a-zA-Z].*[0-9])|([0-9].*[a-zA-Z]))");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 18, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 18, "Pass");
			System.out.println("Pass");
		}
	}
	
	@Test(priority = 4)
	public void CheckAlphabetsForDiseaseName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DiseaseClearMethod();
		Thread.sleep(700);
		masterdata.DiseaseAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DiseaseGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 19, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 19, "Fail");
			System.out.println("Fail");
		}
	}
	
	@Test(priority = 5)
	public void CheckAlphabetsForDiseaseDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		//masterdata.AddMethod();
		masterdata.DiseaseDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DiseaseDescriptionAlphaNumericMethod();
		Thread.sleep(700);
		String data = masterdata.DiseaseDescriptionGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile("[a-zA-Z]");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 20, "Pass");
			System.out.println("Pass");
		} 
		else {
			AutoConstant.fileone.setCellData(ChronicIllness_Sheet, Column_name, 20, "Fail");
			System.out.println("Fail");
		}
	}
}
