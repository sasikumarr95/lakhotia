package director;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Conveyance {
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
		driver.switchTo().alert().accept();;


		driver.findElement(By.id("ContentPlaceHolder1_txtUserName")).sendKeys("sss");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("s123");
		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();	
	}
	@Test(priority=0)
	public void conveyance() throws IOException, InterruptedException {
		driver.findElement(By.id("liConveyance")).click();
		WebElement start_km = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtStart"));
		start_km.sendKeys("100");
		WebElement End_Km = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtEnd"));

		End_Km.sendKeys("250");
		WebElement exp1 =driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtOE1Amt"));
		exp1.sendKeys("50");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt1")).sendKeys("bus@![13]");
		
		WebElement file= driver.findElement(By.id("ContentPlaceHolder1_FileUpload4"));
		file.sendKeys(Keys.ENTER);
		Runtime.getRuntime().exec("D:\\SELENIUM\\autoit page\\image 1 Autoit.exe");
	}
	@Test(priority=1)
	public void Other_expenses() {
		WebElement exp2 =driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtOE2Amt"));
		exp2.sendKeys("a50");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt2")).sendKeys("bus@![14]");

		WebElement exp3=driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtOE3Amt"));
		exp3.sendKeys("a40");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt3")).sendKeys("bus@![15]");

		WebElement exp4 =driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtOE4Amt"));
		exp4.sendKeys("a50");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txt4")).sendKeys("bus@![16]");
		
		//driver.findElement(By.id("ContentPlaceHolder1_lnkSubmit")).click();
		
		driver.findElement(By.id("btnlogout")).click();
	}


}
