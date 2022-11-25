package upstox_trial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class t4 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.w3schools.com");
	driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("sql");
	List<WebElement> results = driver.findElements(By.xpath("//div[@id='listofsearchresults']//a"));
//	for (WebElement result:results) {
//		String value = result.getText();
//		if(value.equalsIgnoreCase("Mysql tutorial")) {
//			result.click();
//			break;
//		}
//	}
//	Thread.sleep(3000);
//	Actions act = new Actions(driver);
//
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	act.sendKeys(Keys.ENTER).perform();
//
	int res = results.size();
	results.get(res-1).click();

}
}