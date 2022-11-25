package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutDDF {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://login-v2.upstox.com");
	driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("BV7682");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Omhvr@7219");
	driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1992");
	driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	String un = driver.findElement(By.xpath("//span[text()='harshad r.']")).getText();
	System.out.println(un);
	String actun="Harsha R.";
	if(un.equals(actun)) {
		System.out.println("correct username");
	}
	else {
		System.out.println("incorrect username");
	}
}
}
