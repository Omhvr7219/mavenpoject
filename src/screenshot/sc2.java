package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sc2 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",  "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	driver.manage().window().maximize();
	for(int i=0;i<=3;i++)
{
	File sct	= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(sct);
String s=RandomString.make(1);
File dest = new File("C:\\Users\\admin\\Desktop\\sc\\dsc"+s+".jpg");
FileHandler.copy(sct,dest);
}
	
	
	
}
}
