package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import login_page.loginpage;

public class logintest {
	WebDriver driver;
	
	String driverPath ="D:\\new install\\new project\\chromedriver\\chromedriver.exe";
	
	loginpage objlogin;
	
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://192.168.1.22:86");
	}
	@Test
	public void Home_page_Test() {
		objlogin = new loginpage(driver);

		String loginpagetitle = objlogin.getLoginTitle();
		
		objlogin.loginpage("sss", "s123");

	

	}
	 
}
