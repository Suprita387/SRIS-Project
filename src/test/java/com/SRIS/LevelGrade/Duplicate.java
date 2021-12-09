package com.SRIS.LevelGrade;

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
	public void LevelGradeModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.LevelGradeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	@Test(priority = 2)
	public void CheckDuplicateAllowForLevelGradeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.GradeNameClearMethod();
		Thread.sleep(700);
		masterdata.GradeNameUniqueMethod();
		Thread.sleep(700);
		masterdata.GradeNameDescriptionDuplicateMethod();
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
				AutoConstant.fileone.setCellData(LevelGrade_Sheet, "Status", 24, "Fail");
			}
			else
			{
				System.out.println(msg);
				masterdata.PopupOkMethod();
				System.out.println("Validation Message Not Showing");
				AutoConstant.fileone.setCellData(LevelGrade_Sheet, "Status", 24, "Pass");
			}
			
		} catch (Exception e) {
			System.out.println(msg);
			masterdata.PopupOkMethod();
			AutoConstant.fileone.setCellData(LevelGrade_Sheet, "Status", 24, "Pass");
		}
	}
	@Test(priority = 3)
	public void CheckDuplicateNotAllowForGradeName()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(1000);
		masterdata.AddMethod();
		Thread.sleep(700);
		masterdata.GradeNameClearMethod();
		Thread.sleep(700);
		masterdata.GradeNameDuplicateMethod();
		Thread.sleep(700);
		masterdata.GradeDifferentDescriptionMethod();
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
			AutoConstant.fileone.setCellData(LevelGrade_Sheet, "Status", 25, "Pass");
		}
		else
		{
			System.out.println("Validation Message Not Showing");
			AutoConstant.fileone.setCellData(LevelGrade_Sheet, "Status", 25, "Fail");
		}
	}
}
