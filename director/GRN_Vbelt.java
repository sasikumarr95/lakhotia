package director;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Grn_v_belt;
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
	
	@Test
	public void Vbelt() {
		WebElement GRN = driver.findElement(By.id("dbGRN"));
		Actions action = new Actions(driver);
		action.moveToElement(GRN).build().perform();
		driver.findElement(By.id("lipugrn")).click();
		
		WebElement brand =driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtSearch"));
		brand.click();
		brand.sendKeys("ban");
		
		
	}
}
