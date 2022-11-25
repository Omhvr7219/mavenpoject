package autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {
public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com/");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pune");
//	List<WebElement> auto = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
//	Thread.sleep(2000);	
//	int asize=auto.size();
//	System.out.println(asize);
//	auto.get(asize-2).click();
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Bangalore");
	Thread.sleep(2000);
	
	List<WebElement> auto = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		int autosize = auto.size();
		System.out.println(autosize);
		auto.get(autosize-2).click();
		
	
	
	
	
	
	
	
	
	
	
	
}
}
