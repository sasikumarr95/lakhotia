package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login_page.loginpage;

public class GRN_Vbelt {
	WebDriver driver;

	String driverPath = "D:\\new install\\new project\\chromedriver\\chromedriver.exe";

	loginpage objlogin;
	
	Grn_v_belt objGrnVbelt;

	@BeforeTest
	public void url() {
		System.setProperty("webdriver.chrome.driver",driverPath);

		driver = new ChromeDriver();

		driver.get("http://192.168.1.22:86");
		
		driver.manage().window().maximize();

		objlogin = new loginpage (driver);

		objlogin.loginpage("ss","s123");

		objlogin.loginpage("sss","s1234");

		Alert alt = driver.switchTo().alert();
		alt.accept();

		objlogin.loginpage("sss","s123");
	}
	@Test(priority=0)
	public void Grn_VBelet() {
		 
		WebElement technican = driver.findElement(By.id("dbGRN"));
		Actions action = new Actions(driver);
		action.moveToElement(technican).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lipugrn"))).click();
		
	            

		objGrnVbelt = new Grn_v_belt ();
		
		objGrnVbelt.setbrandname("Ban");
		
		
		
		objGrnVbelt.setAssignBranch();
		
		objGrnVbelt.select_Branch();
		
		objGrnVbelt.clickclear();
	
		}
		@Test(priority=1)
		public void re_assign() {
			
			
			objGrnVbelt.setbrandname("Gates");
			
			objGrnVbelt.setAssignBranch();
			
			objGrnVbelt.select_Branch();

			objGrnVbelt.setLengthSize("1150-2/7M");
			
			
			objGrnVbelt.Setqty("20");
			
			objGrnVbelt.setbuyprice("400");
		
		
		
		}
	}
	       
	
			
		
	
