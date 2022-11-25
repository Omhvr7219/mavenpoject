package customizedlistbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clb1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://services.gst.gov.in/litserv/case/hrng/get");
	  Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//	WebElement st = driver.findElement(By.cssSelector("select#statSelId"));
	WebElement st = driver.findElement(By.xpath("//select[@id='statSelId']"));
	  Thread.sleep(2000);
	Actions act = new Actions (driver);
	 Thread.sleep(2000);
	act.click(st).perform();
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	  Thread.sleep(2000);
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	  Thread.sleep(2000);
//	act.sendKeys(Keys.HOME).perform();
//	  Thread.sleep(2000);
//	act.sendKeys(Keys.END).perform();
	for(int i=1;i<=5;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	
}
}
