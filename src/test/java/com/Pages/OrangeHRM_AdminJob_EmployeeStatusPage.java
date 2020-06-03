package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminJob_EmployeeStatusPage {
	/****
	 * * Author Pradeep *
	 */
	WebDriver driver;
	@FindBy(id="btnAdd")
	WebElement Add;
	
	@FindBy(id="btnDelete")
	WebElement Delete;

	@FindBy(id="ohrmList_chkSelectAll")
	WebElement SelectAll;
	
	@FindBy(id="ohrmList_chkSelectRecord_1")
	WebElement SelectFreeLance;
	
	@FindBy(id="ohrmList_chkSelectRecord_2")
	WebElement SelectFullTimeContract;
	
	@FindBy(id="ohrmList_chkSelectRecord_3")
	WebElement SelectFullTimePermanent;
	
	@FindBy(id="ohrmList_chkSelectRecord_3")
	WebElement SelectFullTimeProbation;
	
	@FindBy(id="ohrmList_chkSelectRecord_5")
	WebElement PartTimeContract;
	
	@FindBy(id="ohrmList_chkSelectRecord_6")
	WebElement PartTimeInternShip;
	
	@FindBy(id="ohrmList_chkSelectRecord_7")
	WebElement Test;

public OrangeHRM_AdminJob_EmployeeStatusPage(WebDriver ldriver) {
	driver=ldriver;
	PageFactory.initElements(driver, this);
}
public void add() {
	Add.click();
}
public void Delete() {
	Delete.click();
}
public void SelectAll() {
	SelectAll.click();
}
public void SelectFreeLance() {
	SelectFreeLance.click();
}
public void SelectFullTimeContract() {
	SelectFullTimeContract.click();
}
public void SelectFullTimePermanent() {
	SelectFullTimePermanent.click();
}
public void SelectFullTimeProbation() {
	SelectFullTimeProbation.click();
}
public void PartTimeContract() {
	PartTimeContract.click();
}
public void PartTimeInternShip() {
	PartTimeInternShip.click();
}
public void Test() {
	Test.click();
}
}