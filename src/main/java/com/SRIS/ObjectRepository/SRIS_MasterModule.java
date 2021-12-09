package com.SRIS.ObjectRepository;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.SRIS.GenericsLibrary.AutoConstant;
import com.SRIS.GenericsLibrary.BasePage;

public class SRIS_MasterModule extends BasePage implements AutoConstant, SRIS_TestData
{
	@FindBy(id="textUser")
	private WebElement UserNameTextField;
	
	@FindBy(id="textPassword")
	private WebElement PasswordTextField;
	
	@FindBy(id="login_button")
	private WebElement LoginButton;
	
	@FindBy(xpath="//label[.='Master']")
	private WebElement MasterLinkClick;
	
	public void LoginMethod() throws InterruptedException
	{
		Thread.sleep(1000);
		UserNameTextField.sendKeys("admin");
		Thread.sleep(1000);
		PasswordTextField.sendKeys("password");
		//Thread.sleep(10000);
		Thread.sleep(800);
		LoginButton.click();
		Thread.sleep(1000);
		MasterLinkClick.click();
	}
	//**************** Generates Random Alphabets ****************//
	
	public String GenrateRandomAlphabatic(int targetStringLength)
	{
	 int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    //int targetStringLength = 10;
	    Random random = new Random();
	
	    String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	
	    System.out.println(generatedString);
	    return generatedString;
	}
	
	//**************** Sub Modules Web Elements ******************//
	
	@FindBy(xpath="//a[.='Demography']")
	private WebElement DemographyLinkClick;
	
	@FindBy(xpath="//a[.='Relation Master']")
	private WebElement RelationMasterLinkClick;
	
	@FindBy(xpath="//a[.='PMT Master']")
	private WebElement PMTMasterLinkClick;
	
	@FindBy(xpath="//a[.='Document Type']")
	private WebElement DocumentTypeLinkClick;
	
	@FindBy(xpath="//a[.='Nationality']")
	private WebElement NationalityLinkClick;
	
	@FindBy(xpath="//a[.='Residence Status']")
	private WebElement ResidenceStatusLinkClick;
	
	@FindBy(xpath="//a[.='Marital Status Master']")
	private WebElement MaritalStatusMasterLinkClick;
	
	@FindBy(xpath="//a[.='Reason NeverAttend School']")
	private WebElement ReasonNeverAttendSchoolLinkClick;
	
	@FindBy(xpath="//a[.='Level Grade']")
	private WebElement LevelGradeLinkClick;
	
	@FindBy(xpath="//a[.='Reason Stop School']")
	private WebElement ReasonStopSchoolLinkClick;
	
	@FindBy(xpath="//a[.='Seeing Difficulty']")
	private WebElement SeeingDifficultyLinkClick;
	
	@FindBy(xpath="//a[.='Chronic Illness']")
	private WebElement ChronicIllnessLinkClick;
	
	@FindBy(xpath="//a[.='Wall Material']")
	private WebElement WallMaterialLinkClick;
	
	@FindBy(xpath="//a[.='Main Job Activity']")
	private WebElement MainJobActivityLinkClick;
	
	@FindBy(xpath="//a[.='Working Frequency']")
	private WebElement WorkingFrequencyLinkClick;
	
	@FindBy(xpath="//a[.='Working Sector']")
	private WebElement WorkingSectorLinkClick;
	
	@FindBy(xpath="//a[.='Working Status']")
	private WebElement WorkingStatusLinkClick;
	
	@FindBy(xpath="//a[.='Reason Not Working']")
	private WebElement ReasonNotWorkingLinkClick;
	
	@FindBy(xpath="//a[.='Floor Material']")
	private WebElement FloorMaterialLinkClick;
	
	@FindBy(xpath="//a[.='Roof Material']")
	private WebElement RoofMaterialLinkClick;
	
	@FindBy(xpath="//a[.='Cooking Fuel']")
	private WebElement CookingFuelLinkClick;
	
	@FindBy(xpath="//a[.='Distance Type']")
	private WebElement DistanceTypeLinkClick;
	
	@FindBy(xpath="//a[.='Dispose Of Rubbish']")
	private WebElement DisposeOfRubbishLinkClick;
	
	@FindBy(xpath="//a[.='Main Drinking Source']")
	private WebElement MainDrinkingSourceLinkClick;
	
	@FindBy(xpath="//a[.='Toilet Type']")
	private WebElement ToiletTypeLinkClick;
	
	@FindBy(xpath="//a[.='Main Lighting Source']")
	private WebElement MainLightingSourceLinkClick;
	
	@FindBy(xpath="//a[.='Income Source']")
	private WebElement IncomeSourceLinkClick;
	
	@FindBy(xpath="//a[.='Aid Type']")
	private WebElement AidTypeLinkClick;
	
	@FindBy(xpath="//a[.='Aid Frequency']")
	private WebElement AidFrequencyLinkClick;
	
	@FindBy(xpath="//a[.='Organizaton Type']")
	private WebElement OrganizatonTypeLinkClick;
	
	@FindBy(xpath="//a[.='Live Stock']")
	private WebElement LiveStockLinkClick;
	
	@FindBy(xpath="//a[.='Livelihood Type']")
	private WebElement LivelihoodTypeLinkClick;
	
	@FindBy(xpath="//a[.='Shock']")
	private WebElement ShockLinkClick;
	
	@FindBy(xpath="//a[.='Shock Severity Type']")
	private WebElement ShockSeverityTypeLinkClick;
	
	@FindBy(xpath="//a[.='Coping Strategy Type']")
	private WebElement CopingStrategyTypeLinkClick;
	
	@FindBy(xpath="//a[.='Occupancy Status']")
	private WebElement OccupancyStatusLinkClick;
	
	@FindBy(xpath="//a[.='Ethnicity']")
	private WebElement EthnicityLinkClick;
	
	@FindBy(xpath="//a[.='Crop']")
	private WebElement CropLinkClick;
	
	//**************** Sub Modules Methods ******************//
	
	public void DemographyMethod()
	{
		DemographyLinkClick.click();
	}
	
	public void RelationMasterMethod()
	{
		RelationMasterLinkClick.click();
	}
	
	public void PMTMasterMethod()
	{
		PMTMasterLinkClick.click();
	}
	
	public void DocumentTypeMethod()
	{
		DocumentTypeLinkClick.click();
	}
	
	public void NationalityMethod()
	{
		NationalityLinkClick.click();
	}
	
	public void ResidenceStatusMethod()
	{
		ResidenceStatusLinkClick.click();
	}
	
	public void MaritalStatusMasterMethod()
	{
		MaritalStatusMasterLinkClick.click();
	}
	
	public void ReasonNeverAttendSchoolLinkMethod()
	{
		ReasonNeverAttendSchoolLinkClick.click();
	}
	
	public void LevelGradeMethod()
	{
		LevelGradeLinkClick.click();
	}
	
	public void ReasonStopSchoolMethod()
	{
		ReasonStopSchoolLinkClick.click();
	}
	
	public void SeeingDifficultyMethod()
	{
		SeeingDifficultyLinkClick.click();
	}
	
	public void ChronicIllnessMethod()
	{
		ChronicIllnessLinkClick.click();
	}
	
	public void WallMaterialMethod()
	{
		WallMaterialLinkClick.click();
	}
	
	public void MainJobActivityMethod()
	{
		MainJobActivityLinkClick.click();
	}
	
	public void WorkingFrequencyMethod()
	{
		WorkingFrequencyLinkClick.click();
	}
	
	public void WorkingSectorMethod()
	{
		WorkingSectorLinkClick.click();
	}
	
	public void WorkingStatusMethod()
	{
		WorkingStatusLinkClick.click();
	}
	
	public void ReasonNotWorkingMethod()
	{
		ReasonNotWorkingLinkClick.click();
	}
	
	public void FloorMaterialMethod()
	{
		FloorMaterialLinkClick.click();
	}
	
	public void RoofMaterialMethod()
	{
		RoofMaterialLinkClick.click();
	}
	
	public void CookingFuelMethod()
	{
		CookingFuelLinkClick.click();
	}
	
	public void DistanceTypeMethod()
	{
		DistanceTypeLinkClick.click();
	}
	
	public void DisposeOfRubbishMethod()
	{
		DisposeOfRubbishLinkClick.click();
	}
	
	public void MainDrinkingSourceMethod()
	{
		MainDrinkingSourceLinkClick.click();
	}
	
	public void ToiletTypeMethod()
	{
		ToiletTypeLinkClick.click();
	}
	
	public void MainLightingSourceMethod()
	{
		MainLightingSourceLinkClick.click();
	}
	
	public void IncomeSourceMethod()
	{
		IncomeSourceLinkClick.click();
	}
	
	public void AidTypeMethod()
	{
		AidTypeLinkClick.click();
	}
	
	public void AidFrequencyMethod()
	{
		AidFrequencyLinkClick.click();
	}
	
	public void OrganizatonTypeMethod()
	{
		OrganizatonTypeLinkClick.click();
	}
	
	public void LiveStockMethod()
	{
		LiveStockLinkClick.click();
	}
	
	public void LivelihoodTypeMethod()
	{
		LivelihoodTypeLinkClick.click();
	}
	
	public void ShockMethod()
	{
		ShockLinkClick.click();
	}
	
	public void ShockSeverityTypeMethod()
	{
		ShockSeverityTypeLinkClick.click();
	}
	
	public void CopingStrategyTypeMethod()
	{
		CopingStrategyTypeLinkClick.click();
	}
	
	public void OccupancyStatusMethod()
	{
		OccupancyStatusLinkClick.click();
	}
	
	public void EthnicityMethod()
	{
		EthnicityLinkClick.click();
	}
	
	public void CropMethod()
	{
		CropLinkClick.click();
	}
	
	//*************** Add Tab ******************//
	
	@FindBy(xpath="//a[.='Add']")
	private WebElement AddTabClick;
	
	public void AddMethod()
	{
		AddTabClick.click();
	}
	
	//*************** Submit Button ******************//
	
	@FindBy(id="btnSubmit")
	private WebElement SubmitButtonClick;
	
	public void SubmitButtonMethod()
	{
		SubmitButtonClick.click();
	}
	
	//*************** Cancel Button ******************//
	
	@FindBy(id="btnCancel")
	private WebElement CancelButtonClick;
	
