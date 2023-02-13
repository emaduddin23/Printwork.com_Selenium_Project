package tests;

import org.testng.annotations.Test;

import driver.Checkout;
import driver.Driversetup;
import driver.Selecitem;

public class Check_out extends Driversetup {
	Checkout  check =  new Checkout();
	Selecitem select =  new Selecitem();
	
	@Test
	public void check() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/product-category/bangla-books/%e0%a6%9b%e0%a7%8b%e0%a6%9f%e0%a6%a6%e0%a7%87%e0%a6%b0-%e0%a6%ac%e0%a6%87/");
		Thread.sleep(5000);
		
		select.add();
		Thread.sleep(3000);
		
//		getDriver().navigate().to("https://www.printworksbd.com/checkout/");
//		Thread.sleep(5000);
		
		check.information();
		Thread.sleep(3000);
		
		check.dologin("Emran", "Ahmed", "Dhaka", "01852369741", "karimahmed564@gmail.com");
		check.click();
		Thread.sleep(5000);
		
	}

}
