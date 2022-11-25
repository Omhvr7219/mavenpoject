package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxx {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
//	WebElement lt=driver.findElement(By.xpath("//select[@id='day']"));
//	Select s=new Select(lt);
//	s.selectByValue("17");
////	s.selectByIndex(19);
//    s.selectByVisibleText("28");
   WebElement	k=driver.findElement(By.xpath("//select[@id='month']"));
    Thread.sleep(3000);
	Select y=new Select(k);
	y.selectByIndex(3);
//	y.selectByValue("5");
//	y.selectByVisibleText("Jan");
	
	
	
	
	
	
	
	
	
	
	
}

}
