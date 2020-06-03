package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_EmployeeStatus_DeleteStatusPage {
	WebDriver driver;
	@FindBy(id="dialogDeleteBtn")
	WebElement SelectOk;
	
	@FindBy(className="btn reset")
	WebElement SelectCancel;

	public OrangeHRM_AdminJob_EmployeeStatus_DeleteStatusPage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
		public void SelectOk() {
			SelectOk.click();
		}
	public void SelectCancel() {
		SelectCancel.click();
	}
}
