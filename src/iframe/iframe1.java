package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),'me to')]")).click();
//		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-home']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
