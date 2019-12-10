package director;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class sample {
	WebDriver driver;
	@BeforeTest
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\new install\\new project\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://192.168.1.22:86");
		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
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

	@Test
	public void logout() throws InterruptedException {
		
		Thread.sleep(1000*60*600);   // Test: 10 hrs 
		driver.findElement(By.id("ContentPlaceHolder1_lnkQuot")).click();
		driver.findElement(By.id("btnlogout")).click();
		


	}
	
	@AfterTest
	public void closebrowser() {
		driver.quit();
	}
}
