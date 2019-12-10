package director;

import java.util.concurrent.TimeUnit;

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

public class Technican_CompletedList_OutofStock {
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
/*@Test(priority=0)
public void WorkCompleted() throws InterruptedException {
	WebElement technican = driver.findElement(By.id("dbTechnician"));
	Actions action = new Actions(driver);
	action.moveToElement(technican).build().perform();
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("liAssignRpt"))).click();
	
	driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtInvoiceNo_15")).sendKeys("Ad@1[s]");
	driver.findElement(By.id("ContentPlaceHolder1_rptPending_LnkEdit_15")).click();
	Thread.sleep(3000);
	Alert alt = driver.switchTo().alert();
	alt.accept();
}*/
@Test(priority=1)
public void OutOfstock() {
	WebElement technican = driver.findElement(By.id("dbTechnician"));
	Actions action = new Actions(driver);
	action.moveToElement(technican).build().perform();
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("liOutofStock"))).click();

	driver.findElement(By.xpath
			("//*[@id=\"company\"]/div/table/tbody/tr/td[8]/div/button/span[1]")).click();
	driver.findElement(By.xpath
			("//*[@id=\"company\"]/div/table/tbody/tr/td[8]/div/div/ul/li[7]/a")).click();
	driver.findElement(By.id("ContentPlaceHolder1_rptPending_LnkEdit_0")).click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
	driver.findElement(By.id("btnlogout")).click();
}
}