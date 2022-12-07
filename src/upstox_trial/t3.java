package upstox_trial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://moneybhai.moneycontrol.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[text()='skip'])[1]")).click();
	driver.findElement(By.xpath("//button[@id='loginbtn']")).click();
//	driver.findElement(By.xpath("//button[@class='mb-cbtn linkSignIn modalBtn']")).click();
	Thread.sleep(3000);
	driver.switchTo().frame("myframe");
	driver.findElement(By.xpath("//input[@placeholder='Email or Mobile Number or User ID']")).sendKeys("harshadrandive@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@name='pwd'])[2]")).sendKeys("Harshad@7219");
	driver.findElement(By.xpath("//button[@id='ACCT_LOGIN_SUBMIT']")).click();
	List<WebElement> stocks = driver.findElements(By.xpath("//header[@id='mainheader']//div[@class='sensexCont slick-slide slick-cloned']"));
	for(WebElement stock:stocks)
	{
	String name = stock.getText();
	System.out.println(name);
	}
}
}