	public void CancelButtonMethod()
	{
		CancelButtonClick.click();
	}
	
	
	//************************ Alert ********************************//
	public void alertAcceptMethod(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public void alertDismissMethod(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public String alertMsgHandle(WebDriver driver) {
		String msg = driver.switchTo().alert().getText();
		return msg;
	}
	
	//************************ Popup Alert ********************************//
	
	@FindBy(xpath="//div[@class='swal-title']")
	private WebElement PopupMsg;
	
	public String PopupMsgMethod()
	{
		String popupmsg = PopupMsg.getText();
		return popupmsg;
	}
	
	@FindBy(xpath="//button[.='OK']")
	private WebElement PopupOK;
	
	public void PopupOkMethod()
	{
		PopupOK.click();
	}
	
	@FindBy(xpath="//div[@class='swal-text']")
	private WebElement SubmitPopupMsg;
	
	public String SubmitPopupMsgMethod()
	{
		String submitpopupmsg = SubmitPopupMsg.getText();
		return submitpopupmsg;
	}
	
	@FindBy(xpath="//button[.='Yes']")
	private WebElement PopupYes;
	
	public void PopupYesMethod()
	{
		PopupYes.click();
	}
	
	@FindBy(xpath="//button[.='No']")
	private WebElement PopupNo;
	
	public void PopupNoMethod()
	{
		PopupNo.click();
	}
	
	//************************ Dropdown ********************************//
	
	@FindBy(id="ddlLocation")
	private WebElement LocationTypeDropdown;
	public void SelectLocationTypeLGAMethod()
	{
		selectbyvisibletext(LocationTypeDropdown, LocationTypeLGA);
	}
	
	public void SelectLocationTypeDistrictMethod()
	{
		selectbyvisibletext(LocationTypeDropdown, LocationTypeDISTRICT);
	}
	
	public void SelectLocationTypeWardMethod()
	{
		selectbyvisibletext(LocationTypeDropdown, LocationTypeWARD);
	}
	
	public void SelectLocationTypeSettlementMethod()
	{
		selectbyvisibletext(LocationTypeDropdown, LocationTypeSETTLEMENT);
	}
	
	@FindBy(id="ddlLGA")
	private WebElement LGADropdown;
	public void SelectLGAdropdownMethod()
	{
		selectbyvisibletext(LGADropdown, LGA);
	}
	
	@FindBy(id="ddlDist")
	private WebElement DistrictDropdown;
	public void SelectDistrictdropdownMethod()
	{
		selectbyvisibletext(DistrictDropdown, DISTRICT);
	}
	
	@FindBy(id="ddlWard")
	private WebElement WardDropdown;
	public void SelectWarddropdownMethod()
	{
		selectbyvisibletext(WardDropdown, WARD);
	}
	
	public String LocationTypeGetTextMethod()
	{
		Select sel = new Select(LocationTypeDropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	public String LGAdropdownGetTextMethod()
	{
		Select sel = new Select(LGADropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	public String DistrictDropdownGetTextMethod()
	{
		Select sel = new Select(DistrictDropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	public String WardDropdownGetTextMethod()
	{
		Select sel = new Select(WardDropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	
	//********************** Demography Input Field ***************************//
	
	@FindBy(id="txtLocation")
	private WebElement LocationNameTextField;
	public void LocationNameMethod()
	{
		LocationNameTextField.sendKeys(LocationName);
	}
	
	@FindBy(id="txtdesc")
	private WebElement LocationDescriptionTextField;
	public void LocationDescriptionMethod()
	{
		LocationDescriptionTextField.sendKeys(LocationDescription);
	}
	
	@FindBy(id="txtLocation")
	private WebElement LocationNameClearTextField;
	public void LocationNameClearMethod()
	{
		LocationNameClearTextField.clear();
	}
	
	@FindBy(id="txtdesc")
	private WebElement LocationDescriptionTextFieldClear;
	public void LocationDescriptionClearMethod()
	{
		LocationDescriptionTextFieldClear.clear();
	}
	
	public String LocationNameGetTextMethod()
	{
		String locationname = LocationNameTextField.getAttribute("value");
		return locationname;
	}
	
	public String LocationDescriptionGetTextMethod()
	{
		String locationdesc = LocationDescriptionTextField.getAttribute("value");
		return locationdesc;
	}
	
	//********************** Demography WhiteSpace  ***************************//
	
	public void LocationNameWhiteSpaceInitialMethod()
	{
		LocationNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void LocationNameWhiteSpaceMiddleMethod()
	{
		LocationNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void LocationDescriptionWhiteSpaceInitialMethod()
	{
		LocationDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void LocationDescriptionWhiteSpaceMiddleMethod()
	{
		LocationDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	
	//********************** Demography Special Char  ***************************//
	
	public void LocationNameSpecialCharMethod()
	{
		LocationNameTextField.sendKeys(SpecialChar);
	}
	
	public void LocationDescriptionSpecialCharMethod()
	{
		LocationDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Demography SQL Char  ***************************//
	
	public void LocationNameSQLCharMethod()
	{
		LocationNameTextField.sendKeys(SQLChar);
	}
	
	public void LocationDescriptionSQLCharMethod()
	{
		LocationDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Demography AlphaNumeric  ***************************//
	
	public void LocationNameAlphaNumericMethod()
	{
		LocationNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void LocationDescriptionAlphaNumericMethod()
	{
		LocationDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Demography Length  ***************************//
	
	public void LocationNameLengthMoreThan50Method()
	{
		LocationNameTextField.sendKeys(MoreThan50);
	}
	
	public void LocationDescriptionLengthMoreThan200Method()
	{
		LocationDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Relation Master Mandatory  ***************************//
	
	@FindBy(id="txtRelationName")
	private WebElement RelationNameTextField;
	public void RelationNameTextFieldMethod()
	{
		RelationNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement DescriptionTextField;
	public void DescriptionTextFieldMethod()
	{
		DescriptionTextField.sendKeys(Description);
	}
	
	public void RelationNameClearMethod()
	{
		RelationNameTextField.clear();
	}
	
	public void DescriptionClearMethod()
	{
		DescriptionTextField.clear();
	}
	
	public String RelationNameGetTextMethod()
	{
		String relationname = RelationNameTextField.getAttribute("value");
		return relationname;
	}
	
	public String DescriptionGetTextMethod()
	{
		String description = DescriptionTextField.getAttribute("value");
		return description;
	}
	
	//********************** Relation Master White Space  ***************************//
	
	public void RelationNameWhiteSpaceInitialMethod()
	{
		RelationNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void RelationNameWhiteSpaceiMiddleMethod()
	{
		RelationNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void DescriptionWhiteSpaceInitialMethod()
	{
		DescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DescriptionWhiteSpaceiMiddleMethod()
	{
		DescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Relation Master Special Char  ***************************//
	
	public void RelationNameSpecialCharMethod()
	{
		RelationNameTextField.sendKeys(SpecialChar);
	}
	
	public void DescriptionSpecialCharMethod()
	{
		DescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Relation Master Sql Char  ***************************//
	
	public void RelationNameSqlCharMethod()
	{
		RelationNameTextField.sendKeys(SQLChar);
	}
	
	public void DescriptionSqlCharMethod()
	{
		DescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Relation Master AlphaNumeric  ***************************//
	
	public void RelationNameAlphaNumericMethod()
	{
		RelationNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void DescriptionAlphaNumericMethod()
	{
		DescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Relation Master Length  ***************************//
	
	public void RelationNameLengthMoreThan50Method()
	{
		RelationNameTextField.sendKeys(MoreThan50);
	}
	
	public void DescriptionLengthMoreThan200Method()
	{
		DescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Relation Master Duplicate  ***************************//
	
	public void RelationNameDuplicateMethod()
	{
		RelationNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void RelationNameUniqueMethod()
	{
		RelationNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void DescriptionDuplicateMethod()
	{
		DescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	public void RelationDifferentDescriptionMethod()
	{
		DescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//**********************  PMTMaster Mandatory  ***************************//
	
	@FindBy(id="ddlCatgory")
	private WebElement CatgoryDropdown;
	public void CatgoryDropdownMethod()
	{
		selectbyvisibletext(CatgoryDropdown, Catgory);
	}
	
	@FindBy(id="txtTopCutOff")
	private WebElement TopCutOffTextField;
	public void TopCutOffTextFieldMethod()
	{
		TopCutOffTextField.sendKeys(TopCutOff);
	}
	
	@FindBy(id="txtButtomCutOff")
	private WebElement ButtomCutOffTextField;
	public void ButtomCutOffTextFieldMethod()
	{
		ButtomCutOffTextField.sendKeys(ButtomCutOff);
	}
	
	public void TopCutOffClearMethod()
	{
		TopCutOffTextField.clear();
	}
	
	public void ButtomCutOffClearMethod()
	{
		ButtomCutOffTextField.clear();
	}
	
	public String TopCutOffGetTextMethod()
	{
		String topcutoff = TopCutOffTextField.getAttribute("value");
		return topcutoff;
	}
	
	public String ButtomCutOffGetTextMethod()
	{
		String buttomcutoff = ButtomCutOffTextField.getAttribute("value");
		return buttomcutoff;
	}
	
	//********************** PMTMaster White Space  ***************************//
	
	public void TopCutOffWhiteSpaceInitialMethod()
	{
		TopCutOffTextField.sendKeys(" ");
	}
	
	public void TopCutOffWhiteSpaceMiddleMethod()
	{
		TopCutOffTextField.sendKeys("5 0");
	}
	
	public void TopCutOffWhiteSpaceLastMethod()
	{
		TopCutOffTextField.sendKeys("50 ");
	}
	
	public void ButtomCutOffWhiteSpaceInitialMethod()
	{
		ButtomCutOffTextField.sendKeys(" ");
	}
	
	public void ButtomCutOffWhiteSpaceMiddleMethod()
	{
		ButtomCutOffTextField.sendKeys("5 0");
	}
	
	public void ButtomCutOffWhiteSpaceLastMethod()
	{
		ButtomCutOffTextField.sendKeys("50 ");
	}
	
	//********************** PMTMaster Special Char  ***************************//
	
	public void TopCutOffSpecialCharMethod()
	{
		TopCutOffTextField.sendKeys(SpecialChar);
	}
	
	public void ButtomCutOffSpecialCharMethod()
	{
		ButtomCutOffTextField.sendKeys(SpecialChar);
	}
	
	//********************** PMTMaster Sql Char  ***************************//
	
	public void TopCutOffSqlCharMethod()
	{
		TopCutOffTextField.sendKeys(SQLChar);
	}
	
	public void ButtomCutOffSqlCharMethod()
	{
		ButtomCutOffTextField.sendKeys(SQLChar);
	}
	
	//********************** PMTMaster Alphabets  ***************************//
	
	public void TopCutOffAlphabetMethod()
	{
		TopCutOffTextField.sendKeys(Alphabets);
	}
	
	public void ButtomCutOffAlphabetMethod()
	{
		ButtomCutOffTextField.sendKeys(Alphabets);
	}
	
	//********************** PMTMaster Dropdown  ***************************//
	
	public String CategoryGetTextMethod()
	{
		Select sel = new Select(CatgoryDropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	
	//********************** Document Type Mandatory  ***************************//
	
	@FindBy(id="txtdocumentTypeName")
	private WebElement DocumentTypeTextField;
	public void DocumentTypeTextFieldMethod()
	{
		DocumentTypeTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement DocumentTypeDescriptionTextField;
	public void DocumentTypeDescriptionTextFieldMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void DocumentTypeClearMethod()
	{
		DocumentTypeTextField.clear();
	}
	
	public void DocumentTypeDescriptionClearMethod()
	{
		DocumentTypeDescriptionTextField.clear();
	}
	
	public String DocumentTypeGetTextMethod()
	{
		String documentType = DocumentTypeTextField.getAttribute("value");
		return documentType;
	}
	
	public String DocumentTypeDescriptionGetTextMethod()
	{
		String documentTypedescription = DocumentTypeDescriptionTextField.getAttribute("value");
		return documentTypedescription;
	}
	
	//********************** DocumentType White Space  ***************************//
	
	public void DocumentTypeWhiteSpaceInitialMethod()
	{
		DocumentTypeTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DocumentTypeWhiteSpaceiMiddleMethod()
	{
		DocumentTypeTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void DocumentTypeDescriptionWhiteSpaceInitialMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DocumentTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** DocumentType Special Char  ***************************//
	
	public void DocumentTypeSpecialCharMethod()
	{
		DocumentTypeTextField.sendKeys(SpecialChar);
	}
	
	public void DocumentTypeDescriptionSpecialCharMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** DocumentType Sql Char  ***************************//
	
	public void DocumentTypeSqlCharMethod()
	{
		DocumentTypeTextField.sendKeys(SQLChar);
	}
	
	public void DocumentTypeDescriptionSqlCharMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** DocumentType AlphaNumeric  ***************************//
	
	public void DocumentTypeAlphaNumericMethod()
	{
		DocumentTypeTextField.sendKeys(AlphaNumeric);
	}
	
	public void DocumentTypeDescriptionAlphaNumericMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** DocumentType Length  ***************************//
	
	public void DocumentTypeLengthMoreThan50Method()
	{
		DocumentTypeTextField.sendKeys(MoreThan50);
	}
	
	public void DocumentTypeDescriptionLengthMoreThan200Method()
	{
		DocumentTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** DocumentType Duplicate  ***************************//
	
	public void DocumentTypeDuplicateMethod()
	{
		DocumentTypeTextField.sendKeys(RelationNameDuplicate);
	}

	public void DocumentTypeUniqueMethod()
	{
		DocumentTypeTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void DocumentTypeDescriptionDuplicateMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	public void DocumentTypeDifferentDescriptionMethod()
	{
		DocumentTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Nationality Mandatory  ***************************//
	
	@FindBy(id="txtNationalityName")
	private WebElement NationalityNameTextField;
	public void NationalityNameTextFieldMethod()
	{
		NationalityNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement NationalityDescriptionTextField;
	public void NationalityDescriptionTextFieldMethod()
	{
		NationalityDescriptionTextField.sendKeys(Description);
	}
	
	public void  NationalityNameClearMethod()
	{
		 NationalityNameTextField.clear();
	}
	
	public void  NationalityDescriptionClearMethod()
	{
		 NationalityDescriptionTextField.clear();
	}
	
	public String NationalityNameGetTextMethod()
	{
		String nationalityname =  NationalityNameTextField.getAttribute("value");
		return nationalityname;
	}
	
	public String NationalityDescriptionGetTextMethod()
	{
		String nationalitydescription = NationalityDescriptionTextField.getAttribute("value");
		return nationalitydescription;
	}
	
	//********************** Nationality White Space  ***************************//
	
	public void NationalityNameWhiteSpaceInitialMethod()
	{
		NationalityNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void NationalityNameWhiteSpaceiMiddleMethod()
	{
		NationalityNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void NationalityDescriptionWhiteSpaceInitialMethod()
	{
		NationalityDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void NationalityDescriptionWhiteSpaceiMiddleMethod()
	{
		NationalityDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Nationality Special Char  ***************************//
	
	public void NationalityNameSpecialCharMethod()
	{
		NationalityNameTextField.sendKeys(SpecialChar);
	}
	
	public void NationalityDescriptionSpecialCharMethod()
	{
		NationalityDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Nationality Sql Char  ***************************//
	
	public void NationalityNameSqlCharMethod()
	{
		NationalityNameTextField.sendKeys(SQLChar);
	}
	
	public void NationalityDescriptionSqlCharMethod()
	{
		NationalityDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Nationality AlphaNumeric  ***************************//
	
	public void NationalityNameAlphaNumericMethod()
	{
		NationalityNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void NationalityDescriptionAlphaNumericMethod()
	{
		NationalityDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Nationality Length  ***************************//
	
	public void NationalityNameLengthMoreThan50Method()
	{
		NationalityNameTextField.sendKeys(MoreThan50);
	}
	
	public void NationalityDescriptionLengthMoreThan200Method()
	{
		NationalityDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Nationality Duplicate  ***************************//
	
	public void NationalityNameDuplicateMethod()
	{
		NationalityNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void NationalityNameUniqueMethod()
	{
		NationalityNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void NationalityDescriptionDuplicateMethod()
	{
		NationalityDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	public void NationalityDifferentDescriptionMethod()
	{
		NationalityDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Residence Mandatory  ***************************//
	
	@FindBy(id="txtResidenceName")
	private WebElement ResidenceNameTextField;
	public void ResidenceNameTextFieldMethod()
	{
		ResidenceNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement ResidenceDescriptionTextField;
	public void ResidenceDescriptionTextFieldMethod()
	{
		ResidenceDescriptionTextField.sendKeys(Description);
	}
	
	public void  ResidenceNameClearMethod()
	{
		ResidenceNameTextField.clear();
	}
	
	public void  ResidenceDescriptionClearMethod()
	{
		ResidenceDescriptionTextField.clear();
	}
	
	public String ResidenceNameGetTextMethod()
	{
		String residencename =  ResidenceNameTextField.getAttribute("value");
		return residencename;
	}
	
	public String ResidenceDescriptionGetTextMethod()
	{
		String residencedescription = ResidenceDescriptionTextField.getAttribute("value");
		return residencedescription;
	}
	
	//********************** Residence White Space  ***************************//
	
	public void ResidenceNameWhiteSpaceInitialMethod()
	{
		ResidenceNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ResidenceNameWhiteSpaceiMiddleMethod()
	{
		ResidenceNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void ResidenceDescriptionWhiteSpaceInitialMethod()
	{
		ResidenceDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ResidenceDescriptionWhiteSpaceiMiddleMethod()
	{
		ResidenceDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Residence Special Char  ***************************//
	
	public void ResidenceNameSpecialCharMethod()
	{
		ResidenceNameTextField.sendKeys(SpecialChar);
	}
	
	public void ResidenceDescriptionSpecialCharMethod()
	{
		ResidenceDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Residence Sql Char  ***************************//
	
	public void ResidenceNameSqlCharMethod()
	{
		ResidenceNameTextField.sendKeys(SQLChar);
	}
	
	public void ResidenceDescriptionSqlCharMethod()
	{
		ResidenceDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Residence AlphaNumeric  ***************************//
	
	public void ResidenceNameAlphaNumericMethod()
	{
		ResidenceNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void ResidenceDescriptionAlphaNumericMethod()
	{
		ResidenceDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Residence Length  ***************************//
	
	public void ResidenceNameLengthMoreThan50Method()
	{
		ResidenceNameTextField.sendKeys(MoreThan50);
	}
	
	public void ResidenceDescriptionLengthMoreThan200Method()
	{
		ResidenceDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Residence Duplicate  ***************************//
	
	public void ResidenceNameDuplicateMethod()
	{
		ResidenceNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void ResidenceNameUniqueMethod()
	{
		ResidenceNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void ResidenceDescriptionDuplicateMethod()
	{
		ResidenceDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	public void ResidenceDifferentDescriptionMethod()
	{
		ResidenceDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** NeverAttendSchoolReason Mandatory  ***************************//

	@FindBy(id="txtReason")
	private WebElement NeverAttendSchoolReasonTextField;
	public void NeverAttendSchoolReasonTextFieldMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement NeverAttendSchoolReasonDescriptionTextField;
	public void NeverAttendSchoolReasonDescriptionTextFieldMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(Description);
	}
	
	public void  NeverAttendSchoolReasonClearMethod()
	{
		NeverAttendSchoolReasonTextField.clear();
	}
	
	public void  NeverAttendSchoolReasonDescriptionClearMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.clear();
	}
	
	public String NeverAttendSchoolReasonGetTextMethod()
	{
		String neverattendschoolreason =  NeverAttendSchoolReasonTextField.getAttribute("value");
		return neverattendschoolreason;
	}
	
	public String NeverAttendSchoolReasonDescriptionGetTextMethod()
	{
		String neverattendschoolreasondescription = NeverAttendSchoolReasonDescriptionTextField.getAttribute("value");
		return neverattendschoolreasondescription;
	}
	
	//********************** NeverAttendSchoolReason White Space  ***************************//
	
	public void NeverAttendSchoolReasonWhiteSpaceInitialMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void NeverAttendSchoolReasonWhiteSpaceMiddleMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void NeverAttendSchoolReasonDescriptionWhiteSpaceInitialMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void NeverAttendSchoolReasonDescriptionWhiteSpaceiMiddleMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** NeverAttendSchoolReason Special Char  ***************************//
	
	public void NeverAttendSchoolReasonSpecialCharMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(SpecialChar);
	}
	
	public void NeverAttendSchoolReasonDescriptionSpecialCharMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** NeverAttendSchoolReason Sql Char  ***************************//
	
	public void NeverAttendSchoolReasonSqlCharMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(SQLChar);
	}
	
	public void NeverAttendSchoolReasonDescriptionSqlCharMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** NeverAttendSchoolReason AlphaNumeric  ***************************//
	
	public void NeverAttendSchoolReasonAlphaNumericMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(AlphaNumeric);
	}
	
	public void NeverAttendSchoolReasonDescriptionAlphaNumericMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** NeverAttendSchoolReason Length  ***************************//
	
	public void NeverAttendSchoolReasonLengthMoreThan50Method()
	{
		NeverAttendSchoolReasonTextField.sendKeys(MoreThan50);
	}
	
	public void NeverAttendSchoolReasonDescriptionLengthMoreThan200Method()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** NeverAttendSchoolReason Duplicate  ***************************//
	
	public void NeverAttendSchoolReasonDuplicateMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(RelationNameDuplicate);
	}
	public void NeverAttendSchoolReasonUniqueMethod()
	{
		NeverAttendSchoolReasonTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void NeverAttendSchoolReasonDescriptionDuplicateMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys("Description");
	}
	public void NeverAttendSchoolReasonDifferentDescriptionMethod()
	{
		NeverAttendSchoolReasonDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** MaritalStatus Mandatory  ***************************//

	@FindBy(id="txtMaritalStatusName")
	private WebElement MaritalStatusNameTextField;
	public void MaritalStatusNameTextFieldMethod()
	{
		MaritalStatusNameTextField.sendKeys(RelationName);
	}
	
	public void  MaritalStatusNameClearMethod()
	{
		MaritalStatusNameTextField.clear();
	}
	
	public String MaritalStatusNameGetTextMethod()
	{
		String maritalstatus =  MaritalStatusNameTextField.getAttribute("value");
		return maritalstatus;
	}
	
	//********************** MaritalStatus White Space  ***************************//
	
	public void MaritalStatusNameWhiteSpaceInitialMethod()
	{
		MaritalStatusNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MaritalStatusNameWhiteSpaceMiddleMethod()
	{
		MaritalStatusNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** MaritalStatus Special Char  ***************************//
	
	public void MaritalStatusNameSpecialCharMethod()
	{
		MaritalStatusNameTextField.sendKeys(SpecialChar);
	}
	
	//********************** MaritalStatus Sql Char  ***************************//
	
	public void MaritalStatusNameSqlCharMethod()
	{
		MaritalStatusNameTextField.sendKeys(SQLChar);
	}
	
	//********************** MaritalStatus AlphaNumeric  ***************************//
	
	public void MaritalStatusNameAlphaNumericMethod()
	{
		MaritalStatusNameTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** MaritalStatus Length  ***************************//
	
	public void MaritalStatusNameLengthMoreThan50Method()
	{
		MaritalStatusNameTextField.sendKeys(MoreThan50);
	}
	
	//********************** Level Grade Mandatory  ***************************//
	
	@FindBy(id="txtGradeName")
	private WebElement GradeNameTextField;
	public void GradeNameTextFieldMethod()
	{
		GradeNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement GradeNameDescriptionTextField;
	public void GradeNameDescriptionTextFieldMethod()
	{
		GradeNameDescriptionTextField.sendKeys(Description);
	}
	
	public void GradeNameClearMethod()
	{
		GradeNameTextField.clear();
	}
	
	public void GradeNameDescriptionClearMethod()
	{
		GradeNameDescriptionTextField.clear();
	}
	
	public String GradeNameGetTextMethod()
	{
		String gradename = GradeNameTextField.getAttribute("value");
		return gradename;
	}
	
	public String GradeNameDescriptionGetTextMethod()
	{
		String gradenamedescription = GradeNameDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Level Grade White Space  ***************************//
	
	public void GradeNameWhiteSpaceInitialMethod()
	{
		GradeNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void GradeNameWhiteSpaceiMiddleMethod()
	{
		GradeNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void GradeNameDescriptionWhiteSpaceInitialMethod()
	{
		GradeNameDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void GradeNameDescriptionWhiteSpaceiMiddleMethod()
	{
		GradeNameDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Level Grade Special Char  ***************************//
	
	public void GradeNameSpecialCharMethod()
	{
		GradeNameTextField.sendKeys(SpecialChar);
	}
	
	public void GradeNameDescriptionSpecialCharMethod()
	{
		GradeNameDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Level Grade Sql Char  ***************************//
	
	public void GradeNameSqlCharMethod()
	{
		GradeNameTextField.sendKeys(SQLChar);
	}
	
	public void GradeNameDescriptionSqlCharMethod()
	{
		GradeNameDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Level Grade AlphaNumeric  ***************************//
	
	public void GradeNameAlphaNumericMethod()
	{
		GradeNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void GradeNameDescriptionAlphaNumericMethod()
	{
		GradeNameDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Level Grade Length  ***************************//
	
	public void GradeNameLengthMoreThan50Method()
	{
		GradeNameTextField.sendKeys(MoreThan50);
	}
	
	public void GradeNameDescriptionLengthMoreThan200Method()
	{
		GradeNameDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Level Grade Duplicate  ***************************//
	
	public void GradeNameDuplicateMethod()
	{
		GradeNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void GradeNameUniqueMethod()
	{
		GradeNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void GradeNameDescriptionDuplicateMethod()
	{
		GradeNameDescriptionTextField.sendKeys("Description");
	}
	public void GradeDifferentDescriptionMethod()
	{
		GradeNameDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Reason Stop School Mandatory  ***************************//
	
	@FindBy(id="txtReason")
	private WebElement ReasonTextField;
	public void ReasonTextFieldMethod()
	{
		ReasonTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement ReasonDescriptionTextField;
	public void ReasonDescriptionTextFieldMethod()
	{
		ReasonDescriptionTextField.sendKeys(Description);
	}
	
	public void ReasonClearMethod()
	{
		ReasonTextField.clear();
	}
	
	public void ReasonDescriptionClearMethod()
	{
		ReasonDescriptionTextField.clear();
	}
	
	public String ReasonGetTextMethod()
	{
		String reason = ReasonTextField.getAttribute("value");
		return reason;
	}
	
	public String ReasonDescriptionGetTextMethod()
	{
		String reasondescription = ReasonDescriptionTextField.getAttribute("value");
		return reasondescription;
	}
	
	//********************** Reason Stop School White Space  ***************************//
	
	public void ReasonWhiteSpaceInitialMethod()
	{
		ReasonTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ReasonWhiteSpaceiMiddleMethod()
	{
		ReasonTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void ReasonDescriptionWhiteSpaceInitialMethod()
	{
		ReasonDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ReasonDescriptionWhiteSpaceiMiddleMethod()
	{
		ReasonDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Reason Stop School Special Char  ***************************//
	
	public void ReasonSpecialCharMethod()
	{
		ReasonTextField.sendKeys(SpecialChar);
	}
	
	public void ReasonDescriptionSpecialCharMethod()
	{
		ReasonDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Reason Stop School Sql Char  ***************************//
	
	public void ReasonSqlCharMethod()
	{
		ReasonTextField.sendKeys(SQLChar);
	}
	
	public void ReasonDescriptionSqlCharMethod()
	{
		ReasonDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Reason Stop School AlphaNumeric  ***************************//
	
	public void ReasonAlphaNumericMethod()
	{
		ReasonTextField.sendKeys(AlphaNumeric);
	}
	
	public void ReasonDescriptionAlphaNumericMethod()
	{
		ReasonDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Reason Stop School Length  ***************************//
	
	public void ReasonLengthMoreThan50Method()
	{
		ReasonTextField.sendKeys(MoreThan50);
	}
	
	public void ReasonDescriptionLengthMoreThan200Method()
	{
		ReasonDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Reason Stop School Duplicate  ***************************//
	
	public void ReasonDuplicateMethod()
	{
		ReasonTextField.sendKeys(RelationNameDuplicate);
	}
	public void ReasonUniqueMethod()
	{
		ReasonTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void ReasonDescriptionDuplicateMethod()
	{
		ReasonDescriptionTextField.sendKeys("Description");
	}
	public void ReasonDifferentDescriptionMethod()
	{
		ReasonDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Seeing Difficulty Mandatory  ***************************//
	
	@FindBy(id="txtname")
	private WebElement SeeingDifficultyTextField;
	public void SeeingDifficultyTextFieldMethod()
	{
		SeeingDifficultyTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement SeeingDifficultyDescriptionTextField;
	public void SeeingDifficultyDescriptionTextFieldMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(Description);
	}
	
	public void SeeingDifficultyClearMethod()
	{
		SeeingDifficultyTextField.clear();
	}
	
	public void SeeingDifficultyDescriptionClearMethod()
	{
		SeeingDifficultyDescriptionTextField.clear();
	}
	
	public String SeeingDifficultyGetTextMethod()
	{
		String seeingdifficulty = SeeingDifficultyTextField.getAttribute("value");
		return seeingdifficulty;
	}
	
	public String SeeingDifficultyDescriptionGetTextMethod()
	{
		String seeingdifficultydescription = SeeingDifficultyDescriptionTextField.getAttribute("value");
		return seeingdifficultydescription;
	}
	
	//********************** Seeing Difficulty White Space  ***************************//
	
	public void SeeingDifficultyWhiteSpaceInitialMethod()
	{
		SeeingDifficultyTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void SeeingDifficultyWhiteSpaceiMiddleMethod()
	{
		SeeingDifficultyTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void SeeingDifficultyDescriptionWhiteSpaceInitialMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void SeeingDifficultyDescriptionWhiteSpaceiMiddleMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Seeing Difficulty Special Char  ***************************//
	
	public void SeeingDifficultySpecialCharMethod()
	{
		SeeingDifficultyTextField.sendKeys(SpecialChar);
	}
	
	public void SeeingDifficultyDescriptionSpecialCharMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Seeing Difficulty Sql Char  ***************************//
	
	public void SeeingDifficultySqlCharMethod()
	{
		SeeingDifficultyTextField.sendKeys(SQLChar);
	}
	
	public void SeeingDifficultyDescriptionSqlCharMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Seeing Difficulty AlphaNumeric  ***************************//
	
	public void SeeingDifficultyAlphaNumericMethod()
	{
		SeeingDifficultyTextField.sendKeys(AlphaNumeric);
	}
	
	public void SeeingDifficultyDescriptionAlphaNumericMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Seeing Difficulty Length  ***************************//
	
	public void SeeingDifficultyLengthMoreThan50Method()
	{
		SeeingDifficultyTextField.sendKeys(MoreThan50);
	}
	
	public void SeeingDifficultyDescriptionLengthMoreThan200Method()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Seeing Difficulty Duplicate  ***************************//
	
	public void SeeingDifficultyDuplicateMethod()
	{
		SeeingDifficultyTextField.sendKeys(RelationNameDuplicate);
	}
	public void SeeingDifficultyUniqueMethod()
	{
		SeeingDifficultyTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void SeeingDifficultyDescriptionDuplicateMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys("Description");
	}
	public void SeeingDifficultyDifferentDescriptionMethod()
	{
		SeeingDifficultyDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Chronic Illness Mandatory  ***************************//
	
	@FindBy(id="txtdiseasename")
	private WebElement DiseaseTextField;
	public void DiseaseTextFieldMethod()
	{
		DiseaseTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement DiseaseDescriptionTextField;
	public void DiseaseDescriptionTextFieldMethod()
	{
		DiseaseDescriptionTextField.sendKeys(Description);
	}
	
	public void DiseaseClearMethod()
	{
		DiseaseTextField.clear();
	}
	
	public void DiseaseDescriptionClearMethod()
	{
		DiseaseDescriptionTextField.clear();
	}
	
	public String DiseaseGetTextMethod()
	{
		String disease = DiseaseTextField.getAttribute("value");
		return disease;
	}
	
	public String DiseaseDescriptionGetTextMethod()
	{
		String diseasedescription = DiseaseDescriptionTextField.getAttribute("value");
		return diseasedescription;
	}
	
	//********************** Chronic Illness White Space  ***************************//
	
	public void DiseaseWhiteSpaceInitialMethod()
	{
		DiseaseTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DiseaseWhiteSpaceiMiddleMethod()
	{
		DiseaseTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void DiseaseDescriptionWhiteSpaceInitialMethod()
	{
		DiseaseDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DiseaseDescriptionWhiteSpaceiMiddleMethod()
	{
		DiseaseDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Chronic Illness Special Char  ***************************//
	
	public void DiseaseSpecialCharMethod()
	{
		DiseaseTextField.sendKeys(SpecialChar);
	}
	
	public void DiseaseDescriptionSpecialCharMethod()
	{
		DiseaseDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Chronic Illness Sql Char  ***************************//
	
	public void DiseaseSqlCharMethod()
	{
		DiseaseTextField.sendKeys(SQLChar);
	}
	
	public void DiseaseDescriptionSqlCharMethod()
	{
		DiseaseDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Chronic Illness AlphaNumeric  ***************************//
	
	public void DiseaseAlphaNumericMethod()
	{
		DiseaseTextField.sendKeys(AlphaNumeric);
	}
	
	public void DiseaseDescriptionAlphaNumericMethod()
	{
		DiseaseDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Chronic Illness Length  ***************************//
	
	public void DiseaseLengthMoreThan50Method()
	{
		DiseaseTextField.sendKeys(MoreThan50);
	}
	
	public void DiseaseDescriptionLengthMoreThan200Method()
	{
		DiseaseDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Chronic Illness Duplicate  ***************************//
	
	public void DiseaseDuplicateMethod()
	{
		DiseaseTextField.sendKeys(RelationNameDuplicate);
	}
	public void DiseaseUniqueMethod()
	{
		DiseaseTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void DiseaseDescriptionDuplicateMethod()
	{
		DiseaseDescriptionTextField.sendKeys("Description");
	}
	public void DiseaseDifferentDescriptionMethod()
	{
		DiseaseDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Wall Material Mandatory  ***************************//
	
	@FindBy(id="ddlCatgory")
	private WebElement WallMaterialCatgoryDropDown;
	public void WallMaterialCatgoryDropDownMethod()
	{
		selectbyvisibletext(WallMaterialCatgoryDropDown, WallMaterialCatgory);
	}
	
	@FindBy(id="txtWallSubCategoryName")
	private WebElement WallMaterialNameTextField;
	public void WallMaterialNameTextFieldMethod()
	{
		WallMaterialNameTextField.sendKeys(Description);
	}
	
	public void WallMaterialNameClearMethod()
	{
		WallMaterialNameTextField.clear();
	}
	
	public String WallMaterialNameGetTextMethod()
	{
		String wallsubcategoryname = WallMaterialNameTextField.getAttribute("value");
		return wallsubcategoryname;
	}
	
	//********************** Wall Material White Space  ***************************//
	
	public void WallMaterialNameWhiteSpaceInitialMethod()
	{
		WallMaterialNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WallMaterialNameWhiteSpaceMiddleMethod()
	{
		WallMaterialNameTextField.sendKeys(WhiteSpaceMiddle);
	}

	//********************** Wall Material Special Char  ***************************//
	
	public void WallMaterialNameSpecialCharMethod()
	{
		WallMaterialNameTextField.sendKeys(SpecialChar);
	}
	
	//********************** Wall Material Sql Char  ***************************//
	
	public void WallMaterialNameSqlCharMethod()
	{
		WallMaterialNameTextField.sendKeys(SQLChar);
	}
	
	//********************** Wall Material AlphaNumeric  ***************************//
	
	public void WallMaterialNameAlphaNumericMethod()
	{
		WallMaterialNameTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Wall Material Length  ***************************//
	
	public void WallMaterialNameLengthMoreThan50Method()
	{
		WallMaterialNameTextField.sendKeys(MoreThan50);
	}
	
	//********************** Wall Material Dropdown  ***************************//
	
	public String WallMaterialCatgoryGetTextMethod()
	{
		Select sel = new Select(WallMaterialCatgoryDropDown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	
	//********************** Main Job Activity Mandatory  ***************************//
	
	@FindBy(id="txtactivityname")
	private WebElement MainJobActivityNameTextField;
	public void MainJobActivityNameTextFieldMethod()
	{
		MainJobActivityNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement MainJobActivityDescriptionTextField;
	public void MainJobActivityDescriptionTextFieldMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(Description);
	}
	
	public void MainJobActivityNameClearMethod()
	{
		MainJobActivityNameTextField.clear();
	}
	
	public void MainJobActivityDescriptionClearMethod()
	{
		MainJobActivityDescriptionTextField.clear();
	}
	
	public String MainJobActivityNameGetTextMethod()
	{
		String gradename = MainJobActivityNameTextField.getAttribute("value");
		return gradename;
	}
	
	public String MainJobActivityDescriptionGetTextMethod()
	{
		String gradenamedescription = MainJobActivityDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Main Job Activity White Space  ***************************//
	
	public void MainJobActivityNameWhiteSpaceInitialMethod()
	{
		MainJobActivityNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MainJobActivityNameWhiteSpaceiMiddleMethod()
	{
		MainJobActivityNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void MainJobActivityDescriptionWhiteSpaceInitialMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MainJobActivityDescriptionWhiteSpaceiMiddleMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Main Job Activity Special Char  ***************************//
	
	public void MainJobActivityNameSpecialCharMethod()
	{
		MainJobActivityNameTextField.sendKeys(SpecialChar);
	}
	
	public void MainJobActivityDescriptionSpecialCharMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Main Job Activity Sql Char  ***************************//
	
	public void MainJobActivityNameSqlCharMethod()
	{
		MainJobActivityNameTextField.sendKeys(SQLChar);
	}
	
	public void MainJobActivityDescriptionSqlCharMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Main Job Activity AlphaNumeric  ***************************//
	
	public void MainJobActivityNameAlphaNumericMethod()
	{
		MainJobActivityNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void MainJobActivityDescriptionAlphaNumericMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Main Job Activity Length  ***************************//
	
	public void MainJobActivityNameLengthMoreThan50Method()
	{
		MainJobActivityNameTextField.sendKeys(MoreThan50);
	}
	
	public void MainJobActivityDescriptionLengthMoreThan200Method()
	{
		MainJobActivityDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Level Grade Duplicate  ***************************//
	
	public void MainJobActivityNameDuplicateMethod()
	{
		MainJobActivityNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void MainJobActivityNameUniqueMethod()
	{
		MainJobActivityNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void MainJobActivityDescriptionDuplicateMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys("Description");
	}
	public void  MainJobActivityDifferentDescriptionMethod()
	{
		MainJobActivityDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Working Frequency Mandatory  ***************************//
	
	@FindBy(id="txtname")
	private WebElement WorkingFrequencyNameTextField;
	public void WorkingFrequencyNameTextFieldMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement WorkingFrequencyDescriptionTextField;
	public void WorkingFrequencyDescriptionTextFieldMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(Description);
	}
	
	public void WorkingFrequencyNameClearMethod()
	{
		WorkingFrequencyNameTextField.clear();
	}
	
	public void WorkingFrequencyDescriptionClearMethod()
	{
		WorkingFrequencyDescriptionTextField.clear();
	}
	
	public String WorkingFrequencyNameGetTextMethod()
	{
		String gradename = WorkingFrequencyNameTextField.getAttribute("value");
		return gradename;
	}
	
	public String WorkingFrequencyDescriptionGetTextMethod()
	{
		String gradenamedescription = WorkingFrequencyDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Working Frequency White Space  ***************************//
	
	public void WorkingFrequencyNameWhiteSpaceInitialMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WorkingFrequencyNameWhiteSpaceiMiddleMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void WorkingFrequencyDescriptionWhiteSpaceInitialMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WorkingFrequencyDescriptionWhiteSpaceiMiddleMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Working Frequency Special Char  ***************************//
	
	public void WorkingFrequencyNameSpecialCharMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(SpecialChar);
	}
	
	public void WorkingFrequencyDescriptionSpecialCharMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Working Frequency Sql Char  ***************************//
	
	public void WorkingFrequencyNameSqlCharMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(SQLChar);
	}
	
	public void WorkingFrequencyDescriptionSqlCharMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Working Frequency AlphaNumeric  ***************************//
	
	public void WorkingFrequencyNameAlphaNumericMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void WorkingFrequencyDescriptionAlphaNumericMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Working Frequency Length  ***************************//
	
	public void WorkingFrequencyNameLengthMoreThan50Method()
	{
		WorkingFrequencyNameTextField.sendKeys(MoreThan50);
	}
	
	public void WorkingFrequencyDescriptionLengthMoreThan200Method()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Working Frequency Duplicate  ***************************//
	
	public void WorkingFrequencyNameDuplicateMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void WorkingFrequencyNameUniqueMethod()
	{
		WorkingFrequencyNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void WorkingFrequencyDescriptionDuplicateMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(Description);
	}
	public void WorkingFrequencyDifferentDescriptionMethod()
	{
		WorkingFrequencyDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Working Sector Mandatory  ***************************//
	
	@FindBy(id="txtsectorname")
	private WebElement WorkingSectorNameTextField;
	public void WorkingSectorNameTextFieldMethod()
	{
		WorkingSectorNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement WorkingSectorDescriptionTextField;
	public void WorkingSectorDescriptionTextFieldMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(Description);
	}
	
	public void WorkingSectorNameClearMethod()
	{
		WorkingSectorNameTextField.clear();
	}
	
	public void WorkingSectorDescriptionClearMethod()
	{
		WorkingSectorDescriptionTextField.clear();
	}
	
	public String WorkingSectorNameGetTextMethod()
	{
		String gradename = WorkingSectorNameTextField.getAttribute("value");
		return gradename;
	}
	
	public String WorkingSectorDescriptionGetTextMethod()
	{
		String gradenamedescription = WorkingSectorDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Working Sector White Space  ***************************//
	
	public void WorkingSectorNameWhiteSpaceInitialMethod()
	{
		WorkingSectorNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WorkingSectorNameWhiteSpaceiMiddleMethod()
	{
		WorkingSectorNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void WorkingSectorDescriptionWhiteSpaceInitialMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WorkingSectorDescriptionWhiteSpaceiMiddleMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Working Sector Special Char  ***************************//
	
	public void WorkingSectorNameSpecialCharMethod()
	{
		WorkingSectorNameTextField.sendKeys(SpecialChar);
	}
	
	public void WorkingSectorDescriptionSpecialCharMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Working Sector Sql Char  ***************************//
	
	public void WorkingSectorNameSqlCharMethod()
	{
		WorkingSectorNameTextField.sendKeys(SQLChar);
	}
	
	public void WorkingSectorDescriptionSqlCharMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Working Sector AlphaNumeric  ***************************//
	
	public void WorkingSectorNameAlphaNumericMethod()
	{
		WorkingSectorNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void WorkingSectorDescriptionAlphaNumericMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Working Sector Length  ***************************//
	
	public void WorkingSectorNameLengthMoreThan50Method()
	{
		WorkingSectorNameTextField.sendKeys(MoreThan50);
	}
	
	public void WorkingSectorDescriptionLengthMoreThan200Method()
	{
		WorkingSectorDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Working Sector Duplicate  ***************************//
	
	public void WorkingSectorNameDuplicateMethod()
	{
		WorkingSectorNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void WorkingSectorNameUniqueMethod()
	{
		WorkingSectorNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void WorkingSectorDescriptionDuplicateMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys("Description");
	}
	public void WorkingSectorDifferentDescriptionMethod()
	{
		WorkingSectorDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Working Status Mandatory  ***************************//
	
	@FindBy(id="txtstatusname")
	private WebElement WorkingStatusNameTextField;
	public void WorkingStatusNameTextFieldMethod()
	{
		WorkingStatusNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement WorkingStatusDescriptionTextField;
	public void WorkingStatusDescriptionTextFieldMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(Description);
	}
	
	public void WorkingStatusNameClearMethod()
	{
		WorkingStatusNameTextField.clear();
	}
	
	public void WorkingStatusDescriptionClearMethod()
	{
		WorkingStatusDescriptionTextField.clear();
	}
	
	public String WorkingStatusNameGetTextMethod()
	{
		String gradename = WorkingStatusNameTextField.getAttribute("value");
		return gradename;
	}
	
	public String WorkingStatusDescriptionGetTextMethod()
	{
		String gradenamedescription = WorkingStatusDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Working Status White Space  ***************************//
	
	public void WorkingStatusNameWhiteSpaceInitialMethod()
	{
		WorkingStatusNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WorkingStatusNameWhiteSpaceiMiddleMethod()
	{
		WorkingStatusNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void WorkingStatusDescriptionWhiteSpaceInitialMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void WorkingStatusDescriptionWhiteSpaceiMiddleMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Working Status Special Char  ***************************//
	
	public void WorkingStatusNameSpecialCharMethod()
	{
		WorkingStatusNameTextField.sendKeys(SpecialChar);
	}
	
	public void WorkingStatusDescriptionSpecialCharMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Working Status Sql Char  ***************************//
	
	public void WorkingStatusNameSqlCharMethod()
	{
		WorkingStatusNameTextField.sendKeys(SQLChar);
	}
	
	public void WorkingStatusDescriptionSqlCharMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Working Status AlphaNumeric  ***************************//
	
	public void WorkingStatusNameAlphaNumericMethod()
	{
		WorkingStatusNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void WorkingStatusDescriptionAlphaNumericMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Working Status Length  ***************************//
	
	public void WorkingStatusNameLengthMoreThan50Method()
	{
		WorkingStatusNameTextField.sendKeys(MoreThan50);
	}
	
	public void WorkingStatusDescriptionLengthMoreThan200Method()
	{
		WorkingStatusDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Working Status Duplicate  ***************************//
	
	public void WorkingStatusNameDuplicateMethod()
	{
		WorkingStatusNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void WorkingStatusNameUniqueMethod()
	{
		WorkingStatusNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void WorkingStatusDescriptionDuplicateMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys("Description");
	}
	public void WorkingStatusDifferentDescriptionMethod()
	{
		WorkingStatusDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** Reason Not Working Mandatory  ***************************//
	
	@FindBy(id="txtReason")
	private WebElement ReasonNotWorkingTextField;
	public void ReasonNotWorkingTextFieldMethod()
	{
		ReasonNotWorkingTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement ReasonNotWorkingDescriptionTextField;
	public void ReasonNotWorkingDescriptionTextFieldMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(Description);
	}
	
	public void ReasonNotWorkingClearMethod()
	{
		ReasonNotWorkingTextField.clear();
	}
	
	public void ReasonNotWorkingDescriptionClearMethod()
	{
		ReasonNotWorkingDescriptionTextField.clear();
	}
	
	public String ReasonNotWorkingGetTextMethod()
	{
		String gradename = ReasonNotWorkingTextField.getAttribute("value");
		return gradename;
	}
	
	public String ReasonNotWorkingDescriptionGetTextMethod()
	{
		String gradenamedescription = ReasonNotWorkingDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Reason Not Working White Space  ***************************//
	
	public void ReasonNotWorkingWhiteSpaceInitialMethod()
	{
		ReasonNotWorkingTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ReasonNotWorkingWhiteSpaceiMiddleMethod()
	{
		ReasonNotWorkingTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void ReasonNotWorkingDescriptionWhiteSpaceInitialMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ReasonNotWorkingDescriptionWhiteSpaceiMiddleMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Reason Not Working Special Char  ***************************//
	
	public void ReasonNotWorkingSpecialCharMethod()
	{
		ReasonNotWorkingTextField.sendKeys(SpecialChar);
	}
	
	public void ReasonNotWorkingDescriptionSpecialCharMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Reason Not Working Sql Char  ***************************//
	
	public void ReasonNotWorkingSqlCharMethod()
	{
		ReasonNotWorkingTextField.sendKeys(SQLChar);
	}
	
	public void ReasonNotWorkingDescriptionSqlCharMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Reason Not Working AlphaNumeric  ***************************//
	
	public void ReasonNotWorkingAlphaNumericMethod()
	{
		ReasonNotWorkingTextField.sendKeys(AlphaNumeric);
	}
	
	public void ReasonNotWorkingDescriptionAlphaNumericMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Reason Not Working Length  ***************************//
	
	public void ReasonNotWorkingLengthMoreThan50Method()
	{
		ReasonNotWorkingTextField.sendKeys(MoreThan50);
	}
	
	public void ReasonNotWorkingDescriptionLengthMoreThan200Method()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Reason Not Working Duplicate  ***************************//
	
	public void ReasonNotWorkingDuplicateMethod()
	{
		ReasonNotWorkingTextField.sendKeys(RelationNameDuplicate);
	}
	public void ReasonNotWorkingUniqueMethod()
	{
		ReasonNotWorkingTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void ReasonNotWorkingDescriptionDuplicateMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(Description);
	}
	public void ReasonNotWorkingDifferentDescriptionMethod()
	{
		ReasonNotWorkingDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Cooking Fuel Name Mandatory  ***************************//
	
	@FindBy(id="txtCookingFuelName")
	private WebElement CookingFuelNameTextField;
	public void CookingFuelNameTextFieldMethod()
	{
		CookingFuelNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement CookingFuelDescriptionTextField;
	public void CookingFuelNameDescriptionTextFieldMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(Description);
	}
	
	public void CookingFuelNameClearMethod()
	{
		CookingFuelNameTextField.clear();
	}
	
	public void CookingFuelDescriptionClearMethod()
	{
		CookingFuelDescriptionTextField.clear();
	}
	
	public String CookingFuelNameGetTextMethod()
	{
		String gradename = CookingFuelNameTextField.getAttribute("value");
		return gradename;
	}
	
	public String CookingFuelDescriptionGetTextMethod()
	{
		String gradenamedescription = CookingFuelDescriptionTextField.getAttribute("value");
		return gradenamedescription;
	}
	
	//********************** Cooking Fuel Name White Space  ***************************//
	
	public void CookingFuelNameWhiteSpaceInitialMethod()
	{
		CookingFuelNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void CookingFuelNameWhiteSpaceiMiddleMethod()
	{
		CookingFuelNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void CookingFuelDescriptionWhiteSpaceInitialMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void CookingFuelDescriptionWhiteSpaceiMiddleMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Cooking Fuel Name Special Char  ***************************//
	
	public void CookingFuelNameSpecialCharMethod()
	{
		CookingFuelNameTextField.sendKeys(SpecialChar);
	}
	
	public void CookingFuelDescriptionSpecialCharMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Cooking Fuel Name Sql Char  ***************************//
	
	public void CookingFuelNameSqlCharMethod()
	{
		CookingFuelNameTextField.sendKeys(SQLChar);
	}
	
	public void CookingFuelDescriptionSqlCharMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Cooking Fuel Name AlphaNumeric  ***************************//
	
	public void CookingFuelNameAlphaNumericMethod()
	{
		CookingFuelNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void CookingFuelDescriptionAlphaNumericMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Cooking Fuel Name Length  ***************************//
	
	public void CookingFuelNameLengthMoreThan50Method()
	{
		CookingFuelNameTextField.sendKeys(MoreThan50);
	}
	
	public void CookingFuelDescriptionLengthMoreThan200Method()
	{
		CookingFuelDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Cooking Fuel Name Duplicate  ***************************//
	
	public void CookingFuelNameDuplicateMethod()
	{
		CookingFuelNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void CookingFuelNameUniqueMethod()
	{
		CookingFuelNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	public void CookingFuelDescriptionDuplicateMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(Description);
	}
	public void CookingFuelDifferentDescriptionMethod()
	{
		CookingFuelDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Floor Material Mandatory  ***************************//
	
	@FindBy(id="ddlCatgory")
	private WebElement FloorMaterialCategoryDropdown;
	public void FloorMaterialCategoryMethod()
	{
		selectbyvisibletext(FloorMaterialCategoryDropdown, FloorMaterial);
	}
	
	@FindBy(id="txtFloorSubCategoryName")
	private WebElement FloorMaterialNameTextField;
	public void FloorMaterialNameMethod()
	{
		FloorMaterialNameTextField.sendKeys(Description);
	}
	
	public void FloorMaterialNameClearMethod()
	{
		FloorMaterialNameTextField.clear();
	}
	
	public String FloorMaterialNameGetTextMethod()
	{
		String name = FloorMaterialNameTextField.getAttribute("value");
		return name;
	}
	
	//********************** Floor Material White Space  ***************************//
	
	public void FloorMaterialNameWhiteSpaceInitialMethod()
	{
		FloorMaterialNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void FloorMaterialNameWhiteSpaceiMiddleMethod()
	{
		FloorMaterialNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Floor Material Special Char  ***************************//
	
	public void FloorMaterialNameSpecialCharMethod()
	{
		FloorMaterialNameTextField.sendKeys(SpecialChar);
	}
	
	//********************** Floor Material Sql Char  ***************************//
	
	public void FloorMaterialNameSqlCharMethod()
	{
		FloorMaterialNameTextField.sendKeys(SQLChar);
	}
	
	//********************** Floor Material AlphaNumeric  ***************************//
	
	public void FloorMaterialNameAlphaNumericMethod()
	{
		FloorMaterialNameTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Floor Material Length  ***************************//
	
	public void FloorMaterialNameLengthMoreThan50Method()
	{
		FloorMaterialNameTextField.sendKeys(MoreThan50);
	}
	
	//********************** Floor Material Dropdown  ***************************//
	
	public String FloorMaterialCategoryGetTextMethod()
	{
		Select sel = new Select(FloorMaterialCategoryDropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	
	//********************** Roof Material Mandatory  ***************************//
	
	@FindBy(id="ddlCatgory")
	private WebElement RoofMaterialCategoryDropdown;
	public void RoofMaterialCategoryMethod()
	{
		selectbyvisibletext(RoofMaterialCategoryDropdown, RoofMaterial);
	}
	
	@FindBy(id="txtRoofSubCategoryName")
	private WebElement RoofMaterialNameTextField;
	public void RoofMaterialNameMethod()
	{
		RoofMaterialNameTextField.sendKeys(Description);
	}
	
	public void RoofMaterialNameClearMethod()
	{
		RoofMaterialNameTextField.clear();
	}
	
	public String RoofMaterialNameGetTextMethod()
	{
		String name = RoofMaterialNameTextField.getAttribute("value");
		return name;
	}
	
	//********************** Roof Material White Space  ***************************//
	
	public void RoofMaterialNameWhiteSpaceInitialMethod()
	{
		RoofMaterialNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void RoofMaterialNameWhiteSpaceiMiddleMethod()
	{
		RoofMaterialNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Roof Material Special Char  ***************************//
	
	public void RoofMaterialNameSpecialCharMethod()
	{
		RoofMaterialNameTextField.sendKeys(SpecialChar);
	}
	
	//********************** Roof Material Sql Char  ***************************//
	
	public void RoofMaterialNameSqlCharMethod()
	{
		RoofMaterialNameTextField.sendKeys(SQLChar);
	}
	
	//********************** Roof Material AlphaNumeric  ***************************//
	
	public void RoofMaterialNameAlphaNumericMethod()
	{
		RoofMaterialNameTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Roof Material Length  ***************************//
	
	public void RoofMaterialNameLengthMoreThan50Method()
	{
		RoofMaterialNameTextField.sendKeys(MoreThan50);
	}
	
	//********************** Roof Material Dropdown  ***************************//
	
	public String RoofMaterialCategoryGetTextMethod()
	{
		Select sel = new Select(RoofMaterialCategoryDropdown);
		String option = sel.getFirstSelectedOption().getText();
		return option;
	}
	
	//********************** Distance Type Mandatory  ***************************//
	
	@FindBy(id="txtTransportationModeName")
	private WebElement TransportationModeNameTextField;
	public void TransportationModeNameTextFieldMethod()
	{
		TransportationModeNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement TransportationModeDescriptionTextField;
	public void TransportationModeDescriptionTextFieldMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(Description);
	}
	
	public void TransportationModeNameClearMethod()
	{
		TransportationModeNameTextField.clear();
	}
	
	public void TransportationModeDescriptionClearMethod()
	{
		TransportationModeDescriptionTextField.clear();
	}
	
	public String TransportationModeNameGetTextMethod()
	{
		String name = TransportationModeNameTextField.getAttribute("value");
		return name;
	}
	
	public String TransportationModeDescriptionGetTextMethod()
	{
		String description = TransportationModeDescriptionTextField.getAttribute("value");
		return description;
	}
	
	//********************** Distance Type White Space  ***************************//
	
	public void TransportationModeNameWhiteSpaceInitialMethod()
	{
		TransportationModeNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void TransportationModeNameWhiteSpaceiMiddleMethod()
	{
		TransportationModeNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void TransportationModeDescriptionWhiteSpaceInitialMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void TransportationModeDescriptionWhiteSpaceiMiddleMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Distance Type Special Char  ***************************//
	
	public void TransportationModeNameSpecialCharMethod()
	{
		TransportationModeNameTextField.sendKeys(SpecialChar);
	}
	
	public void TransportationModeDescriptionSpecialCharMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Distance Type Sql Char  ***************************//
	
	public void TransportationModeNameSqlCharMethod()
	{
		TransportationModeNameTextField.sendKeys(SQLChar);
	}
	
	public void TransportationModeDescriptionSqlCharMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Distance Type AlphaNumeric  ***************************//
	
	public void TransportationModeNameAlphaNumericMethod()
	{
		TransportationModeNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void TransportationModeDescriptionAlphaNumericMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Distance Type Length  ***************************//
	
	public void TransportationModeNameLengthMoreThan50Method()
	{
		TransportationModeNameTextField.sendKeys(MoreThan50);
	}
	
	public void TransportationModeDescriptionLengthMoreThan200Method()
	{
		TransportationModeDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Distance Type Duplicate  ***************************//
	
	public void TransportationModeNameDuplicateMethod()
	{
		TransportationModeNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void TransportationModeNameUniqueMethod()
	{
		TransportationModeNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void TransportationModeDescriptionDuplicateMethod()
	{
		TransportationModeDescriptionTextField.sendKeys(Description);
	}
	public void TransportationModeDifferentDescriptionMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Aid Frequency Mandatory  ***************************//
	
	@FindBy(id="txtAidFreequencyName")
	private WebElement AidFrequencyNameTextField;
	public void AidFrequencyNameTextFieldMethod()
	{
		AidFrequencyNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement AidFrequencyDescriptionTextField;
	public void AidFrequencyDescriptionTextFieldMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(Description);
	}
	
	public void AidFrequencyNameClearMethod()
	{
		AidFrequencyNameTextField.clear();
	}
	
	public void AidFrequencyDescriptionClearMethod()
	{
		AidFrequencyDescriptionTextField.clear();
	}
	
	public String AidFrequencyNameGetTextMethod()
	{
		String name = AidFrequencyNameTextField.getAttribute("value");
		return name;
	}
	
	public String AidFrequencyDescriptionGetTextMethod()
	{
		String description = AidFrequencyDescriptionTextField.getAttribute("value");
		return description;
	}
	
	//********************** Aid Frequency White Space  ***************************//
	
	public void AidFrequencyNameWhiteSpaceInitialMethod()
	{
		AidFrequencyNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void AidFrequencyNameWhiteSpaceiMiddleMethod()
	{
		AidFrequencyNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void AidFrequencyDescriptionWhiteSpaceInitialMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void AidFrequencyDescriptionWhiteSpaceiMiddleMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Aid Frequency Special Char  ***************************//
	
	public void AidFrequencyNameSpecialCharMethod()
	{
		AidFrequencyNameTextField.sendKeys(SpecialChar);
	}
	
	public void AidFrequencyDescriptionSpecialCharMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Aid Frequency Sql Char  ***************************//
	
	public void AidFrequencyNameSqlCharMethod()
	{
		AidFrequencyNameTextField.sendKeys(SQLChar);
	}
	
	public void AidFrequencyDescriptionSqlCharMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Aid Frequency AlphaNumeric  ***************************//
	
	public void AidFrequencyNameAlphaNumericMethod()
	{
		AidFrequencyNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void AidFrequencyDescriptionAlphaNumericMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Aid Frequency Length  ***************************//
	
	public void AidFrequencyNameLengthMoreThan50Method()
	{
		AidFrequencyNameTextField.sendKeys(MoreThan50);
	}
	
	public void AidFrequencyDescriptionLengthMoreThan200Method()
	{
		AidFrequencyDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Aid Frequency Duplicate  ***************************//
	
	public void AidFrequencyNameDuplicateMethod()
	{
		AidFrequencyNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void AidFrequencyNameUniqueMethod()
	{
		AidFrequencyNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void AidFrequencyDescriptionDuplicateMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys("Description");
	}
	public void AidFrequencyDifferentDescriptionMethod()
	{
		AidFrequencyDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Organizaton Type Mandatory  ***************************//
	
	@FindBy(id="txtOrganizatonTypeName")
	private WebElement OrganizatonTypeNameTextField;
	public void OrganizatonTypeNameTextFieldMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement OrganizatonTypeDescriptionTextField;
	public void OrganizatonTypeDescriptionTextFieldMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void OrganizatonTypeNameClearMethod()
	{
		OrganizatonTypeNameTextField.clear();
	}
	
	public void OrganizatonTypeDescriptionClearMethod()
	{
		OrganizatonTypeDescriptionTextField.clear();
	}
	
	public String OrganizatonTypeNameGetTextMethod()
	{
		String name = OrganizatonTypeNameTextField.getAttribute("value");
		return name;
	}
	
	public String OrganizatonTypeDescriptionGetTextMethod()
	{
		String description = OrganizatonTypeDescriptionTextField.getAttribute("value");
		return description;
	}
	
	//********************** Organizaton Type White Space  ***************************//
	
	public void OrganizatonTypeNameWhiteSpaceInitialMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void OrganizatonTypeNameWhiteSpaceiMiddleMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void OrganizatonTypeDescriptionWhiteSpaceInitialMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void OrganizatonTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Organizaton Type Special Char  ***************************//
	
	public void OrganizatonTypeNameSpecialCharMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(SpecialChar);
	}
	
	public void OrganizatonTypeDescriptionSpecialCharMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Organizaton Type Sql Char  ***************************//
	
	public void OrganizatonTypeNameSqlCharMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(SQLChar);
	}
	
	public void OrganizatonTypeDescriptionSqlCharMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Organizaton Type AlphaNumeric  ***************************//
	
	public void OrganizatonTypeNameAlphaNumericMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(AlphaNumeric);
	}
	
	public void OrganizatonTypeDescriptionAlphaNumericMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Organizaton Type Length  ***************************//
	
	public void OrganizatonTypeNameLengthMoreThan50Method()
	{
		OrganizatonTypeNameTextField.sendKeys(MoreThan50);
	}
	
	public void OrganizatonTypeDescriptionLengthMoreThan200Method()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Organizaton Type Duplicate  ***************************//
	
	public void OrganizatonTypeNameDuplicateMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(RelationNameDuplicate);
	}
	public void OrganizatonTypeNameUniqueMethod()
	{
		OrganizatonTypeNameTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void OrganizatonTypeDescriptionDuplicateMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys("Description");
	}
	
	public void OrganizatonTypeDifferentDescriptionMethod()
	{
		OrganizatonTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}

	
	//********************** Crop Mandatory  ***************************//
	
	@FindBy(id="txtcropnameName")
	private WebElement CropTextField;
	public void CropFieldMethod()
	{
		CropTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement CropDescriptionTextField;
	public void CropDescriptionTextFieldMethod()
	{
		CropDescriptionTextField.sendKeys(Description);
	}
	
	public void CropClearMethod()
	{
		CropTextField.clear();
	}
	
	public void CropDescriptionClearMethod()
	{
		CropDescriptionTextField.clear();
	}
	
	public String CropGetTextMethod()
	{
		String crop = CropTextField.getAttribute("value");
		return crop;
	}
	
	public String CropDescriptionGetTextMethod()
	{
		String crop_description = CropDescriptionTextField.getAttribute("value");
		return crop_description;
	}
	//********************** Crop White Space  ***************************//
	
	public void CropWhiteSpaceInitialMethod()
	{
		CropTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void CropWhiteSpaceiMiddleMethod()
	{
		CropTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void CropDescriptionWhiteSpaceInitialMethod()
	{
		CropDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void CropDescriptionWhiteSpaceiMiddleMethod()
	{
		CropDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Crop Special Char  ***************************//
	
	public void CropSpecialCharMethod()
	{
		CropTextField.sendKeys(SpecialChar);
	}
	
	public void CropDescriptionSpecialCharMethod()
	{
		CropDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Crop Sql Char  ***************************//
	
	public void CropSqlCharMethod()
	{
		CropTextField.sendKeys(SQLChar);
	}
	
	public void CropDescriptionSqlCharMethod()
	{
		CropDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Crop AlphaNumeric  ***************************//
	
	public void CropAlphaNumericMethod()
	{
		CropTextField.sendKeys(AlphaNumeric);
	}
	
	public void CropDescriptionAlphaNumericMethod()
	{
		CropDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Crop Length  ***************************//
	
	public void CropLengthMoreThan50Method()
	{
		CropTextField.sendKeys(MoreThan50);
	}
	
	public void CropDescriptionLengthMoreThan200Method()
	{
		CropDescriptionTextField.sendKeys(MoreThan200);
	}
	//********************** Crop Duplicate  ***************************//
	
	public void CropNameDuplicateMethod()
	{
		CropTextField.sendKeys(RelationNameDuplicate);
	}
	public void CropNameUniqueMethod()
	{
		CropTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	public void CropNameDescriptionDuplicateMethod()
	{
		CropDescriptionTextField.sendKeys(Description);
	}
	public void CropDifferentDescriptionMethod()
	{
		CropDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** Ethnicity Mandatory  ***************************//
	
	@FindBy(id="txtethnicityName")
	private WebElement EthnicityTextField;
	public void EthnicityFieldMethod()
	{
		EthnicityTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement EthnicityDescriptionTextField;
	public void EthnicityDescriptionTextFieldMethod()
	{
		EthnicityDescriptionTextField.sendKeys(Description);
	}
	
	public void EthnicityClearMethod()
	{
		EthnicityTextField.clear();
	}
	
	public void EthnicityDescriptionClearMethod()
	{
		EthnicityDescriptionTextField.clear();
	}
	
	public String EthnicityGetTextMethod()
	{
		String Ethnicity = EthnicityTextField.getAttribute("value");
		return Ethnicity;
	}
	
	public String EthnicityDescriptionGetTextMethod()
	{
		String Ethnicity_description = EthnicityDescriptionTextField.getAttribute("value");
		return Ethnicity_description;
	}
	//********************** Ethnicity White Space  ***************************//
	
	public void EthnicityWhiteSpaceInitialMethod()
	{
		EthnicityTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void EthnicityWhiteSpaceiMiddleMethod()
	{
		EthnicityTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void EthnicityDescriptionWhiteSpaceInitialMethod()
	{
		EthnicityDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void EthnicityDescriptionWhiteSpaceiMiddleMethod()
	{
		EthnicityDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Ethnicity Special Char  ***************************//
	
	public void EthnicitySpecialCharMethod()
	{
		EthnicityTextField.sendKeys(SpecialChar);
	}
	
	public void EthnicityDescriptionSpecialCharMethod()
	{
		EthnicityDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Ethnicity Sql Char  ***************************//
	
	public void EthnicitySqlCharMethod()
	{
		EthnicityTextField.sendKeys(SQLChar);
	}
	
	public void EthnicityDescriptionSqlCharMethod()
	{
		EthnicityDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Ethnicity AlphaNumeric  ***************************//
	
	public void EthnicityAlphaNumericMethod()
	{
		EthnicityTextField.sendKeys(AlphaNumeric);
	}
	
	public void EthnicityDescriptionAlphaNumericMethod()
	{
		EthnicityDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Ethnicity Length  ***************************//
	
	public void EthnicityLengthMoreThan50Method()
	{
		EthnicityTextField.sendKeys(MoreThan50);
	}
	
	public void EthnicityDescriptionLengthMoreThan200Method()
	{
		EthnicityDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** Ethnicity Duplicate  ***************************//
	
	public void EthnicityNameDuplicateMethod()
	{
		EthnicityTextField.sendKeys(RelationNameDuplicate);
	}
	public void EthnicityNameUniqueMethod()
	{
		EthnicityTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	public void EthnicityNameDescriptionDuplicateMethod()
	{
		EthnicityDescriptionTextField.sendKeys(Description);
	}
	public void EthnicityDifferentDescriptionMethod()
	{
		EthnicityDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
		
	//********************** OccupancyStatus Mandatory  ***************************//
	
	@FindBy(id="txtoccupancyStatusName")
	private WebElement OccupancyStatusTextField;
	public void OccupancyStatusFieldMethod()
	{
		OccupancyStatusTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement OccupancyStatusDescriptionTextField;
	public void OccupancyStatusDescriptionTextFieldMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(Description);
	}
	
	public void OccupancyStatusClearMethod()
	{
		OccupancyStatusTextField.clear();
	}
	
	public void OccupancyStatusDescriptionClearMethod()
	{
		OccupancyStatusDescriptionTextField.clear();
	}
	
	public String OccupancyStatusGetTextMethod()
	{
		String OccupancyStatus = OccupancyStatusTextField.getAttribute("value");
		return OccupancyStatus;
	}
	
	public String OccupancyStatusDescriptionGetTextMethod()
	{
		String OccupancyStatus_description = OccupancyStatusDescriptionTextField.getAttribute("value");
		return OccupancyStatus_description;
	}
	//********************** OccupancyStatus White Space  ***************************//
	
	public void OccupancyStatusWhiteSpaceInitialMethod()
	{
		OccupancyStatusTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void OccupancyStatusWhiteSpaceiMiddleMethod()
	{
		OccupancyStatusTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void OccupancyStatusDescriptionWhiteSpaceInitialMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void OccupancyStatusDescriptionWhiteSpaceiMiddleMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** OccupancyStatus Special Char  ***************************//
	
	public void OccupancyStatusSpecialCharMethod()
	{
		OccupancyStatusTextField.sendKeys(SpecialChar);
	}
	
	public void OccupancyStatusDescriptionSpecialCharMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** OccupancyStatus Sql Char  ***************************//
	
	public void OccupancyStatusSqlCharMethod()
	{
		OccupancyStatusTextField.sendKeys(SQLChar);
	}
	
	public void OccupancyStatusDescriptionSqlCharMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** OccupancyStatus AlphaNumeric  ***************************//
	
	public void OccupancyStatusAlphaNumericMethod()
	{
		OccupancyStatusTextField.sendKeys(AlphaNumeric);
	}
	
	public void OccupancyStatusDescriptionAlphaNumericMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** OccupancyStatus Length  ***************************//
	
	public void OccupancyStatusLengthMoreThan50Method()
	{
		OccupancyStatusTextField.sendKeys(MoreThan50);
	}
	
	public void OccupancyStatusDescriptionLengthMoreThan200Method()
	{
		OccupancyStatusDescriptionTextField.sendKeys(MoreThan200);
	}
	
	//********************** OccupancyStatus Duplicate  ***************************//
	
	public void OccupancyStatusNameDuplicateMethod()
	{
		OccupancyStatusTextField.sendKeys(RelationNameDuplicate);
	}
	public void OccupancyStatusUniqueMethod()
	{
		OccupancyStatusTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	public void OccupancyStatusNameDescriptionDuplicateMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(Description);
	}
	public void OccupancyStatusDifferentDescriptionMethod()
	{
		OccupancyStatusDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	//********************** CopingStrategyType Mandatory  ***************************//
	
	@FindBy(id="txtcopingStrategyName")
	private WebElement CopingStrategyTypeTextField;
	public void CopingStrategyTypeFieldMethod()
	{
		CopingStrategyTypeTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement CopingStrategyTypeDescriptionTextField;
	public void CopingStrategyTypeDescriptionTextFieldMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void CopingStrategyTypeClearMethod()
	{
		CopingStrategyTypeTextField.clear();
	}
	
	public void CopingStrategyTypeDescriptionClearMethod()
	{
		CopingStrategyTypeDescriptionTextField.clear();
	}
	
	public String CopingStrategyTypeGetTextMethod()
	{
		String CopingStrategyType = CopingStrategyTypeTextField.getAttribute("value");
		return CopingStrategyType;
	}
	
	public String CopingStrategyTypeDescriptionGetTextMethod()
	{
		String CopingStrategyType_description = CopingStrategyTypeDescriptionTextField.getAttribute("value");
		return CopingStrategyType_description;
	}
	//********************** CopingStrategyType White Space  ***************************//
	
	public void CopingStrategyTypeWhiteSpaceInitialMethod()
	{
		CopingStrategyTypeTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void CopingStrategyTypeWhiteSpaceiMiddleMethod()
	{
		CopingStrategyTypeTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void CopingStrategyTypeDescriptionWhiteSpaceInitialMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void CopingStrategyTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** CopingStrategyType Special Char  ***************************//
	
	public void CopingStrategyTypeSpecialCharMethod()
	{
		CopingStrategyTypeTextField.sendKeys(SpecialChar);
	}
	
	public void CopingStrategyTypeDescriptionSpecialCharMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** CopingStrategyType Sql Char  ***************************//
	
	public void CopingStrategyTypeSqlCharMethod()
	{
		CopingStrategyTypeTextField.sendKeys(SQLChar);
	}
	
	public void CopingStrategyTypeDescriptionSqlCharMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** CopingStrategyType AlphaNumeric  ***************************//
	
	public void CopingStrategyTypeAlphaNumericMethod()
	{
		CopingStrategyTypeTextField.sendKeys(AlphaNumeric);
	}
	
	public void CopingStrategyTypeDescriptionAlphaNumericMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** CopingStrategyType Length  ***************************//
	
	public void CopingStrategyTypeLengthMoreThan50Method()
	{
		CopingStrategyTypeTextField.sendKeys(MoreThan50);
	}
	
	public void CopingStrategyTypeDescriptionLengthMoreThan200Method()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** CopingStrategyType Duplicate  ***************************//
	
	public void CopingStrategyTypeNameDuplicateMethod()
	{
		CopingStrategyTypeTextField.sendKeys(RelationNameDuplicate);
	}
	public void CopingStrategyTypeUniqueMethod()
	{
		CopingStrategyTypeTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	
	public void CopingStrategyTypeNameDescriptionDuplicateMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(Description);
	}
	public void CopingStrategyTypeDifferentDescriptionMethod()
	{
		CopingStrategyTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	
	//********************** ShockSeverityType Mandatory  ***************************//
		
	@FindBy(id="txtSeverityName")
	private WebElement ShockSeverityTypeTextField;
	public void ShockSeverityTypeFieldMethod()
	{
		ShockSeverityTypeTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement ShockSeverityTypeDescriptionTextField;
	public void ShockSeverityTypeDescriptionTextFieldMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void ShockSeverityTypeClearMethod()
	{
		ShockSeverityTypeTextField.clear();
	}
	
	public void ShockSeverityTypeDescriptionClearMethod()
	{
		ShockSeverityTypeDescriptionTextField.clear();
	}
	
	public String ShockSeverityTypeGetTextMethod()
	{
		String ShockSeverityType = ShockSeverityTypeTextField.getAttribute("value");
		return ShockSeverityType;
	}
	
	public String ShockSeverityTypeDescriptionGetTextMethod()
	{
		String ShockSeverityType_description = ShockSeverityTypeDescriptionTextField.getAttribute("value");
		return ShockSeverityType_description;
	}
	//********************** ShockSeverityType White Space  ***************************//
	
	public void ShockSeverityTypeWhiteSpaceInitialMethod()
	{
		ShockSeverityTypeTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ShockSeverityTypeWhiteSpaceiMiddleMethod()
	{
		ShockSeverityTypeTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void ShockSeverityTypeDescriptionWhiteSpaceInitialMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ShockSeverityTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** ShockSeverityType Special Char  ***************************//
	
	public void ShockSeverityTypeSpecialCharMethod()
	{
		ShockSeverityTypeTextField.sendKeys(SpecialChar);
	}
	
	public void ShockSeverityTypeDescriptionSpecialCharMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** ShockSeverityType Sql Char  ***************************//
	
	public void ShockSeverityTypeSqlCharMethod()
	{
		ShockSeverityTypeTextField.sendKeys(SQLChar);
	}
	
	public void ShockSeverityTypeDescriptionSqlCharMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** ShockSeverityType AlphaNumeric  ***************************//
	
	public void ShockSeverityTypeAlphaNumericMethod()
	{
		ShockSeverityTypeTextField.sendKeys(AlphaNumeric);
	}
	
	public void ShockSeverityTypeDescriptionAlphaNumericMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** ShockSeverityType Length  ***************************//
	
	public void ShockSeverityTypeLengthMoreThan50Method()
	{
		ShockSeverityTypeTextField.sendKeys(MoreThan50);
	}
	
	public void ShockSeverityTypeDescriptionLengthMoreThan200Method()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** ShockSeverityType Duplicate  ***************************//
	
	public void ShockSeverityTypeNameDuplicateMethod()
	{
		ShockSeverityTypeTextField.sendKeys(RelationNameDuplicate);
	}
	public void ShockSeverityTypeUniqueMethod()
	{
		ShockSeverityTypeTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	public void ShockSeverityTypeNameDescriptionDuplicateMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(Description);
	}
	public void ShockSeverityTypeDifferentDescriptionMethod()
	{
		ShockSeverityTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
     
	//********************** MainDrinkingSource Mandatory  ***************************//
	
	@FindBy(id="txtsourcenameName")
	private WebElement MainDrinkingSourceTextField;
	public void MainDrinkingSourceFieldMethod()
	{
		MainDrinkingSourceTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement MainDrinkingSourceDescriptionTextField;
	public void MainDrinkingSourceDescriptionTextFieldMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(Description);
	}
	
	public void MainDrinkingSourceClearMethod()
	{
		MainDrinkingSourceTextField.clear();
	}
	
	public void MainDrinkingSourceDescriptionClearMethod()
	{
		MainDrinkingSourceDescriptionTextField.clear();
	}
	
	public String MainDrinkingSourceGetTextMethod()
	{
		String MainDrinkingSource = MainDrinkingSourceTextField.getAttribute("value");
		return MainDrinkingSource;
	}
	
	public String MainDrinkingSourceDescriptionGetTextMethod()
	{
		String MainDrinkingSource_description = MainDrinkingSourceDescriptionTextField.getAttribute("value");
		return MainDrinkingSource_description;
	}
	//********************** MainDrinkingSource White Space  ***************************//
	
	public void MainDrinkingSourceWhiteSpaceInitialMethod()
	{
		MainDrinkingSourceTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MainDrinkingSourceWhiteSpaceiMiddleMethod()
	{
		MainDrinkingSourceTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void MainDrinkingSourceDescriptionWhiteSpaceInitialMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MainDrinkingSourceDescriptionWhiteSpaceiMiddleMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** MainDrinkingSource Special Char  ***************************//
	
	public void MainDrinkingSourceSpecialCharMethod()
	{
		MainDrinkingSourceTextField.sendKeys(SpecialChar);
	}
	
	public void MainDrinkingSourceDescriptionSpecialCharMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** MainDrinkingSource Sql Char  ***************************//
	
	public void MainDrinkingSourceSqlCharMethod()
	{
		MainDrinkingSourceTextField.sendKeys(SQLChar);
	}
	
	public void MainDrinkingSourceDescriptionSqlCharMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** MainDrinkingSource AlphaNumeric  ***************************//
	
	public void MainDrinkingSourceAlphaNumericMethod()
	{
		MainDrinkingSourceTextField.sendKeys(AlphaNumeric);
	}
	
	public void MainDrinkingSourceDescriptionAlphaNumericMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** MainDrinkingSource Length  ***************************//
	
	public void MainDrinkingSourceLengthMoreThan50Method()
	{
		MainDrinkingSourceTextField.sendKeys(MoreThan50);
	}
	
	public void MainDrinkingSourceDescriptionLengthMoreThan200Method()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** MainDrinkingSource Duplicate  ***************************//
		
	public void MainDrinkingSourceNameDuplicateMethod()
	{
		MainDrinkingSourceTextField.sendKeys(RelationNameDuplicate);
	}
	public void MainDrinkingSourceUniqueMethod()
	{
		MainDrinkingSourceTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	
	public void MainDrinkingSourceNameDescriptionDuplicateMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(Description);
	}
	public void MainDrinkingSourceDifferentDescriptionMethod()
	{
		MainDrinkingSourceDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
		
   //********************** ToiletType Mandatory  ***************************//
	
	@FindBy(id="txtToiletTypename")
	private WebElement ToiletTypeTextField;
	public void ToiletTypeFieldMethod()
	{
		ToiletTypeTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement ToiletTypeDescriptionTextField;
	public void ToiletTypeDescriptionTextFieldMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void ToiletTypeClearMethod()
	{
		ToiletTypeTextField.clear();
	}
	
	public void ToiletTypeDescriptionClearMethod()
	{
		ToiletTypeDescriptionTextField.clear();
	}
	
	public String ToiletTypeGetTextMethod()
	{
		String ToiletType = ToiletTypeTextField.getAttribute("value");
		return ToiletType;
	}
	
	public String ToiletTypeDescriptionGetTextMethod()
	{
		String ToiletType_description = ToiletTypeDescriptionTextField.getAttribute("value");
		return ToiletType_description;
	}
	//********************** ToiletType White Space  ***************************//
	
	public void ToiletTypeWhiteSpaceInitialMethod()
	{
		ToiletTypeTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ToiletTypeWhiteSpaceiMiddleMethod()
	{
		ToiletTypeTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void ToiletTypeDescriptionWhiteSpaceInitialMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ToiletTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** ToiletType Special Char  ***************************//
	
	public void ToiletTypeSpecialCharMethod()
	{
		ToiletTypeTextField.sendKeys(SpecialChar);
	}
	
	public void ToiletTypeDescriptionSpecialCharMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** ToiletType Sql Char  ***************************//
	
	public void ToiletTypeSqlCharMethod()
	{
		ToiletTypeTextField.sendKeys(SQLChar);
	}
	
	public void ToiletTypeDescriptionSqlCharMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** ToiletType AlphaNumeric  ***************************//
	
	public void ToiletTypeAlphaNumericMethod()
	{
		ToiletTypeTextField.sendKeys(AlphaNumeric);
	}
	
	public void ToiletTypeDescriptionAlphaNumericMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** ToiletType Length  ***************************//
	
	public void ToiletTypeLengthMoreThan50Method()
	{
		ToiletTypeTextField.sendKeys(MoreThan50);
	}
	
	public void ToiletTypeDescriptionLengthMoreThan200Method()
	{
		ToiletTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** ToiletType Duplicate  ***************************//
			
	public void ToiletTypeNameDuplicateMethod()
	{
		ToiletTypeTextField.sendKeys(RelationNameDuplicate);
	}
	public void ToiletTypeUniqueMethod()
	{
		ToiletTypeTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void ToiletTypeNameDescriptionDuplicateMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(Description);
	}
	public void ToiletTypeDifferentDescriptionMethod()
	{
		ToiletTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
			
 //********************** MainLightingSource Mandatory  ***************************//
	
	@FindBy(id="txtsourcenameName")
	private WebElement MainLightingSourceTextField;
	public void MainLightingSourceFieldMethod()
	{
		MainLightingSourceTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement MainLightingSourceDescriptionTextField;
	public void MainLightingSourceDescriptionTextFieldMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(Description);
	}
	
	public void MainLightingSourceClearMethod()
	{
		MainLightingSourceTextField.clear();
	}
	
	public void MainLightingSourceDescriptionClearMethod()
	{
		MainLightingSourceDescriptionTextField.clear();
	}
	
	public String MainLightingSourceGetTextMethod()
	{
		String MainLightingSource = MainLightingSourceTextField.getAttribute("value");
		return MainLightingSource;
	}
	
	public String MainLightingSourceDescriptionGetTextMethod()
	{
		String MainLightingSource_description = MainLightingSourceDescriptionTextField.getAttribute("value");
		return MainLightingSource_description;
	}
	//********************** MainLightingSource White Space  ***************************//
	
	public void MainLightingSourceWhiteSpaceInitialMethod()
	{
		MainLightingSourceTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MainLightingSourceWhiteSpaceiMiddleMethod()
	{
		MainLightingSourceTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void MainLightingSourceDescriptionWhiteSpaceInitialMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void MainLightingSourceDescriptionWhiteSpaceiMiddleMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** MainLightingSource Special Char  ***************************//
	
	public void MainLightingSourceSpecialCharMethod()
	{
		MainLightingSourceTextField.sendKeys(SpecialChar);
	}
	
	public void MainLightingSourceDescriptionSpecialCharMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** MainLightingSource Sql Char  ***************************//
	
	public void MainLightingSourceSqlCharMethod()
	{
		MainLightingSourceTextField.sendKeys(SQLChar);
	}
	
	public void MainLightingSourceDescriptionSqlCharMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** MainLightingSource AlphaNumeric  ***************************//
	
	public void MainLightingSourceAlphaNumericMethod()
	{
		MainLightingSourceTextField.sendKeys(AlphaNumeric);
	}
	
	public void MainLightingSourceDescriptionAlphaNumericMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** MainLightingSource Length  ***************************//
	
	public void MainLightingSourceLengthMoreThan50Method()
	{
		MainLightingSourceTextField.sendKeys(MoreThan50);
	}
	
	public void MainLightingSourceDescriptionLengthMoreThan200Method()
	{
		MainLightingSourceDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** MainLightingSource Duplicate  ***************************//
			
	public void MainLightingSourceNameDuplicateMethod()
	{
		MainLightingSourceTextField.sendKeys(RelationNameDuplicate);
	}
	public void MainLightingSourceUniqueMethod()
	{
		MainLightingSourceTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void MainLightingSourceNameDescriptionDuplicateMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(Description);
	}
	public void MainLightingSourceDifferentDescriptionMethod()
	{
		MainLightingSourceDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
 //********************** IncomeSource Mandatory  ***************************//
	
	@FindBy(id="txtincomesourcenameName")
	private WebElement IncomeSourceTextField;
	public void IncomeSourceFieldMethod()
	{
		IncomeSourceTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement IncomeSourceDescriptionTextField;
	public void IncomeSourceDescriptionTextFieldMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(Description);
	}
	
	public void IncomeSourceClearMethod()
	{
		IncomeSourceTextField.clear();
	}
	
	public void IncomeSourceDescriptionClearMethod()
	{
		IncomeSourceDescriptionTextField.clear();
	}
	
	public String IncomeSourceGetTextMethod()
	{
		String IncomeSource = IncomeSourceTextField.getAttribute("value");
		return IncomeSource;
	}
	
	public String IncomeSourceDescriptionGetTextMethod()
	{
		String IncomeSource_description = IncomeSourceDescriptionTextField.getAttribute("value");
		return IncomeSource_description;
	}
	//********************** IncomeSource White Space  ***************************//
	
	public void IncomeSourceWhiteSpaceInitialMethod()
	{
		IncomeSourceTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void IncomeSourceWhiteSpaceiMiddleMethod()
	{
		IncomeSourceTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void IncomeSourceDescriptionWhiteSpaceInitialMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void IncomeSourceDescriptionWhiteSpaceiMiddleMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** IncomeSource Special Char  ***************************//
	
	public void IncomeSourceSpecialCharMethod()
	{
		IncomeSourceTextField.sendKeys(SpecialChar);
	}
	
	public void IncomeSourceDescriptionSpecialCharMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** IncomeSource Sql Char  ***************************//
	
	public void IncomeSourceSqlCharMethod()
	{
		IncomeSourceTextField.sendKeys(SQLChar);
	}
	
	public void IncomeSourceDescriptionSqlCharMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** IncomeSource AlphaNumeric  ***************************//
	
	public void IncomeSourceAlphaNumericMethod()
	{
		IncomeSourceTextField.sendKeys(AlphaNumeric);
	}
	
	public void IncomeSourceDescriptionAlphaNumericMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** IncomeSource Length  ***************************//
	
	public void IncomeSourceLengthMoreThan50Method()
	{
		IncomeSourceTextField.sendKeys(MoreThan50);
	}
	
	public void IncomeSourceDescriptionLengthMoreThan200Method()
	{
		IncomeSourceDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** IncomeSource Duplicate  ***************************//
	
	public void IncomeSourceNameDuplicateMethod()
	{
		IncomeSourceTextField.sendKeys(RelationNameDuplicate);
	}
	public void IncomeSourceUniqueMethod()
	{
		IncomeSourceTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void IncomeSourceNameDescriptionDuplicateMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(Description);
	}
	public void IncomeSourceDifferentDescriptionMethod()
	{
		IncomeSourceDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
//********************** AidType Mandatory  ***************************//
	
	@FindBy(id="txtaidname")
	private WebElement AidTypeTextField;
	public void AidTypeFieldMethod()
	{
		AidTypeTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement AidTypeDescriptionTextField;
	public void AidTypeDescriptionTextFieldMethod()
	{
		AidTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void AidTypeClearMethod()
	{
		AidTypeTextField.clear();
	}
	
	public void AidTypeDescriptionClearMethod()
	{
		AidTypeDescriptionTextField.clear();
	}
	
	public String AidTypeGetTextMethod()
	{
		String AidType = AidTypeTextField.getAttribute("value");
		return AidType;
	}
	
	public String AidTypeDescriptionGetTextMethod()
	{
		String AidType_description = AidTypeDescriptionTextField.getAttribute("value");
		return AidType_description;
	}
	//********************** AidType White Space  ***************************//
	
	public void AidTypeWhiteSpaceInitialMethod()
	{
		AidTypeTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void AidTypeWhiteSpaceiMiddleMethod()
	{
		AidTypeTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void AidTypeDescriptionWhiteSpaceInitialMethod()
	{
		AidTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void AidTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		AidTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** AidType Special Char  ***************************//
	
	public void AidTypeSpecialCharMethod()
	{
		AidTypeTextField.sendKeys(SpecialChar);
	}
	
	public void AidTypeDescriptionSpecialCharMethod()
	{
		AidTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** AidType Sql Char  ***************************//
	
	public void AidTypeSqlCharMethod()
	{
		AidTypeTextField.sendKeys(SQLChar);
	}
	
	public void AidTypeDescriptionSqlCharMethod()
	{
		AidTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** AidType AlphaNumeric  ***************************//
	
	public void AidTypeAlphaNumericMethod()
	{
		AidTypeTextField.sendKeys(AlphaNumeric);
	}
	
	public void AidTypeDescriptionAlphaNumericMethod()
	{
		AidTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** AidType Length  ***************************//
	
	public void AidTypeLengthMoreThan50Method()
	{
		AidTypeTextField.sendKeys(MoreThan50);
	}
	
	public void AidTypeDescriptionLengthMoreThan200Method()
	{
		AidTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** AidType Duplicate  ***************************//
	
	public void AidTypeNameDuplicateMethod()
	{
		AidTypeTextField.sendKeys(RelationNameDuplicate);
	}
	public void AidTypeUniqueMethod()
	{
		AidTypeTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void AidTypeNameDescriptionDuplicateMethod()
	{
		AidTypeDescriptionTextField.sendKeys(Description);
	}
	public void AidTypeDifferentDescriptionMethod()
	{
		AidTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
	

	//********************** DisposeOfRubbish Mandatory  ***************************//
	
	@FindBy(id="txtDisposeRubbishName")
	private WebElement DisposeOfRubbishTextField;
	public void DisposeOfRubbishFieldMethod()
	{
		DisposeOfRubbishTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement DisposeOfRubbishDescriptionTextField;
	public void DisposeOfRubbishDescriptionTextFieldMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(Description);
	}
	
	public void DisposeOfRubbishClearMethod()
	{
		DisposeOfRubbishTextField.clear();
	}
	
	public void DisposeOfRubbishDescriptionClearMethod()
	{
		DisposeOfRubbishDescriptionTextField.clear();
	}
	
	public String DisposeOfRubbishGetTextMethod()
	{
		String DisposeOfRubbish = DisposeOfRubbishTextField.getAttribute("value");
		return DisposeOfRubbish;
	}
	
	public String DisposeOfRubbishDescriptionGetTextMethod()
	{
		String DisposeOfRubbish_description = DisposeOfRubbishDescriptionTextField.getAttribute("value");
		return DisposeOfRubbish_description;
	}
	//********************** DisposeOfRubbish White Space  ***************************//
	
	public void DisposeOfRubbishWhiteSpaceInitialMethod()
	{
		DisposeOfRubbishTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DisposeOfRubbishWhiteSpaceiMiddleMethod()
	{
		DisposeOfRubbishTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void DisposeOfRubbishDescriptionWhiteSpaceInitialMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void DisposeOfRubbishDescriptionWhiteSpaceiMiddleMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** DisposeOfRubbish Special Char  ***************************//
	
	public void DisposeOfRubbishSpecialCharMethod()
	{
		DisposeOfRubbishTextField.sendKeys(SpecialChar);
	}
	
	public void DisposeOfRubbishDescriptionSpecialCharMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** DisposeOfRubbish Sql Char  ***************************//
	
	public void DisposeOfRubbishSqlCharMethod()
	{
		DisposeOfRubbishTextField.sendKeys(SQLChar);
	}
	
	public void DisposeOfRubbishDescriptionSqlCharMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** DisposeOfRubbish AlphaNumeric  ***************************//
	
	public void DisposeOfRubbishAlphaNumericMethod()
	{
		DisposeOfRubbishTextField.sendKeys(AlphaNumeric);
	}
	
	public void DisposeOfRubbishDescriptionAlphaNumericMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** DisposeOfRubbish Length  ***************************//
	
	public void DisposeOfRubbishLengthMoreThan50Method()
	{
		DisposeOfRubbishTextField.sendKeys(MoreThan50);
	}
	
	public void DisposeOfRubbishDescriptionLengthMoreThan200Method()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** DisposeOfRubbish Duplicate  ***************************//
	
	public void DisposeOfRubbishNameDuplicateMethod()
	{
		DisposeOfRubbishTextField.sendKeys(RelationNameDuplicate);
	}
	public void DisposeOfRubbishUniqueMethod()
	{
		DisposeOfRubbishTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void DisposeOfRubbishNameDescriptionDuplicateMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(Description);
	}
	public void DisposeOfRubbishDifferentDescriptionMethod()
	{
		DisposeOfRubbishDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
   //********************** LivelihoodType Mandatory  ***************************//
	
	@FindBy(id="txtlivelihoodnameName")
	private WebElement LivelihoodTypeTextField;
	public void LivelihoodTypeFieldMethod()
	{
		LivelihoodTypeTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement LivelihoodTypeDescriptionTextField;
	public void LivelihoodTypeDescriptionTextFieldMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(Description);
	}
	
	public void LivelihoodTypeClearMethod()
	{
		LivelihoodTypeTextField.clear();
	}
	
	public void LivelihoodTypeDescriptionClearMethod()
	{
		LivelihoodTypeDescriptionTextField.clear();
	}
	
	public String LivelihoodTypeGetTextMethod()
	{
		String LivelihoodType = LivelihoodTypeTextField.getAttribute("value");
		return LivelihoodType;
	}
	
	public String LivelihoodTypeDescriptionGetTextMethod()
	{
		String LivelihoodType_description = LivelihoodTypeDescriptionTextField.getAttribute("value");
		return LivelihoodType_description;
	}
	//********************** LivelihoodType White Space  ***************************//
	
	public void LivelihoodTypeWhiteSpaceInitialMethod()
	{
		LivelihoodTypeTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void LivelihoodTypeWhiteSpaceiMiddleMethod()
	{
		LivelihoodTypeTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void LivelihoodTypeDescriptionWhiteSpaceInitialMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void LivelihoodTypeDescriptionWhiteSpaceiMiddleMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** LivelihoodType Special Char  ***************************//
	
	public void LivelihoodTypeSpecialCharMethod()
	{
		LivelihoodTypeTextField.sendKeys(SpecialChar);
	}
	
	public void LivelihoodTypeDescriptionSpecialCharMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** LivelihoodType Sql Char  ***************************//
	
	public void LivelihoodTypeSqlCharMethod()
	{
		LivelihoodTypeTextField.sendKeys(SQLChar);
	}
	
	public void LivelihoodTypeDescriptionSqlCharMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** LivelihoodType AlphaNumeric  ***************************//
	
	public void LivelihoodTypeAlphaNumericMethod()
	{
		LivelihoodTypeTextField.sendKeys(AlphaNumeric);
	}
	
	public void LivelihoodTypeDescriptionAlphaNumericMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** LivelihoodType Length  ***************************//
	
	public void LivelihoodTypeLengthMoreThan50Method()
	{
		LivelihoodTypeTextField.sendKeys(MoreThan50);
	}
	
	public void LivelihoodTypeDescriptionLengthMoreThan200Method()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** LivelihoodType Duplicate  ***************************//
			
	public void LivelihoodTypeNameDuplicateMethod()
	{
		LivelihoodTypeTextField.sendKeys(RelationNameDuplicate);
	}
	public void LivelihoodTypeUniqueMethod()
	{
		LivelihoodTypeTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void LivelihoodTypeNameDescriptionDuplicateMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(Description);
	}
	public void LivelihoodTypeDifferentDescriptionMethod()
	{
		LivelihoodTypeDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
			
 //********************** LiveStock Mandatory  ***************************//
	
	@FindBy(id="txtlivestockName")
	private WebElement LiveStockTextField;
	public void LiveStockFieldMethod()
	{
		LiveStockTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement LiveStockDescriptionTextField;
	public void LiveStockDescriptionTextFieldMethod()
	{
		LiveStockDescriptionTextField.sendKeys(Description);
	}
	
	public void LiveStockClearMethod()
	{
		LiveStockTextField.clear();
	}
	
	public void LiveStockDescriptionClearMethod()
	{
		LiveStockDescriptionTextField.clear();
	}
	
	public String LiveStockGetTextMethod()
	{
		String LiveStock = LiveStockTextField.getAttribute("value");
		return LiveStock;
	}
	
	public String LiveStockDescriptionGetTextMethod()
	{
		String LiveStock_description = LiveStockDescriptionTextField.getAttribute("value");
		return LiveStock_description;
	}
	//********************** LiveStock White Space  ***************************//
	
	public void LiveStockWhiteSpaceInitialMethod()
	{
		LiveStockTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void LiveStockWhiteSpaceiMiddleMethod()
	{
		LiveStockTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void LiveStockDescriptionWhiteSpaceInitialMethod()
	{
		LiveStockDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void LiveStockDescriptionWhiteSpaceiMiddleMethod()
	{
		LiveStockDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** LiveStock Special Char  ***************************//
	
	public void LiveStockSpecialCharMethod()
	{
		LiveStockTextField.sendKeys(SpecialChar);
	}
	
	public void LiveStockDescriptionSpecialCharMethod()
	{
		LiveStockDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** LiveStock Sql Char  ***************************//
	
	public void LiveStockSqlCharMethod()
	{
		LiveStockTextField.sendKeys(SQLChar);
	}
	
	public void LiveStockDescriptionSqlCharMethod()
	{
		LiveStockDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** LiveStock AlphaNumeric  ***************************//
	
	public void LiveStockAlphaNumericMethod()
	{
		LiveStockTextField.sendKeys(AlphaNumeric);
	}
	
	public void LiveStockDescriptionAlphaNumericMethod()
	{
		LiveStockDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** LiveStock Length  ***************************//
	
	public void LiveStockLengthMoreThan50Method()
	{
		LiveStockTextField.sendKeys(MoreThan50);
	}
	
	public void LiveStockDescriptionLengthMoreThan200Method()
	{
		LiveStockDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** LiveStock Duplicate  ***************************//
			
	public void LiveStockNameDuplicateMethod()
	{
		LiveStockTextField.sendKeys(RelationNameDuplicate);
	}
	public void LiveStockUniqueMethod()
	{
		LiveStockTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void LiveStockNameDescriptionDuplicateMethod()
	{
		LiveStockDescriptionTextField.sendKeys(Description);
	}
	public void LiveStockDifferentDescriptionMethod()
	{
		LiveStockDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
			
 //********************** Shock Mandatory  ***************************//
	
	@FindBy(id="txtshocknameName")
	private WebElement ShockTextField;
	public void ShockFieldMethod()
	{
		ShockTextField.sendKeys(RelationName);
	}
	
	@FindBy(id="txtDesc")
	private WebElement ShockDescriptionTextField;
	public void ShockDescriptionTextFieldMethod()
	{
		ShockDescriptionTextField.sendKeys(Description);
	}
	
	public void ShockClearMethod()
	{
		ShockTextField.clear();
	}
	
	public void ShockDescriptionClearMethod()
	{
		ShockDescriptionTextField.clear();
	}
	
	public String ShockGetTextMethod()
	{
		String Shock = ShockTextField.getAttribute("value");
		return Shock;
	}
	
	public String ShockDescriptionGetTextMethod()
	{
		String Shock_description = ShockDescriptionTextField.getAttribute("value");
		return Shock_description;
	}
	//********************** Shock White Space  ***************************//
	
	public void ShockWhiteSpaceInitialMethod()
	{
		ShockTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ShockWhiteSpaceiMiddleMethod()
	{
		ShockTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	public void ShockDescriptionWhiteSpaceInitialMethod()
	{
		ShockDescriptionTextField.sendKeys(WhiteSpaceInitial);
	}
	
	public void ShockDescriptionWhiteSpaceiMiddleMethod()
	{
		ShockDescriptionTextField.sendKeys(WhiteSpaceMiddle);
	}
	
	//********************** Shock Special Char  ***************************//
	
	public void ShockSpecialCharMethod()
	{
		ShockTextField.sendKeys(SpecialChar);
	}
	
	public void ShockDescriptionSpecialCharMethod()
	{
		ShockDescriptionTextField.sendKeys(SpecialChar);
	}
	
	//********************** Shock Sql Char  ***************************//
	
	public void ShockSqlCharMethod()
	{
		ShockTextField.sendKeys(SQLChar);
	}
	
	public void ShockDescriptionSqlCharMethod()
	{
		ShockDescriptionTextField.sendKeys(SQLChar);
	}
	
	//********************** Shock AlphaNumeric  ***************************//
	
	public void ShockAlphaNumericMethod()
	{
		ShockTextField.sendKeys(AlphaNumeric);
	}
	
	public void ShockDescriptionAlphaNumericMethod()
	{
		ShockDescriptionTextField.sendKeys(AlphaNumeric);
	}
	
	//********************** Shock Length  ***************************//
	
	public void ShockLengthMoreThan50Method()
	{
		ShockTextField.sendKeys(MoreThan50);
	}
	
	public void ShockDescriptionLengthMoreThan200Method()
	{
		ShockDescriptionTextField.sendKeys(MoreThan200);
	}
	
    //********************** Shock Duplicate  ***************************//
	
	public void ShockNameDuplicateMethod()
	{
		ShockTextField.sendKeys(RelationNameDuplicate);
	}
	public void ShockUniqueMethod()
	{
		ShockTextField.sendKeys(GenrateRandomAlphabatic(10));
	}
	public void ShockNameDescriptionDuplicateMethod()
	{
		ShockDescriptionTextField.sendKeys(Description);
	}
	public void ShockDifferentDescriptionMethod()
	{
		ShockDescriptionTextField.sendKeys(DescriptionDuplicate);
	}
				
	
	
	public SRIS_MasterModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
