package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_PayGrades_DeletePayGradePage {
	/****
	 * * Author Pradeep *
	 */
	WebDriver driver;
	@FindBy(id="dialogDeleteBtn")
	WebElement DeletePage;
	
	@FindBy(className="btn reset")
	WebElement CancelPage;


public OrangeHRM_AdminJob_PayGrades_DeletePayGradePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

//Function is to DeletePage
public void DeletePage() {
	DeletePage.click();
}

//Function is to CancelPage
public void CancelPage() {
	CancelPage.click();
}
}