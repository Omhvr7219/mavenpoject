package upstox_trial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicitlywait {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(""));
	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	ele.sendKeys("sssss");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
//	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8600906765");
//	
//	wait.until(ExpectedConditions.v)
}
}