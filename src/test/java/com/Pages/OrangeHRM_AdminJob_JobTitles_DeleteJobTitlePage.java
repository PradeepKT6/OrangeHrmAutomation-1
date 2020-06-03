package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_JobTitles_DeleteJobTitlePage {
	WebDriver driver;
	@FindBy(id="dialogDeleteBtn")
	WebElement DeleteButton;

	@FindBy(className="btn reset")
	WebElement CancelButton;
	
	@FindBy(id="ohrmList_chkSelectAll")
	WebElement SelectAll;
	
public OrangeHRM_AdminJob_JobTitles_DeleteJobTitlePage(WebDriver ldriver) {
driver=ldriver;
PageFactory.initElements(driver, this);

}
public void DeleteButton(){
	DeleteButton.click();
}
public void CancelButton(){
	CancelButton.click();
}
}