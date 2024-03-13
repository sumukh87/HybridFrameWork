package generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import utils.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser() throws FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(fetchproperty.fetchprop());
		}
	@AfterMethod
	public void closebrowser(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			CaptureScreenShot.get_photo(driver);
		}
		driver.close();
	}
}
