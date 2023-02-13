package tests;

import org.testng.annotations.Test;

import driver.Driversetup;
import driver.Selecitem;

public class Selec_item extends Driversetup {
	
	Selecitem select =  new Selecitem();
	
	@Test
	public void iteam() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/product-category/bangla-books/%e0%a6%9b%e0%a7%8b%e0%a6%9f%e0%a6%a6%e0%a7%87%e0%a6%b0-%e0%a6%ac%e0%a6%87/");
//		select.testing();
//		Thread.sleep(1000);
//		select.testing3();
//		
//		select.testing4();
//		Thread.sleep(1000);
		select.add();
		Thread.sleep(5000);
		
		
	}

}
