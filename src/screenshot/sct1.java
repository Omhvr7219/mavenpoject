package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sct1 {public static void main(String[] args) throws IOException {
	

	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	for (int i =0;i<=10;i++) 
	{ 
	File sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	String s=RandomString.make(1);
	File st = new File("C:\\Users\\admin\\Desktop\\sc\\hrg"+s+".jpg");
	
	FileHandler.copy(sc, st); 
	 }
	 
	 
	 
	 
	 
	 
	 
}
}