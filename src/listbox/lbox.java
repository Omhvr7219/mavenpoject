package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class lbox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Dell\\selenium 4.4\\geckodriver.exe") ;
	WebDriver driver = new  FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
//	WebElement o=driver.findElement(By.xpath("//select[@id='month'] "))	;
	 WebElement k=driver.findElement(By.xpath("//select[@id='month']"));
	Select p = new Select (k);
	p.selectByIndex(6);
	
	List<WebElement> b = p.getOptions();
	for(WebElement u:b)
		System.out.println(u.getText());
	
	
}
}
