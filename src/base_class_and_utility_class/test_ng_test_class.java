package base_class_and_utility_class;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_ng_test_class extends base_class {
//	WebDriver driver;
	upstox_login_pom_loginpage o1;
	upstox_login_pom_year_page2 o2;
	upstox_poup_page o3;
	upstox_pom_homepage o4;
	int TCID;

	@BeforeClass
	public void OPEN_BROWSER() throws IOException {
//		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
//		sh = WorkbookFactory.create(file).getSheet("Sheet2");
		initialize_broweser();
		o1 = new upstox_login_pom_loginpage(driver);
		o2 = new upstox_login_pom_year_page2(driver);
		o3 = new upstox_poup_page(driver);
		o4 = new upstox_pom_homepage(driver);
	}

	@BeforeMethod
	public void LOGIN_UPSTOX() throws InterruptedException, IOException {

//		String usnm = sh.getRow(0).getCell(0).getStringCellValue();
//
//		String pswd = sh.getRow(0).getCell(1).getStringCellValue();
		Thread.sleep(3000);
		// o1.upstox_login_pom_loginpage_enter_username(utility_class.getTD(0, 0));
		o1.upstox_login_pom_loginpage_enter_username(utility_class.get_data_from_propertyfile("UN"));
		o1.upstox_login_pom_loginpage_password_enter(utility_class.get_data_from_propertyfile("PW"));
		o1.upstox_login_pom_loginpage_click_signinbtn();

//		String yob = sh.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(10000);
		// o2.upstox_login_pom_year_page2_enter_year(utility_class.getTD(0, 2));
		o2.upstox_login_pom_year_page2_enter_year(utility_class.get_data_from_propertyfile("YEAR"));
		Thread.sleep(3000);

		o3.upstox_poup_page_handle_popup();
		Thread.sleep(3000);

	}

	@Test
	public void VERIFY_UID() throws IOException {
		TCID = 101;
//		String expected = sh.getRow(0).getCell(3).getStringCellValue();
//		String expected = utility_class.getTD(0, 3);
		String expected = "hvr";
		String actual = o4.upstox_pom_homepage_get_uid();
		Assert.assertEquals(actual, expected, "failed:bez username are diffrent");
		String stockname = o4.stocknm();
		System.out.println(stockname);

	}

	@AfterMethod
	public void LOG_OUT(ITestResult result) throws IOException, InterruptedException {
		if (result.getStatus() == result.FAILURE) {
			utility_class.take_failed_tc_sc(driver, TCID);
Thread.sleep(3000);
		}
	}

	@AfterClass
	public void CLOSE_BROWSER() {
		driver.close();
		o1 = null;
		o2 = null;
		o3 = null;
		o4 = null;

		driver = null;
	}
}
