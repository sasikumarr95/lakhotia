package Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Conveyence_Elemenet {
	WebDriver driver;

	By Conveyance = By.id("liConveyance");

	By StartingKM = By.id("ContentPlaceHolder1_txtStart");

	By EndKM = By.id("ContentPlaceHolder1_txtEnd");

	By SpeedMeter_img = By.id("ContentPlaceHolder1_FileUpload1");

	By OtherExpenses1_name = By.id("ContentPlaceHolder1_txt1");

	By OtherExpenses1_Amount = By.id("ContentPlaceHolder1_txtOE1Amt");

	By OtherExpense1_img = By.id("ContentPlaceHolder1_FileUpload3");

	By OtherExpenses2_name = By.id("ContentPlaceHolder1_txt2");

	By OtherExpenses2_Amount = By.id("ContentPlaceHolder1_txtOE2Amt");

	By OtherExpense2_img = By.id("ContentPlaceHolder1_FileUpload2");

	By OtherExpenses3_name = By.id("ContentPlaceHolder1_txt3");

	By OtherExpenses3_Amount = By.id("ContentPlaceHolder1_txtOE3Amt");

	By OtherExpense3_img = By.id("ContentPlaceHolder1_FileUpload4");

	By OtherExpenses4_name = By.id("ContentPlaceHolder1_txt4");

	By OtherExpenses4_Amount = By.id("ContentPlaceHolder1_txtOE4Amt");

	By OtherExpense4_img = By.id("ContentPlaceHolder1_FileUpload5");
	
	By submit = By.id("ContentPlaceHolder1_lnkSubmit");


	public Conveyence_Elemenet (WebDriver driver) {

		this.driver=driver;
	}

	public void ClickConveyance() {

		driver.findElement(Conveyance).click();
	}

	public void EnterStartingKM(String entStartingKM) {

		WebElement startkm = driver.findElement(StartingKM);

		startkm.clear();

		startkm.sendKeys(entStartingKM);
	}

	public void EnterEndKM(String entEndKM) {

		WebElement Endkm = driver.findElement(EndKM);

		Endkm.clear();

		Endkm.sendKeys(entEndKM);
	}

	public void selectSpeedMeter_img(String selectMeter_img) {

		driver.findElement(SpeedMeter_img).sendKeys(selectMeter_img);
	}

	public void EnterOtherExpenses1_name(String entOtherExpenses1_name) {

		WebElement nameexp1 = driver.findElement(OtherExpenses1_name);

		nameexp1.clear();

		nameexp1.sendKeys(entOtherExpenses1_name);
	}

	public void EnterOtherExpenses1_Amount(String entOtherExpenses1_Amount) {

		WebElement amtexp1 = driver.findElement(OtherExpenses1_Amount);

		amtexp1.clear();

		amtexp1.sendKeys(entOtherExpenses1_Amount);
	}

	public void selectOtherExpense1_img(String chooseimg1) {

		driver.findElement(OtherExpense1_img).sendKeys(chooseimg1);
	}

	public void EnterOtherExpenses2_name(String entOtherExpenses2_name) {

		WebElement nameExp2 = driver.findElement(OtherExpenses2_name);

		nameExp2.clear();

		nameExp2.sendKeys(entOtherExpenses2_name);
	}
	
	public void EnterOtherExpenses2_Amount(String entOtherExpenses2_Amount) {
		
		WebElement amtExp2 = driver.findElement(OtherExpenses2_Amount);
		
		amtExp2.clear();
		
		amtExp2.sendKeys(entOtherExpenses2_Amount);
	}
	
	public void selectOtherExpense2_img(String chooseOtherExpense2_img) {
		
		driver.findElement(OtherExpense2_img).sendKeys(chooseOtherExpense2_img);
		
	}
	
	public void EnterOtherExpenses3_name(String entOtherExpenses3_name) {
		
		WebElement nameExp3 = driver.findElement(OtherExpenses3_name);
		
		nameExp3.clear();
		
		nameExp3.sendKeys(entOtherExpenses3_name);
		
	}
	
	public void EnterOtherExpenses3_Amount(String entOtherExpenses3_Amount) {
		
		WebElement amtExp3 = driver.findElement(OtherExpenses3_Amount);
		
		amtExp3.clear();
		
		amtExp3.sendKeys(entOtherExpenses3_Amount);
	}
	
	public void selectOtherExpense3_img(String chooseOtherExpense3_img) {
		
		driver.findElement(OtherExpense3_img).sendKeys(chooseOtherExpense3_img);
	}
	
	
	public void EnterOtherExpenses4_name(String entOtherExpenses4_name) {

		WebElement nameExp4 = driver.findElement(OtherExpenses4_name);

		nameExp4.clear();

		nameExp4.sendKeys(entOtherExpenses4_name);
	}
	
	public void EnterOtherExpenses4_Amount(String entOtherExpenses4_Amount) {
		
		WebElement amtExp4 = driver.findElement(OtherExpenses4_Amount);
		
		amtExp4.clear();
		
		amtExp4.sendKeys(entOtherExpenses4_Amount);
	}
	
	public void selectOtherExpense4_img(String chooseOtherExpense4_img) {
		
		driver.findElement(OtherExpense4_img).sendKeys(chooseOtherExpense4_img);
		
}
	public void ClickSubmit() {
		
		driver.findElement(submit).click();
	}
}
