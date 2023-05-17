package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class fb {
	@Test
	public void fbb() throws InterruptedException{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harshadrandive@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9096862828");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']")).click();
		Thread.sleep(3000);
		String act = driver.findElement(By.xpath("(//span[text()='Harshad Randive'])[1]")).getText();
		System.out.println(act);
		String expected = "Harshad Randive";
		Assert.assertEquals(act, expected,"failed:bez both are diffrent");
		
	}
}
