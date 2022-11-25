package test_ng_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class upstox_test_class_pom_with_ddf {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login-v2.upstox.com");
	    Thread.sleep(3000);
		upstox_login_pom_loginpage o1 = new upstox_login_pom_loginpage(driver);
		String usnm = sh.getRow(0).getCell(0).getStringCellValue();
		
		String pswd = sh.getRow(0).getCell(1).getStringCellValue();
		
		o1.upstox_login_pom_loginpage_enter_username(usnm);
		o1.upstox_login_pom_loginpage_password_enter(pswd);
		o1.upstox_login_pom_loginpage_click_signinbtn();
		
		upstox_login_pom_year_page2 o2= new upstox_login_pom_year_page2(driver);
		String yob = sh.getRow(0).getCell(2).getStringCellValue();
		  Thread.sleep(10000);
		o2.upstox_login_pom_year_page2_enter_year(yob);
		upstox_poup_page o3 = new upstox_poup_page(driver);
		  Thread.sleep(3000);
		o3.upstox_poup_page_handle_popup();
		  Thread.sleep(3000);
		upstox_pom_homepage o4 = new upstox_pom_homepage(driver);
		String expected = sh.getRow(0).getCell(3).getStringCellValue();
		o4.upstox_pom_homepage_get_uid(expected);
	    o4.stocknm();
	}

}
