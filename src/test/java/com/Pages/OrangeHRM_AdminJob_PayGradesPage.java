package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_PayGradesPage {
	/****
	 * * Author Pradeep *
	 */
	
WebDriver driver;
@FindBy(id="btnAdd")
WebElement AddButton;

@FindBy(className="btn reset")
WebElement CancelButton;

@FindBy(id="ohrmList_chkSelectRecord_1")
WebElement SelectCeo;

@FindBy(id="ohrmList_chkSelectRecord_2")
WebElement SelectExecutive;

public OrangeHRM_AdminJob_PayGradesPage(WebDriver ldriver) {
	driver=ldriver;
	PageFactory.initElements(driver, this);
}
//Function is to add button
public void AddButton(){
	AddButton.click();
}

//Function is to Cancel button
public void CancelButton(){
	CancelButton.click();
}


//Function is selectCeo 
public void SelectCeo(){
	SelectCeo.click();
}

//Function is to SelectExecutive
public void SelectExecutive(){
	CancelButton.click();
}
}
