package com.SRIS.CopingStrategyType;

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
	public void CopingStrategyType_Module()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CopingStrategyTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckDuplicateAllowForCopingStrategyTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.CopingStrategyTypeClearMethod();
		Thread.sleep(700);
		masterdata.CopingStrategyTypeUniqueMethod();
		Thread.sleep(700);
		masterdata.CopingStrategyTypeNameDescriptionDuplicateMethod();
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
				AutoConstant.fileone.setCellData(CopingStrategyType_Sheet, "Status", 24, "Fail");
			}
			else
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(CopingStrategyType_Sheet, "Status", 24, "Pass");
			}
			
		} catch (Exception e) {
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(CopingStrategyType_Sheet, "Status", 24, "Pass");
		}
	}
	@Test(priority = 3)
	public void CheckDuplicateNotAllowForCopingStrategyType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.AddMethod();
		masterdata.CopingStrategyTypeClearMethod();
		Thread.sleep(700);
		masterdata.CopingStrategyTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.CopingStrategyTypeNameDuplicateMethod();
		Thread.sleep(700);
		masterdata.CopingStrategyTypeDifferentDescriptionMethod();
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
			AutoConstant.fileone.setCellData(CopingStrategyType_Sheet, "Status", 25, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(CopingStrategyType_Sheet, "Status", 25, "Fail");
		}
	}
}
