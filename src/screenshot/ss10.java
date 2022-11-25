package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ss10 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.youtube.com/watch?v=KNeB0ETSEW8");
	
	for (int l=0;l<=5;l++)
	
	{File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String h = RandomString.make(1);
	
	File i = new File("C:\\Users\\admin\\Desktop\\sc\\hg"+h+".jpg");
	
	FileHandler.copy(f, i);
	}
	
	
	
	
	
	
	
	
	
	
}
}
