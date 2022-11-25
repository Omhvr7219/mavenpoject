package dynamichandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AZM {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.get("https://www.amazon.in");
	driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("oven");
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	 String rate = driver.findElement(By.xpath("((//div[@class='a-section'])[3]//span)[13]")).getText();
	System.out.println(rate);
}
}
