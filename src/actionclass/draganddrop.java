package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	
	act.moveToElement(src).clickAndHold(src).moveToElement(dest2).release().build().perform();
//	act.clickAndHold(src).dragAndDrop(src, dest2).build().perform();
	act.dragAndDrop(src, dest).perform();
	
	
	
}
}
