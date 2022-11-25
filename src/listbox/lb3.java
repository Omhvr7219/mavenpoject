package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lb3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
		  Thread.sleep(3000);
//		WebElement w = driver.findElement(By.xpath("//select[@id='month']"));
//		Select e=new Select(w);
//		e.selectByIndex(3);
//		WebElement x = driver.findElement(By.xpath("//select[@id='day']"));
//		Select U=new Select(x);
//		U.selectByValue("5");
		WebElement Z = driver.findElement(By.xpath("//select[@id='year']"));
		Select V=new Select(Z);
//		V.selectByVisibleText("2003");
		
		if (V.isMultiple())
		{System.out.println("list box is multiselectable");}
		else
		{System.out.println(("list is single selectable"));}
		
	
		
		
		
		
		
		
		
	}

}
