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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Revise_Quate_Report {
	WebDriver driver;
	@BeforeTest
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\new install\\new project\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://192.168.1.22:86");
		driver.manage().window().maximize();	

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s12344");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("ss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		driver.switchTo().alert().accept();;

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
	}
	@Test
	//(priority=0)
	(enabled=false)
	public void revise_quate() throws InterruptedException {
		driver.findElement(By.id("ContentPlaceHolder1_lnkRevised")).click();
		WebElement Quate_no=driver.findElement(By.xpath("//input[@placeholder='Search Quote No.']"));
		Quate_no.sendKeys("00845");Quate_no.sendKeys(Keys.ENTER);

		WebElement Discount = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtDiscount_0"));
		Discount.clear();Discount.sendKeys("5");

		WebElement commission = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCommission"));
		commission.clear();commission.sendKeys("25");

		WebElement payment = driver.findElement(By.xpath
				("//*[@id=\"ContentPlaceHolder1_panelhide\"]/div/div[1]/div[2]"
						+ "/table/tbody/tr[2]/td[2]/div/button/span[1]"));
		payment.click();
		Actions action = new Actions(driver);
		action.moveToElement(payment);
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_panelhide\"]"
				+ "/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/ul/li[5]/a/span[1]"))
		.click();
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		Thread.sleep(4000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Revise done successfully");

	}
	@Test
	//(priority=1)
	(enabled=false)
	public void Quate_report() {
		driver.findElement(By.id("liQuoteRpt")).click();
		driver.findElement(By.id("ContentPlaceHolder1_rptQuote_lnkView_0")).click();
		WebElement Revise_qty = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtqty_0"));
		Revise_qty.clear();Revise_qty.sendKeys("25");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Revise Quate_Report done sucessfully");
	}
	@Test(priority=2)
	public void Quate_Report1()  {
		driver.findElement(By.id("liQuoteRpt")).click();
		WebElement Quatation_no = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtSearch"));
		Quatation_no.sendKeys("00843");
		driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("ContentPlaceHolder1_btnClear")).click();

		WebElement company_name = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCustomer"));
		company_name.sendKeys("Amazon");
		driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("ContentPlaceHolder1_btnClear")).click();
	}
	@Test(priority=3)
	public void date() throws InterruptedException{
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$imgPopUp1")).click();
		driver.findElement(By.id("ContentPlaceHolder1_CalendarExtender1_prevArrow")).click();

		WebElement date = driver.findElement(By.xpath("//div[@title='Wednesday, November 27, 2019']"));

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",date);		 

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$imgPopUp2")).click();
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_CalendarExtender2_day_1_5\"]")).click();
		driver.findElement(By.id("ContentPlaceHolder1_btnSearch")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ContentPlaceHolder1_btnClear")).click();
		
		//driver.findElement(By.id("btnlogout")).click();
		
	}	
		
@AfterTest
public void TearDown() {
	//driver.quit();
}

	}

