package director;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Technican_AssignWork {
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
	public void AssignWork() {
		WebElement technican = driver.findElement(By.id("dbTechnician"));
		Actions action = new Actions(driver);
		action.moveToElement(technican).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("liAssignWork"))).click();
		
		WebElement comp_name=driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCompanyName"));
		comp_name.sendKeys("CMI MACHINES");comp_name.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[@class='filter-option pull-left']")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[5]/div/div[2]"
				+ "/div/div/div/div[1]/table/tbody/tr/td[2]/div/div/ul/li[3]/a/span[1]")).click();
		
		driver.findElement(By.id("ContentPlaceHolder1_lnkClear")).click();
		System.out.println("select com.name and assign after clear the elemenet ");
		
		WebElement com_name = driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtCompanyName"));
		com_name.sendKeys("JK FENNER");com_name.sendKeys(Keys.ENTER);
		
		 driver.findElement(By.xpath("//span[@class='filter-option pull-left']")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div[5]/div/div[2]"
				+ "/div/div/div/div[1]/table/tbody/tr/td[2]/div/div/ul/li[7]/a/span[1]")).click();
		
		System.out.println("select com.name and assign");
	}
	@Test(priority=1)
	public void Specification() {
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtSpecification_0"))
		.sendKeys("belt4#2/4 (Testing)");
		WebElement Qty = driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtQty_0"));
		Qty.clear();Qty.sendKeys("10");
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtSplRemarks_0")).sendKeys("Nil@ [Testing]");
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtDirectorRemarks_0"))
		.sendKeys("Quick@ {process} [Testing]");
		
		
	}
	@Test(priority=2)
	public void add_product() throws InterruptedException {
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_btnAdd_0")).click();
		
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtSpecification_1"))
		.sendKeys("v_belt#10/50 (Testing)");
		
		WebElement Qty2 = driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtQty_1"));
		Qty2.clear();Qty2.sendKeys("20");
		
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtSplRemarks_1")).sendKeys("hurryup$@ [Testing]");
		driver.findElement(By.id("ContentPlaceHolder1_rptPending_txtDirectorRemarks_1"))
		.sendKeys("1Day to@ {process} [Testing]");
		
		driver.findElement(By.id("ContentPlaceHolder1_lnksubmit")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Assign work submit sucessfully");
		
		driver.findElement(By.id("btnlogout")).click();
	}
}
