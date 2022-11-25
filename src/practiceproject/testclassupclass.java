package practiceproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclassupclass {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");

		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://login-v2.upstox.com/");

		upcl1 po = new upcl1(driver);

		String UNM = sh.getRow(0).getCell(0).getStringCellValue();
		po.upcl1enterUN(UNM);

		String PWDD = sh.getRow(0).getCell(1).getStringCellValue();
		po.upcl1enterPW(PWDD);
		po.upcl1clicks();
	}
}
