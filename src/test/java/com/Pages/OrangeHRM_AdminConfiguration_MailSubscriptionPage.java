package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AdminConfiguration_MailSubscriptionPage {
	/****
	 * * Author Pradeep *
	 */
	
WebDriver driver;
@FindBy(id="btnEdit")
WebElement EditMailConfiguration;
@FindBy(linkText="Leave Applications")
WebElement LeaveApplicationLink;
@FindBy(linkText="Leave Assignments")
WebElement LeaveAssignmentLink;
@FindBy(linkText="Leave Approvals")
WebElement LeaveApprovalLink;
@FindBy(linkText="Leave Cancellations")
WebElement LeaveCancellationLink;
@FindBy(linkText="Leave Rejections")
WebElement LeaveRejectionLink;

@FindBy(id="ohrmList_chkSelectRecord_1")
WebElement SelectLeaveApplication;

@FindBy(id="ohrmList_chkSelectRecord_2")
WebElement  SelectLeaveAssignments;


@FindBy(id="ohrmList_chkSelectRecord_3")
WebElement SelectLeaveApprovals;

@FindBy(id="ohrmList_chkSelectRecord_4")
WebElement SelectLeaveCancelations;

@FindBy(id="ohrmList_chkSelectRecord_5")
WebElement SelectLeaveRejections;
public OrangeHRM_AdminConfiguration_MailSubscriptionPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void EditMailConfiguration() {
	EditMailConfiguration.click();
}
public void LeaveApplicationLink() {
	LeaveApplicationLink.click();
}
public void LeaveAssignmentLink() {
	LeaveAssignmentLink.click();
}
public void LeaveCancellationLink() {
	LeaveCancellationLink.click();
}
public void LeaveRejectionLink() {
	LeaveRejectionLink.click();
}
public void LeaveApprovalLink() {
	LeaveApprovalLink.click();
}
public void SelectLeaveApplication() {
	SelectLeaveApplication.click();
}
public void SelectLeaveAssignments() {
	SelectLeaveAssignments.click();
}
public void SelectLeaveApprovals() {
	SelectLeaveApprovals.click();
}
public void SelectLeaveCancelations() {
	SelectLeaveCancelations.click();
}
public void SelectLeaveRejections() {
	SelectLeaveRejections.click();
}

}