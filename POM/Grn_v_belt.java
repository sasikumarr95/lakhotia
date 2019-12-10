package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Grn_v_belt {
	WebDriver driver;

	By brandname = By.id("ContentPlaceHolder1_txtSearch");

	By assignbaranch = By.xpath("//*[@id=\"ctl01\"]/div[3]/div[6"
			+ "/div/div[2]/div[1]/table/tbody/tr/td[3]/div/button/span[1]");	
	
	By selectbranch = By.xpath("//*[@id=\"ctl01\"]/div[3]/div[6]/div/div[2"
			+ "/div[1]/table/tbody/tr/td[3]/div/div/ul/li[2]/a");
			

	By clear = By.id("ContentPlaceHolder1_lnkClear");

	By lengthsize = By.id("ContentPlaceHolder1_rptarn_txtLength_0");

	By qty = By.id("ContentPlaceHolder1_rptarn_txtQty_0");

	By buyprice = By.id("ContentPlaceHolder1_rptarn_txtRate_0");

	public void vbelt(WebDriver driver) {
		this.driver = driver;
	}

	public void setbrandname(String strBrandName) {
		
		driver.findElement(brandname).click();
		driver.findElement(brandname).sendKeys(strBrandName);
		
		driver.findElement(brandname).click();
	}

	public void setAssignBranch() {
		driver.findElement(assignbaranch).click();
	}
	
	public void select_Branch() {
		driver.findElement(selectbranch).click();
	}

	public void clickclear() {
		driver.findElement(clear).click();
	}

	public void setLengthSize(String StrLengthsize) {
		

		driver.findElement(lengthsize).sendKeys(StrLengthsize);
		
		driver.findElement(lengthsize).click();
	}

	public void Setqty(String StrQTY) {
		driver.findElement(qty).clear();

		driver.findElement(qty).sendKeys(StrQTY);
	}

	public void setbuyprice (String StrBuyPrice) {
		driver.findElement(buyprice).clear();

		driver.findElement(buyprice).sendKeys(StrBuyPrice);
	}
	
	
}