package Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common_Function.Conveyence_Elemenet;
import Common_Function.Day_Report_Element;
import Common_Function.GRN_And_V_Bellt_Element;
import Common_Function.Indent_And_V_Belt_Element;
import Common_Function.Indent_ConveyorBelt_Element;
import Common_Function.QuateReport_Element;
import Common_Function.Quate_Element;
import Common_Function.Report_Element;
import login_page.login_properties;

public class QuateTest {
	WebDriver driver;

	//String driverPath ="D:\\chromedriver.exe";


	login_properties objlogin;

	Quate_Element objquate;

	QuateReport_Element	objQuateReport;

	Day_Report_Element  objDayReport;

	Conveyence_Elemenet objConveyence;

	GRN_And_V_Bellt_Element objGRn;

	Indent_And_V_Belt_Element objIndent;

	Indent_ConveyorBelt_Element onbjconveyor;

	Report_Element objReport;

	String driverpath ="D:\\chromedriver.exe";



	@BeforeTest
	public void open_url() throws IOException {
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

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Test(priority=0)
	public void new_QuateTEST() {

		objquate =new Quate_Element(driver);
		//objquate.clickQuate();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objquate.ClickNewQuate();

		objquate.EnterCompany_Name("LUCAS");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		objquate.EnterCompanyAddress("PADI , CHENNAI -600050");

		objquate.EnterGST("HDE123F");

		objquate.EnterContactPerson("Test RAVI");

		objquate.EnterContact_No("1234567889");

	}

	@Test(priority=1)
	public void Enter_Form_DetailTEST() {

		objquate.EnterCompanyRefNo("RQ123");

		objquate.EnterDepartment("AM");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objquate.EnterEmaiID("sasikumarr95@gmail.com");

		objquate.EnterItemCode("1150-AT10");

		objquate.EnterSpecification(" {Testing} Polychain Carbon 3136 ");

		objquate.EnterHSN("DNC");
	}
	@Test(priority=2)
	public void Enter_Form_DetailsTEST() {
		objquate.EnterQty("25");

		objquate.EnterUnitRate("40");

		objquate.EnterDiscount("2");

		objquate.EnterDelivertTerms("TESTING!@#1234");

		objquate.EnterFrightCharge("200");

		objquate.EnterP_F("30");

		objquate.EnterSpecial_Remarks("test@1212123");


		//objquate.EnterCommission("500"); dir

		objquate.clickSUBMIT();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



	}
	@Test (priority=3)
	public void Quate_Report_NoAndCompanyTEST() {

		objQuateReport = new QuateReport_Element(driver);


		objQuateReport.ClickQuateReport();

		objQuateReport.clickQuate_no("00843");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objQuateReport.clickFind();

		objQuateReport.ClickClear();

		objQuateReport.EnterCustomerCompany("LUCAS TVS");

		objQuateReport.clickFind();

		objQuateReport.ClickClear();


	}

	@Test(priority=4)
	public void Quate_Report_DateTEST() {

		objQuateReport.ClilckFromDatePOPUP();

		objQuateReport.SetFROMDATE();

		objQuateReport.ClickToDatePOPUP();

		objQuateReport.SetTODATE();

		objQuateReport.clickFind();

		objQuateReport.clickFind();

		objQuateReport.ClickClear();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


	}

	@Test(priority=5)
	public void Quate_Report_ReviseTEST() {

		objQuateReport.ClickRevise();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objQuateReport.clickRevisesumbitButton();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


	}

	@Test(priority=6)
	public void Day_Report_TEST() {

		objDayReport = new Day_Report_Element(driver);


		objDayReport.Click_DayReport();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objDayReport.EnterVisitCompany_Name("Testing INFRA@[s]");

		objDayReport.EnterAddress("10,nort street,padi,chennai");

		objDayReport.EneterContactPerson("SriRAM");

		objDayReport.EnterDepartment("motor RawMeterial");

		objDayReport.EnterContactNo("9876543229");

		objDayReport.EnterEmail_ID("sri$12@gmail.com");

		objDayReport.EnterFeedback("Fenner Make 8V 3810  Qty'100'");

		objDayReport.ClickSubmitButton();


		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test(priority=7)
	public void Day_Report_AddPerson_TEST() {

		objDayReport.ClickAddDetails();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objDayReport.EneterContactPerson1("vasu");

		objDayReport.EnterDepartment1("motor RawMeterial");

		objDayReport.EnterContactNo1("7023241739");

		objDayReport.EnterEmail_ID1("VASU$12@gmail.com");

		objDayReport.EnterFeedback1("PU Flat Belt 10mm X 1mm  Qty'50'");

		objDayReport.ClickSubmitButton();


		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	}

	@Test(priority=8)
	public void Conveyence_TESt() {

		objConveyence = new Conveyence_Elemenet(driver);

		objConveyence.ClickConveyance();

		objConveyence.EnterStartingKM("100");

		objConveyence.EnterEndKM("300");

		objConveyence.selectSpeedMeter_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test(priority=9)
	public void Conveyence_otherExpenses1_2() {

		objConveyence.EnterOtherExpenses1_name("exp1 Tea");

		objConveyence.EnterOtherExpenses1_Amount("50");

		objConveyence.selectOtherExpense1_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objConveyence.EnterOtherExpenses2_name("Exp2 Petrol");

		objConveyence.EnterOtherExpenses2_Amount("100");

		objConveyence.selectOtherExpense2_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		

	}

	@Test(priority=10)
	public void Conveyence_otherExpenses3_4() {

		objConveyence.EnterOtherExpenses3_name("Exp3 Food");

		objConveyence.EnterOtherExpenses3_Amount("200");

		objConveyence.selectOtherExpense3_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objConveyence.EnterOtherExpenses4_name("Exp4 stationary");

		objConveyence.EnterOtherExpenses4_Amount("20");

		objConveyence.selectOtherExpense4_img("C:\\Users\\Public\\Pictures\\pic\\Desert.jpg");

		objConveyence.ClickSubmit();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		/*Alert Alt = driver.switchTo().alert();

		Alt.accept();
		 */
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test(priority=11)
	public void GRN_Report() {

		objGRn = new GRN_And_V_Bellt_Element(driver);

		objGRn.ClickGRN();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objGRn.SelectBrandName("Fenner");

		objGRn.SetAssignBranch();

		objGRn.selectLength_pitch("1100-H");

		objGRn.EnterWitdh("W30");

		objGRn.EnterQTY("10");

		objGRn.EnterBuyPrice("250");

	}
	@Test(priority=12)
	public void GRN_ADD() {

		objGRn.ClickADDbelt();

		objGRn.selectLength_pitch1("1200-H");

		objGRn.EnterWitdh1("W40");

		objGRn.EnterQTY1("5");

		objGRn.EnterBuyPrice1("190");

		objGRn.Clicksubmit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	@Test(priority=13)
	public void V_Belt_TEST() {

		objGRn.ClickV_Belt();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		objGRn.SelectBrandName("Fenner");

		objGRn.SetAssignBranch();

		objGRn.selectLength_pitch("1000-11M");

		objGRn.EnterQTY("10");

		objGRn.EnterBuyPrice("250");
	}

	@Test(priority=14)
	public void V_Belt_ADD() {

		objGRn.ClickADDbelt();

		objGRn.selectLength_pitch1("2000-3/11M");

		objGRn.EnterQTY1("5");

		objGRn.EnterBuyPrice1("190");

		objGRn.Clicksubmit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test (priority=15)
	public void Indent_TEST() {

		objIndent =new Indent_And_V_Belt_Element(driver);

		objIndent.Click_Indent();

		objIndent.Select_Specification("1100-H");

		objIndent.Enter_customerName("Fenner");

		objIndent.Select_Options();

		objIndent.Enter_Width("30");

		objIndent.Enter_Qty("3");

		objIndent.Enter_Reamark("GREEN KNURLING BOTTOM 3MM ");

		objIndent.ClickaddMore_Submit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test(priority=16)
	public void indent_Report_Test() {

		objIndent.Enter_IndentReport();

		objIndent.Enter_delivered();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test(priority=17)
	public void V_Belt_Test() {

		objIndent =new Indent_And_V_Belt_Element(driver);

		objIndent.Click_V_Belt();

		objIndent.Select_Specification("1000-11M");

		objIndent.Enter_customerName("Fenner");

		objIndent.Click_Voptions();

		objIndent.Click_Voptions1();

		objIndent.Enter_Qty("2");

		objIndent.Enter_Reamark("ize: 800mm width x 10mm thk x 3ply ");

		objIndent.ClickaddMore_Submit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

	}
	@Test(priority=18)
	public void Click_V_beltReport() {

		objIndent.Click_V_Belt_Report();

		objIndent.Enter_delivered();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test(priority=19)
	public void ConveyorBelt_Test() {

		onbjconveyor = new 	Indent_ConveyorBelt_Element(driver);

		onbjconveyor.Click_indent_Conveyor();

		onbjconveyor.Enter_SAPCODE("RM");

		onbjconveyor.select_BeltThickness();

		onbjconveyor.Enter_Length("40");

		onbjconveyor.Enter_Width("20");

		onbjconveyor.Click_Clear();

	}

	@Test(priority=20)
	public void Conveyor_ReTEST() {

		onbjconveyor.Enter_SAPCODE("C B");

		onbjconveyor.select_BeltThickness();

		onbjconveyor.Enter_Length("20");

		onbjconveyor.Enter_Width("15");

		onbjconveyor.Click_Submit();

		Alert alt = driver.switchTo().alert();

		alt.accept();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test(priority=21)
	public void Report_DAY_TEST() {

		objReport = new Report_Element(driver);

		objReport.Click_Dayreport();

		objReport.Enter_Company_Name("tvs");

		objReport.Click_Find();

		objReport.Click_Clear();

		objReport.Click_DATE();

		objReport.Click_Find();

	}

	@Test(priority=22)
	public void ConveyenceOS_TEST() {

		objReport.Click_ConveyenceOS();

		objReport.Click_View();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		objReport.Click_CloseView();

		objReport.Eneter_Deduction_Amount("10");

		objReport.Click_cleardBill();

		Alert alt = driver.switchTo().alert();

		alt.accept();
	}



}



