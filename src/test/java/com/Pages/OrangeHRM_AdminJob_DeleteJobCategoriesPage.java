package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_DeleteJobCategoriesPage {
	/****
	 * * Author Pradeep *
	 */
	
	WebDriver driver;
	@FindBy(id="dialogDeleteBtn")
	WebElement DeletePage;
	
	@FindBy(className="btn reset")
	WebElement CancelPage;


public OrangeHRM_AdminJob_DeleteJobCategoriesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void DeletePage() {
	DeletePage.click();
}
public void CancelPage() {
	CancelPage.click();
}
}
