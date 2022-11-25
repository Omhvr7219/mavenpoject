package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxp2pom {@FindBy(xpath="//input[@name='yob']") private WebElement YR;//s1
public upstoxp2pom(WebDriver driver)//s2
{
	PageFactory.initElements(driver,this);
}
public void enterYr()
{
	YR.sendKeys("1992");}
}
