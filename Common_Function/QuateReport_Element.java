package Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuateReport_Element {
	WebDriver driver;

	By QuateReport = By.id("liQuoteRpt");

	By Quate_no = By.id("ContentPlaceHolder1_txtSearch");
	
	By CustomerCompany = By.id("ContentPlaceHolder1_txtCustomer");

	By Find = By.id("ContentPlaceHolder1_btnSearch");

	By claer = By.id("ContentPlaceHolder1_btnClear");
	
	By FromDatePOPUp = By.id("ContentPlaceHolder1_imgPopUp1");
	
	By ToDatePOPUp = By.id("ContentPlaceHolder1_imgPopUp2");
	
	By Revise = By.xpath("//*[@id=\"company\"]/div/table/tbody/tr[1]/td[6]");
	
	By revisesumbit = By.id("ContentPlaceHolder1_btnSubmit");
	
	//alert
	
	By FROMDate = By.id("ContentPlaceHolder1_CalendarExtender1_day_1_0");
	By TODate = By.id("ContentPlaceHolder1_CalendarExtender2_day_3_2");

	

	public QuateReport_Element (WebDriver driver) {

		this.driver=driver;
	}

	public void ClickQuateReport() {

		WebElement SelectClickQuateReport=driver.findElement(QuateReport);

			SelectClickQuateReport.click();
		
	}

	public void clickQuate_no(String Quateno) {

		WebElement EnterQuateNo =driver.findElement(Quate_no);

			EnterQuateNo.sendKeys(Quateno);

	}
	public void clickFind() {

		driver.findElement(Find).click();
		
	}
	
	public void ClickClear() {
		
		driver.findElement(claer).click();
	}
	
	public void EnterCustomerCompany(String entCustomerCompany) {
		
		driver.findElement(CustomerCompany).sendKeys(entCustomerCompany);
	}
	
	public void ClilckFromDatePOPUP() {
		
		driver.findElement(FromDatePOPUp).click();
	}
	
	public void ClickToDatePOPUP() {
		
		driver.findElement(ToDatePOPUp).click();
	}
	
	public void ClickRevise() {
		
		driver.findElement(Revise).click();
	}
	
	public void clickRevisesumbitButton() {
		
		driver.findElement(revisesumbit).click();
	}
	
	public void SetFROMDATE() {
		
		driver.findElement(FROMDate).click();
	}
	
	public void SetTODATE() {
		
		driver.findElement(TODate).click();
	}
	
}