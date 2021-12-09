package com.SRIS.ResidenceStatus;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class Duplicate extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void ResidenceStatusModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ResidenceStatusMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	@Test(priority = 2)
	public void CheckDuplicateAllowForResidenceName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.ResidenceNameClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceNameUniqueMethod();
		Thread.sleep(700);
		masterdata.NationalityDescriptionDuplicateMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(700);
		masterdata.PopupYesMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		try {
			if(msg.equalsIgnoreCase("Duplicate Record Exists!!"))
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, "Status", 24, "Fail");
			}
			else
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, "Status", 24, "Pass");
			}
			
		} catch (Exception e) {
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, "Status", 24, "Pass");
		}
	}
	@Test(priority = 3)
	public void CheckDuplicateNotAllowForResidenceName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.AddMethod();
		Thread.sleep(700);
		masterdata.ResidenceNameClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.ResidenceNameDuplicateMethod();
		Thread.sleep(700);
		masterdata.ResidenceDifferentDescriptionMethod();
		Thread.sleep(700);
		masterdata.SubmitButtonMethod();
		Thread.sleep(700);
		masterdata.PopupYesMethod();
		Thread.sleep(1000);
		String msg = masterdata.SubmitPopupMsgMethod();
		Thread.sleep(1000);
		if(msg.equalsIgnoreCase("Duplicate Record Exists!!"))
		{
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, "Status", 25, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(ResidenceStatus_Sheet, "Status", 25, "Fail");
		}
	}
}
