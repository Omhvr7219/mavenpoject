package base_class_and_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class upstox_login_pom_year_page2 {
@FindBy(xpath="//input[@name='yob']")private WebElement YEAR;
public upstox_login_pom_year_page2(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}
public void upstox_login_pom_year_page2_enter_year(String YR)
{
//	WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
	YEAR.sendKeys(YR);
}


}
