package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_WorkShiftsPage {
	WebDriver driver;
	@FindBy(name="btnAdd")
	WebElement AddCategories;
	
	@FindBy(id="btnDelete")
	WebElement DeleteCategory;
	
	@FindBy(id="ohrmList_chkSelectAll")
    WebElement SelectAllShifts;
	
	@FindBy(id="ohrmList_chkSelectRecord_1")
	WebElement GeneralShift;
	
	@FindBy(id="ohrmList_chkSelectRecord_2")
	WebElement TwilightShift;
	public OrangeHRM_AdminJob_WorkShiftsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void AddCategories() {
		AddCategories.click();
	}
	public void DeleteCategory() {
		DeleteCategory.click();
	}
	public void SelectAllShifts() {
		SelectAllShifts.click();
	}
	public void GeneralShift() {
		GeneralShift.click();;
	}

	public void TwilightShift() {
		TwilightShift.click();
	}
	
}
