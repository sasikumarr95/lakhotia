package login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	
	By userso = By.id("ContentPlaceHolder1_txtUserName");
	
	By passwordso = By.id("ContentPlaceHolder1_txtPassword");
	
	By titletext = By.xpath("//*[@id=\"ctl01\"]/div[3]/div[1]/div/div[1]/div/div/a/img");
	
	By submit = By.id("ContentPlaceHolder1_btnSubmit");
	
	public loginpage (WebDriver driver) {
		
		this.driver=driver;
	}
	public void setusername(String strusername) {
		
		driver.findElement(userso).sendKeys(strusername);
	}
	public void setpassword(String strpassword) {
		
		driver.findElement(passwordso).sendKeys(strpassword);
	}
	public void clicklogin() {
		
		driver.findElement(submit).click();
	}
	public String getLoginTitle() {
		
		return driver.findElement(titletext).getText();
	}
	public void loginpage(String strusername,String strpassword) {
		
		this.setusername(strusername);
		
		this.setpassword(strpassword);
		
		this.clicklogin();
	}
	

}
