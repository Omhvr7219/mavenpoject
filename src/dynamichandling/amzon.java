package dynamichandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzon {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath(("//input[@id='twotabsearchtextbox']"))).sendKeys("washung machine 8kg");
driver.findElement(By.xpath(("//input[@id='nav-search-submit-button']"))).click();
//	https://www.amazon.in/washung machine 8kg
	String text = driver.findElement(By.xpath("((//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right'])[12]//span)[12]")).getText();

System.out.println(text);	
	}
}