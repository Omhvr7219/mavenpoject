package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locpract1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8600906765");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9096862829");
	
	driver.findElement(By.xpath("//button[contains(@value,'1')]")).click();
	String txt = driver.findElement(By.partialLinkText("Forgotten ")).getText();
	System.out.println(txt);
	driver.findElement(By.partialLinkText("Forgotten ")).click();
	driver.findElement(By.xpath("//input[contains(@id,'identify_email')]")).sendKeys("harshadrandive@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.name("did_submit")).click();
	//driver.findElement(By.className("_42ft _4jy0 _9nq1 textPadding13px _4jy3 _517h _51sy")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("reset_action")).click();
	boolean a = driver.findElement(By.tagName("button")).isDisplayed();
	System.out.println(a);
	boolean b = driver.findElement(By.tagName("button")).isEnabled();
	System.out.println(b);
	boolean c = driver.findElement(By.tagName("button")).isSelected();
	System.out.println(c);
}
}
