package testcase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import login_page.loginpage;
import login_page.pomlogin;

public class lakhotia {
	
WebDriver driver;
	
	String driverPath ="D:\\new install\\new project\\chromedriver\\chromedriver.exe";
	
	loginpage objlogin;
   
	@BeforeTest
   public void openurl() {
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://192.168.1.22:86");
	}
	@Test
	public void log_in() {
		objlogin = new loginpage(driver);
		
		objlogin.loginpage("sss1", "s123");
		
		objlogin.loginpage("sss", "s12");
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		objlogin.loginpage("sss", "s123");
	}
	
}
