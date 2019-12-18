package Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Quate_Element {
	WebDriver driver;

	By Quote = By.id("liQuotation");

	By New_Quate = By.id("ContentPlaceHolder1_lnkQuot");

	By Company_name = By.id("ContentPlaceHolder1_txtNewCustomer");

	By Company_Address = By.id("ContentPlaceHolder1_txtAddress");

	By GST = By.id("ContentPlaceHolder1_txtgstno");

	By ContactPerson = By.id("ContentPlaceHolder1_txtContactPerson");

	By contactNo = By.id("ContentPlaceHolder1_txtContactNo");

	By CompanyREFNO = By.id("ContentPlaceHolder1_txtCompRefNo");

	By EmnaiID = By.id("ContentPlaceHolder1_txtEamil");

	By Department = By.id("ContentPlaceHolder1_txtDepartment");

	By ItemCode = By.id("ContentPlaceHolder1_rptQuot_txtitemcode_0");

	By Specification = By.id("ContentPlaceHolder1_rptQuot_txtspecification_0");

	By HSN = By.id("ContentPlaceHolder1_rptQuot_txthsncode_0");

	By QTY = By.id("ContentPlaceHolder1_rptQuot_txtqty_0");

	By UnitRate = By.id("ContentPlaceHolder1_rptQuot_txtrate_0");

	By Discount = By.id("ContentPlaceHolder1_rptQuot_txtDiscount_0");

	By Gst = By.id("ContentPlaceHolder1_rptQuot_txtgst_0");

	By AddItems=By.id("ContentPlaceHolder1_rptQuot_btnAdd_0");

	By BranchName = By.xpath("//*[@id=\"ContentPlaceHolder1_panelhide\"]/div/"
			+ "div[1]/div[2]/table/tbody/tr[1]/td[1]/div/button/span[1]");

	By DelivertTerms = By.id("ContentPlaceHolder1_txtDT");

	By FrightCharge = By.id("ContentPlaceHolder1_txtFC");

	By P_F=By.id("ContentPlaceHolder1_txtFC");

	By Special_Remarks =By.id("ContentPlaceHolder1_txtsplremarks");

	By payment_Terms = By.id("//*[@id=\"ContentPlaceHolder1_panelhide\"]/div/div[1]"
			+ "/div[2]/table/tbody/tr[2]/td[2]/div/button/span[1]");

	By Commission = By.id("ContentPlaceHolder1_txtCommission");

	By QuateBy = By.id("ContentPlaceHolder1_ddlEmployeeName");

	By SUBMIT =By.id("ContentPlaceHolder1_btnSubmit");





	public Quate_Element (WebDriver driver) {

		this.driver=driver;
	}

	public void clickQuate() {

		driver.findElement(Quote).click();

	}

	public void ClickNewQuate() {

		driver.findElement(New_Quate).click();

	}

	public void EnterCompany_Name(String EntCompany_name) {

		driver.findElement(Company_name).sendKeys(EntCompany_name);

	}

	public void EnterCompanyAddress(String EntCompanyAddress ) {

		WebElement address =driver.findElement(Company_Address);
		address.sendKeys(EntCompanyAddress);
		/*
		if (address != null)
		{ 
			address.clear(); 
			address.sendKeys(EntCompanyAddress);
		}
*/
	}

	public void EnterGST(String EntGST) {

		driver.findElement(GST).sendKeys(EntGST);

	}

	public void EnterContactPerson(String EntContactPerson) {

		driver.findElement(ContactPerson).sendKeys(EntContactPerson);

	}

	public void EnterContact_No(String entContact_No) {

		driver.findElement(contactNo).sendKeys(entContact_No);

	}

	public void EnterCompanyRefNo(String entCompanyRefNo) {

		driver.findElement(CompanyREFNO).sendKeys(entCompanyRefNo);

	}

	public void EnterEmaiID(String entEmailID) {

		driver.findElement(EmnaiID).sendKeys(entEmailID);

	}

	public void EnterDepartment(String EntDepartment) {

		driver.findElement(Department).sendKeys(EntDepartment);

	}

	public void EnterItemCode(String EntItemCode) {

		driver.findElement(ItemCode).sendKeys(EntItemCode);

	}

	public void EnterSpecification(String EntSpecification) {

		driver.findElement(Specification).sendKeys(EntSpecification);
	}

	public void EnterHSN(String EntHSN) {

		driver.findElement(HSN).sendKeys(EntHSN);
	}

	public void EnterQty(String EntQty) {

		driver.findElement(QTY).clear();

		driver.findElement(QTY).sendKeys(EntQty);
	}
	
	public void EnterUnitRate(String EntUnitRate) {
		
		driver.findElement(UnitRate).clear();
		
		driver.findElement(UnitRate).sendKeys(EntUnitRate);
	}

	public void EnterDiscount(String EntDiscount) {

		driver.findElement(Discount).clear();

		driver.findElement(Discount).sendKeys(EntDiscount);
	}

	public void SetGst(String gstset) {

		driver.findElement(Gst).clear();

		driver.findElement(Gst).sendKeys(gstset);
	}

	public void AddItem() {

		driver.findElement(AddItems).click();
	}

	public void SetBranchName() {

		driver.findElement(BranchName).click();
	}

	public void EnterDelivertTerms(String EntDelivertTerms) {

		driver.findElement(DelivertTerms).sendKeys(EntDelivertTerms);
	}

	public void EnterFrightCharge(String entFrightCharge) {

		driver.findElement(FrightCharge).clear();

		driver.findElement(FrightCharge).sendKeys(entFrightCharge);
	}
	
	public void EnterP_F(String entPF) {
		
		driver.findElement(P_F).clear();
		
		driver.findElement(P_F).sendKeys(entPF);
	}
	
	public void EnterSpecial_Remarks(String entSpecialRemarks) {
		 
		driver.findElement(Special_Remarks).sendKeys(entSpecialRemarks);
	}
	
	public void Setpayment_Terms() {
		
		driver.findElement(payment_Terms).click();
	}
	
	public void EnterCommission(String entCommission) {
		
		driver.findElement(Commission).clear();
		
		driver.findElement(Commission).sendKeys(entCommission);
	}
	
	public void SelectQuateBy() {
		
		driver.findElement(QuateBy).click();
	}
	
	public void clickSUBMIT() {
		
		driver.findElement(SUBMIT).click();
	}
}