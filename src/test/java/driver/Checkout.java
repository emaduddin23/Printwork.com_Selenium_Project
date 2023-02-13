package driver;

import org.openqa.selenium.By;

import io.qameta.allure.Step;
import pages.Basepage;

public class Checkout extends Basepage {
	public By cart2 = By.cssSelector(".cart-items");
	public By out = By.cssSelector(".button.checkout.wc-forward");
	public By name = By.id("billing_first_name");
	public By lastnameBy =  By.id("billing_last_name");
	public By address = By.id("billing_address_1");
	public By phone = By.id("billing_phone");
	public By email = By.id("billing_email");
	
	//public By scrollBy = By.xpath("//input[@id='place_order']");
	public By order = By.cssSelector("#place_order");
	
	
	public void information() {
		action2(cart2);
		clickOnElement(out);
	}
	
	@Step("")
	public void dologin(String name,String lastname,String address,String phone,String email) {
		writeText(this.name,name);
		writeText(this.lastnameBy,lastname);
		writeText(this.address, address);
		writeText(this.phone, phone);
		writeText(this.email, email);
	}
	
	@Step("Highlight the button")
	public void click() {
		scroll(order);
		highlighter(order);
		
	}
	

}
