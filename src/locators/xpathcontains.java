package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcontains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
	//	driver.findElement(By.tagName("input")).sendKeys("1212121");
//		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("FX4855");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("111185555");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
////     	driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
//   //     driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
	//	driver.findElement(By.xpath("//a[contains(@class,'light')]")).click();
		driver.findElement(By.id("userid")).sendKeys("fx4855");
		Thread.sleep(3000);
//		driver.findElement(By.className("text-light")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		
	}

}
