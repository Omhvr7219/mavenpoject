package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cbpopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
driver.findElement(By.xpath("//input[@Name='NewTab']")).click();
 Set<String> ids = driver.getWindowHandles();
 System.out.println(ids);
 ArrayList <String> al = new ArrayList <String> (ids);
         String par = al.get(0);
		 String chl = al.get(1);
		 driver.switchTo().window(chl);
		 driver.findElement(By.xpath("//span[text()='Training']")).click();;






	}

}
