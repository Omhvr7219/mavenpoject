package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sc1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(scr);
String add=RandomString.make(2);
File dest = new File("C:\\Users\\admin\\Desktop\\sc\\scr"+add+".jpg");

FileHandler.copy(scr, dest);

}
}