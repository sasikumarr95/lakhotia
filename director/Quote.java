package director;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Quote {
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

	@Test(priority=0)
	public void Quotation() {
		driver.findElement(By.id("ContentPlaceHolder1_lnkQuot")).click();
		WebElement select = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtNewCustomer"));
		select.sendKeys("LUCAS TVS");
		select.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtspecification_0"))
		.sendKeys("testing 1");

		WebElement product1=driver.findElement(By.xpath("//input[@placeholder='Type Search Only']"));
		product1.sendKeys("A23WG");
		
		product1.sendKeys(Keys.ENTER);
				
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txthsncode_0")).sendKeys("hsn123");

		WebElement email = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtEamil"));
		email.sendKeys(Keys.CONTROL+"a");
		email.sendKeys(Keys.DELETE);

		email.sendKeys("sasikumarr95@gmail.com");
	}
	@Test(priority=1)
	public void no_of_items() {
		WebElement GST = driver.findElement(By.id("ContentPlaceHolder1_txtgstno"));
		GST.clear();GST.sendKeys("TEST123");

		driver.findElement(By.id("ContentPlaceHolder1_txtCompRefNo")).sendKeys("test123");

		WebElement qty = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtqty_0"));
		qty.clear();qty.sendKeys("20");

		WebElement UnitRate = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtrate_0"));
		UnitRate.clear();UnitRate.sendKeys("250");

		WebElement discount = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtDiscount_0"));
		discount.clear();discount.sendKeys("1");
	}
	@Test
	(enabled=false)
	//(priority=2)
	public void product_2() {
		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_btnAdd_0")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement product2=driver.findElement(By.name("ctl00$ContentPlaceHolder1$rptQuot$ctl02$txtitemcode"));
		product2.sendKeys("11");
		product2.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtspecification_1"))
		.sendKeys("testing2");

		driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txthsncode_1")).sendKeys("222");
		WebElement qty = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtqty_1"));
		qty.clear();qty.sendKeys("30");

		WebElement UnitRate = driver.findElement(By.id("ContentPlaceHolder1_rptQuot_txtrate_1"));
		UnitRate.clear();UnitRate.sendKeys("100");
	}

	@Test(priority=3)
	public void baranch_DT_pay() {
		WebElement branch = driver.findElement(By.xpath("//span[@class='filter-option pull-left']"));
		branch.click();
		Actions action = new Actions(driver);
		action.moveToElement(branch).build().perform();
		driver.findElement(By.xpath
				("//*[@id=\"ContentPlaceHolder1_panelhide\"]/div/div[1]/div[2]/table/tbody"
						+ "/tr[1]/td[1]/div/div/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.id("ContentPlaceHolder1_txtDT")).sendKeys("testing");

		WebElement FrieghtCharge = driver.findElement(By.id("ContentPlaceHolder1_txtFC"));
		FrieghtCharge.sendKeys(Keys.CONTROL+"a");
		FrieghtCharge.sendKeys(Keys.DELETE);
		FrieghtCharge.sendKeys("150");

		driver.findElement(By.id("ContentPlaceHolder1_txtsplremarks")).sendKeys("test quick");
		WebElement payment = driver.findElement(By.xpath
				("//*[@id=\"ContentPlaceHolder1_panelhide\"]/div/div[1]/div[2]"
						+ "/table/tbody/tr[2]/td[2]/div/button/span[1]"));
		payment.click();
		action.moveToElement(payment);
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_panelhide\"]"
				+ "/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/ul/li[2]/a/span[1]"))
		.click();
	}
	@Test(priority=4)
	public void com_quote() {
		WebElement commission = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCommission"));
		commission.clear(); commission.sendKeys("20");
		WebElement quote = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_panelhide\"]"
				+ "/div/div[1]/div[2]/table/tbody/tr[2]/td[4]/div/button/span[1]"));
		quote.click();
		Actions action = new Actions(driver);
		action.moveToElement(quote).build().perform();
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_panelhide\"]"
				+ "/div/div[1]/div[2]/table/tbody/tr[2]/td[4]/div/div/ul/li[1]/a")).click();

		driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("quatation complete sucessfully");
		
		driver.findElement(By.id("btnlogout")).click();
	}
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}

}

