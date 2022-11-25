package actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement clicks = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    Actions act = new Actions(driver);
    Thread.sleep(2000);
    act.doubleClick(clicks).perform();
    Alert alt = driver.switchTo().alert();
    Thread.sleep(2000);
    System.out.println(alt.getText());
    alt.accept();
  
    WebElement rcl = driver.findElement(By.xpath("//span[text()='right click me']"));
    Thread.sleep(2000);
	
	act.contextClick(rcl).perform();
	
	

	
}
	
	
	
	
}
