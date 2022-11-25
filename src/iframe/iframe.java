package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(5000);
	driver.switchTo().frame("iframe-name");
	driver.findElement(By.xpath("//a[@class='et_pb_button et_pb_promo_button'][1]")).click();
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.linkText("REST API")).click();
	
	
	
	
	
	
	
	
	
	
	
}
}
