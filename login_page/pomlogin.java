package login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomlogin {
	  WebDriver driver;

By userso = By.name("ctl00$ContentPlaceHolder1$txtUserName");

By Passwordso = By.id("ContentPlaceHolder1_txtPassword");

By login = By.id("ContentPlaceHolder1_btnSubmit");

public void loginpage(WebDriver driver) {
	
	this.driver = driver;
}
public void setusername(String Strusername) {
	
	driver.findElement(userso).sendKeys(Strusername);
}
public void setpassword(String strpassword) {
	driver.findElement(Passwordso).sendKeys(strpassword);
}
public void clicksubmit() {
	driver.findElement(login).click();
}
}
