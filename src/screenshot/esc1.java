package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class esc1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://meet.google.com/vht-gdbt-rva?pli=1&authuser=0");
		Thread.sleep(4000);	
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s = RandomString.make(1);
		File i= new File ("C:\\Users\\admin\\Desktop\\sc\\htrui"+s+".jpg");
		FileHandler.copy(f, i);
		
		
		
		
		
	}
}
