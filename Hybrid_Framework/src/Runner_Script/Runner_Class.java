package Runner_Script;
import generic.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.Sample;

public class Runner_Class extends Baseclass 
{
	@Test(dataProvider = "Login_Credentials")
	public void login(String un,String pw) throws InterruptedException 
	{
		Sample p = new Sample(driver);
		p.pass(un);
		Thread.sleep(1000);
		p.pass1(pw);
		Thread.sleep(1000);
		p.login1();
	}
	@DataProvider(name="Login_Credentials")
	public Object[][] createData()
	{
		Object[][] data= {{"Sumukh","admin@123"},{"karthik","admin@123"}};
		return data;
	}
}