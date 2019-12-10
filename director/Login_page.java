package director;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_page {
	WebDriver driver;
	@Test(priority=0)
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\new install\\new project\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://192.168.1.22:86");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();

		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("ss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		driver.switchTo().alert().accept();;


		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();	
	}

	@Test(priority=1)
	public void Reset_password () {
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtnewpwd")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_txtconfirmpwd")).sendKeys("s123");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnSubmit")).click();
		
	}	 
}





