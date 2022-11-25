package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class scc {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(5000);
	WebElement months= driver.findElement(By.id("month"));
	Select s = new Select(months);
	s.selectByIndex(3);
	List<WebElement> k = s.getOptions();
	for(WebElement l:k)
		System.out.println(l.getText());
Thread.sleep(2000);
File  f=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File i = new File("C:\\Users\\admin\\Desktop\\sc\\JOY.jpg"); 
FileHandler.copy(f, i);
		
}
}
