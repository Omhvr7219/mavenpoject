package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattributes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
	    Thread.sleep(3000);
	   
//	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8600906765");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9092828");
//        driver.findElement(By.xpath("//button[@VALUE='1']")).click();
//	    driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
	    driver.findElement(By.xpath("//input[contains(@type,'xt')]")).sendKeys("keysToSend");
	
	
	
}}
