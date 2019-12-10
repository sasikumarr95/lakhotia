package director;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Quote_wronginfo {
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
	public void Quotation() {
		driver.findElement(By.id("ContentPlaceHolder1_lnkQuot")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtNewCustomer")).sendKeys("LUCAS TVS");
		WebElement product1=driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtitemcode_0"));
		product1.sendKeys("11",Keys.ENTER);
		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtspecification_0"))
		.sendKeys("testing 1");
		
		WebElement com_address = driver.findElement(By.id("ctl00$ContentPlaceHolder1$txtAddress"));
		com_address.click();com_address.sendKeys(Keys.CONTROL+"a");
		com_address.sendKeys(Keys.DELETE);com_address.sendKeys("testing");
		
		
		WebElement contact_no =driver.findElement(By.id("ctl00$ContentPlaceHolder1$txtContactNo"));
		contact_no.sendKeys(Keys.CONTROL+"a");
		contact_no.sendKeys(Keys.DELETE);
		contact_no.sendKeys("1234123");


		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtitemcode_0")).sendKeys("00");
		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtspecification_0"))
		.sendKeys("testing 1");
		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txthsncode_0")).sendKeys("123");

		WebElement email = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtEamil"));
		email.sendKeys(Keys.CONTROL+"a");
		email.sendKeys(Keys.DELETE);

		email.sendKeys("sasikumarr95@gmail.com");
		
		
	}
	
		
		
}

