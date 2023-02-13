package tests;

import org.testng.annotations.Test;

import driver.Driversetup;
import driver.Createaccount;

public class CreatAc extends Driversetup {
	Createaccount loginpage = new Createaccount();
	
	//Homepage homepage = new Homepage();
	
	
	@Test
	public void doing() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/");
		loginpage.menu();
		Thread.sleep(1000);
		loginpage.enterUsername("karimrahman564@gmail.com");
		loginpage.enterPassword("karim123@");
		loginpage.menu2();	
	}

}
