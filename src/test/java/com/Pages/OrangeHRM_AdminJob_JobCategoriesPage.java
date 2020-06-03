package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_JobCategoriesPage {
	/****
	 * * Author Pradeep *
	 */
	WebDriver driver;
	@FindBy(name="btnAdd")
	WebElement AddCategories;
	
	@FindBy(id="btnDelete")
	WebElement DeleteCategory;
	
	@FindBy(id="ohrmList_chkSelectAll")
    WebElement SelectAllCategories;
	
	@FindBy(id="ohrmList_chkSelectRecord_7")
	WebElement CraftWorkCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_9")
	WebElement LaboursAndHelpersCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_6")
	WebElement OfficeAndClericalWorkersCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_1")
	WebElement OfficialsAndManagersCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_5")
	WebElement  OperativesCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_2")
	WebElement ProffesionalsCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_4")
	WebElement SalesWorkersCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_8")
    WebElement ServiceWorkersCategory;
	
	@FindBy(id="ohrmList_chkSelectRecord_3")
	WebElement Technicians;
public OrangeHRM_AdminJob_JobCategoriesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//Function is to AddCategories
public void AddCategories() {
	AddCategories.click();
}

//Function is to DeleteCategories
public void DeleteCategory() {
	DeleteCategory.click();
}

//Function is to SelecctAllCategories
public void SelectAllcategories() {
	SelectAllCategories.click();
}

//Function is to CraftWorkCategories
public void CraftWorkCategory() {
CraftWorkCategory.click();
}
//Function is to LaboursAndHelpersCategories
public void LaboursAndHelpersCategory() {
	LaboursAndHelpersCategory.click();
}
//Function is to AddOfficeAndClericalCategory
public void OfficeAndClericalWorkersCategory() {
	OfficeAndClericalWorkersCategory.click();
}
//Function is to AddOfficeAndManagersCategory
public void OfficialsAndManagersCategory() {
	OfficialsAndManagersCategory.click();
}
//Function is to AddOperativesCategory
public void OperativesCategory() {
	OperativesCategory.click();
}
//Function is to AddProffesionalalCategory
public void ProffesionalsCategory() {
	ProffesionalsCategory.click();
}
//Function is to AddSalesWorkersCategory
public void SalesWorkersCategory() {
	SalesWorkersCategory.click();
}
//Function is to AddServiceWorkersCategory
public void ServiceWorkersCategory() {
	ServiceWorkersCategory.click();
}
//Function is to AddTechnicians
public void Technicians() {
	Technicians.click();
}
}
