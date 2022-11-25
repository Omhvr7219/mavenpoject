package test_ng_project;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_ng_test_class {
	WebDriver driver;
	upstox_login_pom_loginpage o1;
	upstox_login_pom_year_page2 o2;
	upstox_poup_page o3;
	upstox_pom_homepage o4;
	Sheet sh;

	@BeforeClass
	public void OPEN_BROWSER() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet2");
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login-v2.upstox.com");
		o1 = new upstox_login_pom_loginpage(driver);
		o2 = new upstox_login_pom_year_page2(driver);
		o3 = new upstox_poup_page(driver);
		o4 = new upstox_pom_homepage(driver);
	}

	@BeforeMethod
	public void LOGIN_UPSTOX() throws InterruptedException {

		String usnm = sh.getRow(0).getCell(0).getStringCellValue();

		String pswd = sh.getRow(0).getCell(1).getStringCellValue();

		o1.upstox_login_pom_loginpage_enter_username(usnm);
		o1.upstox_login_pom_loginpage_password_enter(pswd);
		o1.upstox_login_pom_loginpage_click_signinbtn();

		String yob = sh.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(10000);
		o2.upstox_login_pom_year_page2_enter_year(yob);
	
		Thread.sleep(3000);

		o3.upstox_poup_page_handle_popup();
		Thread.sleep(3000);
		
	}

	@Test
	public void VERIFY_UID() {
		String expected = sh.getRow(0).getCell(3).getStringCellValue();
		String actual=o4.upstox_pom_homepage_get_uid();
		Assert.assertEquals(actual, expected,"failed:bez username are diffrent");
	  String stockname=o4.stocknm();
		System.out.println(stockname);
		
	}

	@AfterMethod
	public void LOG_OUT() {

	}

	@AfterClass
	public void CLOSE_BROWSER() {

	}
}
