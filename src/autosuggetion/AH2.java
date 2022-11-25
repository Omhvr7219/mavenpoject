package autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AH2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("cipla");
	List<WebElement> res = driver.findElements(By.xpath("//UL[@jsname='bw4e9b']"));
	Actions act = new Actions (driver);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ENTER).perform();

	int ressize = res.size();
	System.out.println(ressize);
	res.get(ressize-2).click();
}
}