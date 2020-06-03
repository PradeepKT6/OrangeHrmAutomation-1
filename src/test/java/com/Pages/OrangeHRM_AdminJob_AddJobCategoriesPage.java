package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_AddJobCategoriesPage {
	/****
	 * * Author Pradeep *
	 */
	
	WebDriver driver;
	@FindBy(className="formInput")
	WebElement StatusName;
	
	@FindBy(name="btnSave")
	WebElement StatusSave;
	
	@FindBy(name="btnCancel")
	WebElement StatusCancel;
public OrangeHRM_AdminJob_AddJobCategoriesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//Function is to AddStatusName
public void StatusName() {
	StatusName.sendKeys("Name");
}
//Function is to AddStatusSave
public void StatusSave() {
	StatusSave.click();
}
//Function is to AddStatusCancel
public void StatusCancel() {
	StatusCancel.click();
}
}
