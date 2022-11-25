package dynamichandling;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex11 {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone11");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	String rating= driver.findElement(By.xpath("((//div[@class='_1AtVbE col-12-12'])[3]//span)[6]")).getText();
	System.out.println(rating);
	String star = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[13]//span)[4]")).getText();
	System.out.println(star);
	
	
	
	
	
	
	
}
}
