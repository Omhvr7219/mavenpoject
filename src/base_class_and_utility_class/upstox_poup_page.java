package base_class_and_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_poup_page {
@FindBy(xpath="(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]")private WebElement POP;
upstox_poup_page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void upstox_poup_page_handle_popup()
{
	POP.click();
}

}
