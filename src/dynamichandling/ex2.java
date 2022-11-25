package dynamichandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/"); // to open url
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12");// to search item
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();// to click on search textbox
	String rates=driver.findElement(By.xpath("((//div[@class='a-section'])[2]//span)[15]")).getText();// to get dynamic element
	System.out.println(rates);// to print rating dynamic element
	
}
}
