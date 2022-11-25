package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//img[@ondragstart='drag(event)']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='div1']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src, dest).perform();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath(("(//a[@title='Change Theme'])[1]"))).click();
//		act.sendKeys(Keys.ENTER);
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
