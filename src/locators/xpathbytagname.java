package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytagname {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");

	WebDriver  driver = new ChromeDriver();
	driver.get("C:\\Users\\admin\\Desktop\\prog.html");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("123456");
}
}
