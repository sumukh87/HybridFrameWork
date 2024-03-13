package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base_page {
	public WebDriver driver;
	public base_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
