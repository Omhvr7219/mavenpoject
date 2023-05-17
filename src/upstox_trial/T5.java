package upstox_trial;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class T5 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	for (int i=1;i<=10;i++) {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String s = RandomString.make(2);
	File dest = new File ("C:\\Users\\admin\\Desktop\\sc\\hrx"+s+".jpg");
	FileHandler.copy(file,dest );
	}
}
}
