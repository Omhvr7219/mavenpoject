package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/alerts/");
		Thread.sleep(2000);
//     	driver.findElement(By.xpath("//input[@name='commit']")).click();
	  driver.findElement(By.id("prompt")).click();
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
//		alt.dismiss();
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
