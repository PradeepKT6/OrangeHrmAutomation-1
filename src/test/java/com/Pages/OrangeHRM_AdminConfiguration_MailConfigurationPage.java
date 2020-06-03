package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminConfiguration_MailConfigurationPage {
	/****
	 * * Author Pradeep *
	 */
	
WebDriver driver;
@FindBy(id="emailConfigurationForm_txtTestEmail")
WebElement EditConfiguration;

@FindBy(id="emailConfigurationForm_txtMailAddress")
WebElement MailSentAsConfiguration;

@FindBy(id="emailConfigurationForm_cmbMailSendingMethod")
WebElement SendingMethodConfiguration;

@FindBy(id="emailConfigurationForm_txtTestEmail")
WebElement TestEmailAddress;

@FindBy(name="emailConfigurationForm[chkSendTestEmail]")
WebElement SentTestMailConfiguration;

@FindBy(name="emailConfigurationForm[txtTestEmail]")
WebElement TestMailAddrsessConfiguration;

@FindBy(id="editBtn")
WebElement SaveConfiguration;

public OrangeHRM_AdminConfiguration_MailConfigurationPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
//Function is to EditConfiguration
public void EditConfiguration() {
	 EditConfiguration.click();
}
//Function is to MailSentAsConfiguration
 public void MailSentAsConfiguration() {
	 MailSentAsConfiguration.click();
 }
//Function is to SendingMethodConfiguration
	 public void SendingMethodConfiguration() {
	 SendingMethodConfiguration.click();
 }
	//Function is to TestEemailAddressConfiguration
	 public void TestEmailAddress() {
		 TestEmailAddress.click();
	 }
	//Function is to SentTestMailConfiguration
	 public void SentTestMailConfiguration() {
		 SentTestMailConfiguration.click();
	 }
	//Function is to TestMailAddressConfiguration
	 public void TestMailAddrsessConfiguration() {
		 TestMailAddrsessConfiguration.click();
	 }
	//Function is to SaveConfiguration
	 public void SaveConfiguration() {
		 SaveConfiguration.click();
	 }
 }

