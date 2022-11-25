package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbroweserpopup {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	driver.get("https://skpatro.github.io/demo/links/");//parent
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();//child
	
	Set<String> id = driver.getWindowHandles(); //get the child window ID
	System.out.println(id);
	ArrayList<String> al = new ArrayList<String>(id); 
	String child=al.get(1);
    String parent=al.get(0);
	driver.switchTo().window(child);
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
}
