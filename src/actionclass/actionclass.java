package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	Thread.sleep(2000);
	driver.get("https://www.amazon.in/");
	WebElement aclist = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Thread.sleep(2000);
	Actions act = new Actions (driver);
	Thread.sleep(2000);
	//---------moveto--------
//	act.moveToElement(aclist).perform();
//	driver.findElement(By.xpath("//span[text()='Wish from Any Website']")).click();
	// ---------context click,build,perform----------
	act.moveToElement(aclist).contextClick().build().perform();
	
	
	
}
	
	
	
	
	
	
	
}
