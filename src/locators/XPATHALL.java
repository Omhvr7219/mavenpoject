package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHALL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trade.angelbroking.com/Login");
		Thread.sleep(3000);
//	WebElement hr =	driver.findElement(By.cssSelector("#txtUserID"));
//	hr.sendKeys("R125589");
//	driver.findElement(By.cssSelector("input[type=password]")).sendKeys("55555");
//	driver.findElement(By.cssSelector("#loginBtn")).click();
//  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1254512121");
//	driver.findElement(By.xpath("//a[text()='Open account']")).click();
//	Thread.sleep(3000);
//	driver.navigate().back();
//	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("R125656");
//	driver.findElement(By.className("link text-uppercase")).click();
//	driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.className("btn btn-filled full-width loading-btn")).click();
	
	}

}
