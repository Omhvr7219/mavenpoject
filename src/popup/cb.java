package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	driver.get("https://qavbox.github.io/demo/links/");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='multiple']")).click();
	Thread.sleep(2000);
	Set<String> ids = driver.getWindowHandles();
	ArrayList<String> al= new ArrayList<String>(ids);
//    for(int i=0;i<=al.size()-1;i++)
//		
//	System.out.println(al.get(i));
driver.switchTo().window(al.get(2));
Thread.sleep(7000);
//driver.findElement(By.cssSelector("input#the7-search")).sendKeys("hjighfhfg");
////a[text()='SignUp Form']
//	driver.findElement(By.xpath("//a[text()='SignUp Form']")).click();
//driver.findElement(By.xpath("//span[text()='Home']")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("llllll");

	
}
}
