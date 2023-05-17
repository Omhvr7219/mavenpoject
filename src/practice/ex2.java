package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2 {public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mahadbtmahait.gov.in/Grievance/Grievance");
	driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	WebElement district = driver.findElement(By.xpath("//select[@id='DistrictID']"));
	district.click();
	Select st = new Select (district);
	st.selectByVisibleText("Pune");
////	district.click();
//	WebElement tal = driver.findElement(By.xpath("//select[@id='TalukaID']"));
//	Select tl = new Select (tal);
//	tl.selectByVisibleText("Ambegaon");
//	Thread.sleep(3000);
////	tal.click();
	
	
	
	
	
	
}
}