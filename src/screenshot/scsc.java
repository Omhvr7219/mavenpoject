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

import net.bytebuddy.utility.RandomString;

public class scsc {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.id("month"));
		Select sl = new Select (month);
		sl.selectByVisibleText("Dec");
		 List<WebElement> allmonths = sl.getOptions();
		for(WebElement i:allmonths)
		System.out.println(i.getText());
		Thread.sleep(2000);
//		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File i = new File("C:\\Users\\admin\\Desktop\\sc\\fb.jpg");
//		FileHandler.copy(f, i);
//	
		for(int y=1;y<=5;y++ )
		
		{
		File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String str=RandomString.make(1);
		File folder = new File("C:\\Users\\admin\\Desktop\\sc\\fbsc"+str+".jpg");
		FileHandler.copy(sc, folder);
		
		}
		
		
		
		
	}
	

}
