package Common_Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GRN_Element {
	WebDriver driver;

	By GRNBAR = By.id("dbGRN");

	By GRN = By.id("liarn");

	By BrandName = By.id("ContentPlaceHolder1_txtSearch");

	By AssignBranch_DropDown = By.xpath("//*[@id=\"ctl01\"]/div[3]"
			+ "/div[6]/div/div[2]/div[1]/table/tbody/tr/td[3]/div/button/span[1]");

	By AssingnBranch = By.xpath("//*[@id=\"ctl01\"]/div[3]/div[6]"
			+ "/div/div[2]/div[1]/table/tbody/tr/td[3]/div/div/ul/li[2]/a/span[1]");

	By clear = By.id("ContentPlaceHolder1_lnkClear");

	By Length_pitch = By.id("ContentPlaceHolder1_rptarn_txtLength_0");

	By Width = By.id("ContentPlaceHolder1_rptarn_txtwidth_0");

	By QTY = By.id("ContentPlaceHolder1_rptarn_txtQty_0");
					
	By BuyPrice = By.id("ContentPlaceHolder1_rptarn_txtRate_0");

	//ADD

	By ADDbelt = By.id("ContentPlaceHolder1_rptarn_btnAdd_0");

	By Length_pitch1 = By.id("ContentPlaceHolder1_rptarn_txtLength_1");

	By Witdh1 = By.id("ContentPlaceHolder1_rptarn_txtwidth_1");

	By QTY1 = By.id("ContentPlaceHolder1_rptarn_txtQty_1");

	By BuyPrice1 =By.id("ContentPlaceHolder1_rptarn_txtRate_1");

	By submit = By.id("ContentPlaceHolder1_lnkSubmit");
	
//V_belt
	
	By V_Belt = By.id("lipugrn");


	public GRN_Element(WebDriver driver) {

		this.driver=driver;
	}

	public void ClickGRN() {

		WebElement grn = driver.findElement(GRNBAR);

		Actions action = new Actions(driver);

		action.moveToElement(grn).build().perform();

		WebDriverWait wait = new WebDriverWait(driver,20);

		wait.until(ExpectedConditions.elementToBeClickable(GRN)).click();

	}

	public void SelectBrandName(String ChooseBrandName) {

		WebElement bandname = driver.findElement(BrandName);
		
		bandname.click();
		
		bandname.sendKeys(ChooseBrandName);

		bandname.sendKeys(Keys.ENTER);

	}

	public void SetAssignBranch() {

		driver.findElement(AssignBranch_DropDown).click();

		driver.findElement(AssingnBranch).click();
	}

	public void Clickclear() {

		driver.findElement(clear).click();
	}

	public void selectLength_pitch(String chooseLength_pitch) {

		WebElement length =driver.findElement(Length_pitch);

		length.sendKeys(chooseLength_pitch);
		
		

	}

	public void EnterWitdh(String entWitdh) {

		WebElement witdh = driver.findElement(Width);

		witdh.clear();

		witdh.sendKeys(entWitdh);
	}

	public void EnterQTY(String entQTY) {

		WebElement quantity = driver.findElement(QTY);

		quantity.clear();

		quantity.sendKeys(entQTY);
	}

	public void EnterBuyPrice(String EntBuyPrice) {

		WebElement buypriceMM = driver.findElement(BuyPrice);

		buypriceMM.clear();

		buypriceMM.sendKeys(EntBuyPrice);
	}

	//add


	public void ClickADDbelt() {

		driver.findElement(ADDbelt).click();
	}

	public void selectLength_pitch1(String chooseLength_pitch1) {

		WebElement length1 =driver.findElement(Length_pitch1);

		length1.sendKeys(chooseLength_pitch1);

	}

	public void EnterWitdh1(String entWitdh1) {

		WebElement witdh1 = driver.findElement(Witdh1);

		witdh1.clear();

		witdh1.sendKeys(entWitdh1);
	}

	public void EnterQTY1(String entQTY1) {

		WebElement quantity1 = driver.findElement(QTY1);

		quantity1.clear();

		quantity1.sendKeys(entQTY1);
	}

	public void EnterBuyPrice1(String EntBuyPrice1) {

		WebElement buypriceMM1 = driver.findElement(BuyPrice1);

		buypriceMM1.clear();

		buypriceMM1.sendKeys(EntBuyPrice1);
	}

	public void Clicksubmit() {

		driver.findElement(submit).click();
	}
	
	public void ClickV_Belt() {

		WebElement grn = driver.findElement(GRNBAR);

		Actions action = new Actions(driver);

		action.moveToElement(grn).build().perform();

		WebDriverWait wait = new WebDriverWait(driver,20);

		wait.until(ExpectedConditions.elementToBeClickable(V_Belt)).click();
	}
}
