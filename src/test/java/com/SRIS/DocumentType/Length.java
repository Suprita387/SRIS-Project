package com.SRIS.DocumentType;

import org.testng.annotations.Test;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BaseTest;
import com.SRIS.ObjectRepository.SRIS_MasterModule;
import com.SRIS.ObjectRepository.SRIS_TestData;

public class Length extends BaseTest implements SRIS_TestData
{

	@Test(priority = 0)
	public void loginPageOpen()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		masterdata.LoginMethod();
	}
	
	@Test(priority = 1)
	public void DocumentTypeMasterModule()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DocumentTypeMethod();
		Thread.sleep(1000);
		masterdata.AddMethod();
	}
	
	@Test(priority = 2)
	public void CheckLengthShouldNotMoreThan50ForDocumentType()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DocumentTypeClearMethod();
		Thread.sleep(700);
		masterdata.DocumentTypeLengthMoreThan50Method();
		Thread.sleep(700);
		String data = masterdata.DocumentTypeGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 50)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(DocumentType_Sheet, Column_name, 19, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(DocumentType_Sheet, Column_name, 19, "Pass");
		}
	}
	
	@Test(priority = 3)
	public void CheckLengthShouldNotMoreThan200ForDocumentTypeDescription()throws InterruptedException
	{
		SRIS_MasterModule masterdata = new SRIS_MasterModule(driver);
		Thread.sleep(700);
		masterdata.DocumentTypeDescriptionClearMethod();
		Thread.sleep(700);
		masterdata.DocumentTypeDescriptionLengthMoreThan200Method();
		Thread.sleep(700);
		String data = masterdata.DocumentTypeDescriptionGetTextMethod();
		Thread.sleep(800);
		int Length = data.length();
		System.out.println(Length);
		if(Length > 200)
		{
			System.out.println("Fail");
			AutoConstant.fileone.setCellData(DocumentType_Sheet, Column_name, 20, "Fail");
		}
		else
		{
			System.out.println("Pass");
			AutoConstant.fileone.setCellData(DocumentType_Sheet, Column_name, 20, "Pass");
		}
	}
}