package Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common_Function.GRN_And_V_Bellt_Element;
import Common_Function.Indent_And_V_Belt_Element;
import Common_Function.Indent_ConveyorBelt_Element;
import Common_Function.QuateReport_Element;
import Common_Function.Report_Element;
import login_page.login_properties;

public class QuateReportTest {
	WebDriver driver;


	login_properties objlogin;

	Report_Element objReport;

	@BeforeTest
	public void log_in() throws IOException {

		File file = new File("D:\\new install\\Lakhotia_so\\config.properties");

		FileInputStream fileInput = null;

		fileInput = new FileInputStream(file);

		Properties prop = new Properties();

		prop.load(fileInput);

		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));

		driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

		objlogin = new login_properties (driver);

		objlogin.setusername(prop.getProperty("mgrusername"));

		objlogin.setpassword(prop.getProperty("mgrpassword"));

		objlogin.clicklogin();
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@Test(priority=1)
	public void MyConveyence_TEST() {
		
		objReport = new Report_Element(driver);
		
		objReport.Click_My_Conveyence();
		
		objReport.Clicl_view_MYBill();
		
		objReport.Click_CloseView();
		
	}
}




