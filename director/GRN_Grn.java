package director;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GRN_Grn {
	WebDriver driver;
	@BeforeTest
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\new install\\new project\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://192.168.1.22:86");
		driver.manage().window().maximize();
		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("ss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		driver.switchTo().alert().accept();


		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();	


	}

	@Test(priority=0)
	public void Asn() {
		WebElement GRN = driver.findElement(By.id("dbGRN"));
		Actions action = new Actions(driver);
		action.moveToElement(GRN).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("liarn"))).click();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"ctl01\"]"
				+ "/div[3]/div[6]/div/div[2]/div[1]/table/tbody/tr/td[3]/div/button/span[1]"));
		dropdown.click();
		Actions act = new Actions(driver);
		act.moveToElement(dropdown).build().perform();
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[6]/div/div[2]"
				+ "/div[1]/table/tbody/tr/td[3]/div/div/ul/li[3]/a/span[1]")).click();
		WebElement brand = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtSearch"));
		brand.sendKeys("Cnfulo");	brand.sendKeys(Keys.ENTER);
		driver.findElement(By.id("ContentPlaceHolder1_lnkClear")).click();
	}
	@Test(priority=1)
	public void Grn_product2() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[6]/div/div[2]"
				+ "/div[1]/table/tbody/tr/td[3]/div/button/span[1]"));
		dropdown1.click();
		Actions act = new Actions(driver);
		act.moveToElement(dropdown1).build().perform();
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[6]/div/div[2]"
				+ "/div[1]/table/tbody/tr/td[3]/div/div/ul/li[2]/a/span[1]")).click();
		WebElement brand = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtSearch"));
		brand.sendKeys("Fenner");	brand.sendKeys(Keys.ENTER);

	}

	@Test(priority=2)
	public void qty() {
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$rptarn$ctl01$txtLength")).sendKeys("1100-5M");
		WebElement with = driver.findElement(By.id("ContentPlaceHolder1_rptarn_txtwidth_0"));
		with.clear();with.sendKeys("150");

		WebElement Qty = driver.findElement(By.id("ContentPlaceHolder1_rptarn_txtQty_0"));
		Qty.clear();Qty.sendKeys("50");

		WebElement Buy_Price = driver.findElement(By.id("ContentPlaceHolder1_rptarn_txtRate_0"));
		Buy_Price.clear();Buy_Price.sendKeys("20");
	}

	@Test(priority=3)
	public void qty2() throws InterruptedException {
		driver.findElement(By.id("ContentPlaceHolder1_rptarn_btnAdd_0")).click();

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$rptarn$ctl02$txtLength")).sendKeys("500B-MXL");
		WebElement with = driver.findElement(By.id("ContentPlaceHolder1_rptarn_txtwidth_1"));
		with.clear();with.sendKeys("250");

		WebElement Qty = driver.findElement(By.id("ContentPlaceHolder1_rptarn_txtQty_1"));
		Qty.clear();Qty.sendKeys("90");

		WebElement Buy_Price = driver.findElement(By.id("ContentPlaceHolder1_rptarn_txtRate_1"));
		Buy_Price.clear();Buy_Price.sendKeys("40");

		driver.findElement(By.id("ContentPlaceHolder1_lnkSubmit")).click();
		
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.id("btnlogout")).click();
	}
}

