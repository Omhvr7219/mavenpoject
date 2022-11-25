package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withDDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	String unm = sh.getRow(0).getCell(0).getStringCellValue();
	String pw = sh.getRow(0).getCell(1).getStringCellValue();
	String yr = sh.getRow(0).getCell(2).getStringCellValue();
	
	driver.get("https://login-v2.upstox.com");
	driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(unm);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pw);
	driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(yr);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	String un = driver.findElement(By.xpath("//span[text()='harshad r.']")).getText();
	System.out.println(un);
	String actun="Harshad R.";
	if(un.equals(actun)) {
		System.out.println("correct username");
	}
	else {
		System.out.println("incorrect username");
	}
}
}
