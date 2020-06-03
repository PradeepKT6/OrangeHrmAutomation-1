package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_AdminJob_JobTitlesPage {
	WebDriver driver;
	@FindBy(id="btnAdd")
    WebElement AddButton;	

	@FindBy(id="btnDelete")
    WebElement DeleteButton;
	
	@FindBy(id="ohrmList_chkSelectAll")
	WebElement SelectAll;
	
	@FindBy(id="ohrmList_chkSelectRecord_6")
	WebElement SelectAccountClerk;

	@FindBy(id="ohrmList_chkSelectRecord_9")
	WebElement SelectCeo;
	
	@FindBy(id="ohrmList_chkSelectRecord_5")
	WebElement SelectFinanceManager;
	
	@FindBy(id="ohrmList_chkSelectRecord_4")
	WebElement SelectHrExecutive;
	
	@FindBy(id="ohrmList_chkSelectRecord_3")
	WebElement SelectHrManager;
	
	@FindBy(id="ohrmList_chkSelectRecord_7")
	WebElement SelectItExecutive;
	
	@FindBy(id="ohrmList_chkSelectRecord_8")
	WebElement SelectItManager;
	
	@FindBy(id="ohrmList_chkSelectRecord_10")
	WebElement SelectManager;
	
	@FindBy(id="ohrmList_chkSelectRecord_2")
	WebElement SelectSalesExecutive;
	
	@FindBy(id="ohrmList_chkSelectRecord_1")
	WebElement SelectSalesManager;
	


public OrangeHRM_AdminJob_JobTitlesPage(WebDriver ldriver) {
	driver=ldriver;
	PageFactory.initElements(driver, this);
}

public void AddButon() {
	AddButton.click();
}
public void DeleteButton() {
	DeleteButton();
}
public void SelectAll() {
	SelectAll.click();
}
public void SelectAccountClerk() {
	SelectAccountClerk.click();
}
public void SelectCeo() {
	SelectCeo.click();
}
public void SelectFinanceManager() {
	SelectFinanceManager.click();
}
public void SelectHrExecutive() {
	SelectHrExecutive.click();
}
public void SelectHrManager() {
	SelectHrManager.click();
}
public void SelectItExecutive() {
	SelectItExecutive.click();
}
public void SelectItManager() {
	SelectItManager.click();
}
public void SelectManager() {
	SelectManager.click();
}
public void SelectSalesExecutive() {
	SelectSalesExecutive.click();
}
public void SelectSalesManager() {
	SelectSalesManager.click();
}
}