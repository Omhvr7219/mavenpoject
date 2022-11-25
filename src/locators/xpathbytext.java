package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytext {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/?hl=en");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8600906765");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("900200202");
//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
driver.findElement(By.xpath("//a[contains(text(),'password?')]")).click();
	
}
}
