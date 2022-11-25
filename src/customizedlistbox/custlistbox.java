package customizedlistbox;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class custlistbox {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://mahadbtmahait.gov.in/Grievance/Grievance");
	
	WebElement districts = driver.findElement(By.xpath("//select[@id='DistrictID']"));
	
	Actions act = new Actions (driver);
	
	act.click(districts).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	  Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	  Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_UP).perform();
	  Thread.sleep(2000);
    act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	act.sendKeys(Keys.HOME).perform();
	  Thread.sleep(2000);
	act.sendKeys(Keys.END).perform();
	  Thread.sleep(2000);
	for(int i =1;i<=2;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		  Thread.sleep(2000);
//		  act.sendKeys(Keys.HOME).perform();
//		  Thread.sleep(2000);
//		act.sendKeys(Keys.END).perform();
//		  Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
