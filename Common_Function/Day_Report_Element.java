package Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Day_Report_Element {
	WebDriver driver;

	By Dayreport = By.id("liDayRpt");

	By VisitCompany_Name = By.name("ctl00$ContentPlaceHolder1$txtCompanyvisited");

	By Address =By.name("ctl00$ContentPlaceHolder1$txtAddress");

	By ContactPerson = By.name("ctl00$ContentPlaceHolder1$rptdayrpt$ctl01$txtContactPerson");

	By Department = By.name("ctl00$ContentPlaceHolder1$rptdayrpt$ctl01$txtDepartment");

	By ContactNo = By.id("ContentPlaceHolder1_rptdayrpt_txtContactNo_0");

	By Email_ID = By.id("ContentPlaceHolder1_rptdayrpt_txtEmail_0");

	By Feedback = By.id("ContentPlaceHolder1_rptdayrpt_txtFeedBack_0");
	
	By Submit = By.id("ContentPlaceHolder1_lnkSubmit");
	
	//ADD
	By AddDetails= By.id("ContentPlaceHolder1_rptdayrpt_btnAdd_0");
	
	By ContactPerson1 = By.id("ContentPlaceHolder1_rptdayrpt_txtContactPerson_1");
	
	By Department1 = By.id("ContentPlaceHolder1_rptdayrpt_txtDepartment_1");
	
	By ContactNo1 = By.id("ContentPlaceHolder1_rptdayrpt_txtContactNo_1");
	
	By Email_ID1 = By.id("ContentPlaceHolder1_rptdayrpt_txtEmail_1");
	
	By Feedback1 = By.name("ctl00$ContentPlaceHolder1$rptdayrpt$ctl02$txtFeedBack");
	
	
	public Day_Report_Element (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void Click_DayReport() {
		
		driver.findElement(Dayreport).click();
	}
	
	public void EnterVisitCompany_Name(String EntVisitCompany_Name) {
		
		driver.findElement(VisitCompany_Name).sendKeys(EntVisitCompany_Name);
	}
	
	public void EnterAddress(String EntAddress) {
		
		driver.findElement(Address).sendKeys(EntAddress);
	}

	public void EneterContactPerson(String EntContactPerson ) {
		
		driver.findElement(ContactPerson).sendKeys(EntContactPerson);
	}
	
	public void EnterDepartment(String EntDepartment) {
		
		driver.findElement(Department).sendKeys(EntDepartment);
	}
	
	public void EnterContactNo(String EntContactNo) {
		
		driver.findElement(ContactNo).sendKeys(EntContactNo);
	}
	
	public void EnterEmail_ID(String EntEmail_ID) {
		
		driver.findElement(Email_ID).sendKeys(EntEmail_ID);
	}
	
	public void EnterFeedback(String EntFeedback) {
		
		driver.findElement(Feedback).sendKeys(EntFeedback);
	}
	
	public void ClickSubmitButton() {
		
		driver.findElement(Submit).click();
	}
	
	//Add
	
	public void ClickAddDetails() {
		
		driver.findElement(AddDetails).click();
	}
	
	public void EneterContactPerson1(String EntContactPerson1 ) {
		
		driver.findElement(ContactPerson1).sendKeys(EntContactPerson1);
	}
	
	public void EnterDepartment1(String EntDepartment1) {
		
		driver.findElement(Department1).sendKeys(EntDepartment1);
	}
	
	public void EnterContactNo1(String EntContactNo1) {
		
		driver.findElement(ContactNo1).sendKeys(EntContactNo1);
	}
	
	public void EnterEmail_ID1(String EntEmail_ID1) {
		
		driver.findElement(Email_ID1).sendKeys(EntEmail_ID1);
	}
	
	public void EnterFeedback1(String EntFeedback1) {
		
		driver.findElement(Feedback1).sendKeys(EntFeedback1);
	}
	
	
}
