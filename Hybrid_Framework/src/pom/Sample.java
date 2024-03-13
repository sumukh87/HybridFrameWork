package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.base_page;

public class Sample extends base_page {
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement login;
	public Sample(WebDriver driver)
	{
		super(driver);
	}
	public void pass(String un)
	{
		uname.sendKeys(un);
	}
	public void pass1(String pw)
	{
		pwd.sendKeys(pw);
	}
	public void login1()
	{
		login.click();
	}

}
