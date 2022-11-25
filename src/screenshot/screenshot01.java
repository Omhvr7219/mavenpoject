package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot01 {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	for(int i=0;i<=10;i++)
	{
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String rs = RandomString.make(1);
	File o = new File ("C:\\Users\\admin\\Desktop\\sc\\hr"+rs+".jpg");
	
	FileHandler.copy(f, o);
	}
	
}
}
