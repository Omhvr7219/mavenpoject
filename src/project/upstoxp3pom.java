package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxp3pom {
@FindBy(xpath="//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'][1]")private WebElement nxt;
public upstoxp3pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void next()
{
	nxt.click();
}

}
