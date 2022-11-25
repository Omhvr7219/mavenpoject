package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sc3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Dell\\\\selenium 4.4\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(f);
	File i = new File("C:\\Users\\admin\\Desktop\\sc\\hr.jpg");
    FileHandler.copy(f, i);
	
	
	
	
	
}
}
