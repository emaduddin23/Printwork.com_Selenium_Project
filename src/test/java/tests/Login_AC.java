package tests;

import org.testng.annotations.Test;

import driver.Driversetup;
import driver.Loginpage;

public class Login_AC extends Driversetup{
	Loginpage  loginpage = new Loginpage();
	
	
	@Test
	public void test() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/");
		Thread.sleep(1000);
		
		loginpage.form();
		Thread.sleep(1000);
		loginpage.enterUsername("karimrahman564@gmail.com");
		loginpage.enterPassword("karim123@");
		loginpage.click();
		Thread.sleep(1000);
		
	}

}
