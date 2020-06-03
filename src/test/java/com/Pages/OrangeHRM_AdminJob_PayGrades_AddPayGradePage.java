package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_PayGrades_AddPayGradePage {
	/****
	 * * Author Pradeep *
	 */
	
	WebDriver driver;
	@FindBy(id="payGrade_name")
    WebElement Name;
	
	@FindBy(id="btnSave")
	WebElement Save;
	
	@FindBy(name="btnCancel")
	WebElement Cancel;
	public OrangeHRM_AdminJob_PayGrades_AddPayGradePage(WebDriver ldriver) {
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	// Function is to add Name
		public void Name() {
			Name.sendKeys("Name");
		}
		
		// Function is to ClickSave
		public void Save() {
			Save.click();
		}
		
		// Function is to ClickCancel
		public void Cancel() {
			Cancel.click();
	}
}
