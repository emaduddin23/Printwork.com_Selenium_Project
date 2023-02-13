package driver;

import org.openqa.selenium.By;

import io.qameta.allure.Step;
import pages.Basepage;

public class Createaccount extends Basepage{
	public By Login  = By.cssSelector("ul[id='menu-top-navigation'] li[class='menu-item'] a");
	public By creat = By.cssSelector(".btn.btn-primary");
	public By email =  By.id("reg_email");
	public By pass = By.xpath("//input[@id='reg_password']");
	public By submit = By.xpath("//input[@name='register']");
	
	@Step("Press The login button and Then Creat Account")
	public void menu() {
		clickOnElement(Login);
		clickOnElement(creat);	
	}
	
	@Step("Creat Account Entering the Email and Password")
	public void enterUsername(String username) {
		writeText(email, username);
	}
	public void enterPassword(String password) {
		writeText(pass, password);
	}
	@Step("Submit the form")
	public void menu2() {
		clickOnElement(submit);
		
	}
	
	
	

}
