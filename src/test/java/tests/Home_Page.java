package tests;

import org.testng.annotations.Test;

import driver.Driversetup;
import driver.Homepage;

public class Home_Page extends Driversetup{
	
	Homepage homepage = new Homepage();
	
	@Test
	public void test() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/");
		
		homepage.preson();
		Thread.sleep(1000);
		
	}

}
