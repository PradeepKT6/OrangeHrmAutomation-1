package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_AdminJob_JobTitles_AddJobTitlePage {
	/****
	 * * Author Pradeep *
	 */
	
	WebDriver driver;
	@FindBy(id="jobTitle_jobTitle")
	WebElement JobTitle;
	
	@FindBy(id="jobTitle_jobDescription")
	WebElement JobDescription;
	
	@FindBy(id="jobTitle_jobSpec")
	WebElement JobSpecification;
	
	@FindBy(id="jobTitle_note")
	WebElement Note;
	
	@FindBy(name="btnSave")
    WebElement Save;
	
	@FindBy(name="btnSave")
	WebElement Cancel;
	

public OrangeHRM_AdminJob_JobTitles_AddJobTitlePage(WebDriver ldriver) {
	driver=ldriver;
	PageFactory.initElements(driver, this);
}

//Function is to AddJobTitle
public void JobTitle() {
	JobTitle.sendKeys("JobTitle");
}

//Function is to Add JobDescription
public void JobDescription() {
	JobDescription.sendKeys("JobDescription");
}

//Function is to add JobSpecification
public void JobSpec() {
	JobSpecification.click();
}

//Function is to add Note
public void Note() {
	Note.sendKeys("Note");
}

//Function is to ClickSave
public void Save() {
	Save.click();
}

//Function is to ClickCancel
public void Cancel() {
  Cancel.click();
  
}

}
