package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_WorkShifts_AddPage {
	WebDriver driver;
	@FindBy(className="formInput")
	WebElement StatusName;
	
	@FindBy(name="btnSave")
	WebElement StatusSave;
	
	@FindBy(name="btnCancel")
	WebElement StatusCancel;
public OrangeHRM_AdminJob_WorkShifts_AddPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void StatusName() {
	StatusName.sendKeys("Name");
}
public void StatusSave() {
	StatusSave.click();
}
public void StatusCancel() {
	StatusCancel.click();
}
}
