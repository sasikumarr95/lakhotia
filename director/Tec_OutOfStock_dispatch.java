package director;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tec_OutOfStock_dispatch {
WebDriver driver;
@BeforeTest
public void login() {
	System.setProperty("webdriver.chrome.driver", "D:\\new install\\new project\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://192.168.1.22:86");
	driver.manage().window().maximize();	

	driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtUserName")).sendKeys("s.tec");
	driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtPassword")).sendKeys("s123");
	driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();

	driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("s.tec");
	driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
	driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
	driver.switchTo().alert().accept();

	driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("s.tec");
	driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
	driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();	
}
/*@Test
public void Readyfor_dispatch() {
	driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_rptPending_LnkEdit_0\"]/i")).click();
	Alert alt = driver.switchTo().alert();
	alt.accept();
}*/


	@Test
	public void Out_of_Stock() {
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_rptPending_LnkOut_0\"]s")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
}

