package director;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_Report {
	WebDriver driver;
	@BeforeTest
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\new install\\new project\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://192.168.1.22:86");
		driver.manage().window().maximize();	

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s1234");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("ss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		driver.switchTo().alert().accept();;

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();	
	}
	@Test(priority=0)
	public void Day_report() {
		driver.findElement(By.id("liDayRpt")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCompanyvisited"))
		.sendKeys("Testing @'.lv1");

		WebElement address =driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtAddress"));
		address.sendKeys("12,wt street,chennai");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("address print");

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$rptdayrpt$ctl01$txtContactPerson"))
		.sendKeys("test123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$rptdayrpt$ctl01$txtDepartment"))
		.sendKeys("test@#1 belt");
		driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtContactNo_0"))
		.sendKeys("ddd@1234");
		driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtEmail_0"))
		.sendKeys("s&$123@gmail.com");
		driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtFeedBack_0"))
		.sendKeys("call back testing@12.3");
	}
		
		@Test(priority=1)
		public void Add_report() {
			driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_btnAdd_0")).click();
			driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtContactPerson_1"))
			.sendKeys("Testing2 1@[:!");
			driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtDepartment_1"))
			.sendKeys("cc12@");
			driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtContactNo_1"))
			.sendKeys("@{*123ws23");
			driver.findElement(By.id("ContentPlaceHolder1_rptdayrpt_txtEmail_1"))
			.sendKeys("hello@Testing;12");
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$rptdayrpt$ctl02$txtFeedBack"))
			.sendKeys("testing @{!223feeback");
			
			driver.findElement(By.id("ContentPlaceHolder1_lnkSubmit")).click();
			
			driver.findElement(By.id("btnlogout")).click();
		}
		@AfterTest
		public void TearDown() {
			driver.quit();
		}

	}

