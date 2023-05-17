package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class as3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Pune");
	Thread.sleep(5000);
	 List<WebElement> list = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
//	Actions act = new Actions(driver);
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	Thread.sleep(5000);
//	act.sendKeys(Keys.HOME).sendKeys(Keys.ENTER).build().perform();
	String act = "pune to goa distance";
	for(WebElement r : list ) {
		String actext = r.getText();
		System.out.println(actext);
		if(actext.equalsIgnoreCase(act)) {
			r.click();
			break;
		}
//		
//		int ressize = list.size();
//		list.get(ressize-9).click();
//	}

	
	
	}}}
