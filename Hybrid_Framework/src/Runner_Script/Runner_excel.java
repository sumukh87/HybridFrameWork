package Runner_Script;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic.Baseclass;
import pom.Sample;
import generic.ReadExcel;

public class Runner_excel extends Baseclass{
	@Test
	public void data() throws InterruptedException 
	{
		Sample p = new Sample(driver);
		p.pass(ReadExcel.getdata("Sheet1",0,0));
		Thread.sleep(1000);
		p.pass1(ReadExcel.getdata("Sheet1",1,0));
		p.login1();
		Assert.fail();
		
	}
	
}
