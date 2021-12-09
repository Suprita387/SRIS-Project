package com.SRIS.PMTMaster;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class WhiteSpace extends BaseTest implements SRIS_TestData
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
	public void CheckWhiteSpaceNotAllowInitialPlaceForTopCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(700);
		masterdata.TopCutOffClearMethod();
		Thread.sleep(700);
		masterdata.TopCutOffWhiteSpaceInitialMethod();
		Thread.sleep(700);
		String data = masterdata.TopCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile(" ");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 6, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 6, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 3)
	public void CheckWhiteSpaceNotAllowLastPlaceForTopCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(700);
		masterdata.TopCutOffClearMethod();
		Thread.sleep(700);
		masterdata.TopCutOffWhiteSpaceLastMethod();
		Thread.sleep(700);
		String data = masterdata.TopCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile(" ");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 7, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 7, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 4)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForTopCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(700);
		masterdata.TopCutOffClearMethod();
		Thread.sleep(700);
		masterdata.TopCutOffWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		String data = masterdata.TopCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile(" ");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 8, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 8, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 5)
	public void CheckWhiteSpaceNotAllowInitialPlaceForButtomCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffClearMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffWhiteSpaceInitialMethod();
		Thread.sleep(700);
		String data = masterdata.ButtomCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile(" ");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 9, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 9, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 6)
	public void CheckWhiteSpaceNotAllowLastPlaceForButtomCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffClearMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffWhiteSpaceLastMethod();
		Thread.sleep(700);
		String data = masterdata.ButtomCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile(" ");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 10, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 10, "Pass");
			System.out.println("Pass");
		}
	}
	@Test(priority = 6)
	public void CheckWhiteSpaceNotAllowMiddlePlaceForButtomCutOff()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CatgoryDropdownMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffClearMethod();
		Thread.sleep(700);
		masterdata.ButtomCutOffWhiteSpaceMiddleMethod();
		Thread.sleep(700);
		String data = masterdata.ButtomCutOffGetTextMethod();
		Thread.sleep(800);
		Pattern special = Pattern.compile(" ");
		java.util.regex.Matcher matcher = special.matcher(data);
		boolean constainsSpecial = matcher.find();
		if (constainsSpecial == true) {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 11, "Fail");
			System.out.println("Fail");
		} 
		else {
			AutoConstant.fileone.setCellData(PMTMaster_Sheet, Column_name, 11, "Pass");
			System.out.println("Pass");
		}
	}
}
