package driver;

import org.openqa.selenium.By;

import io.qameta.allure.Step;
import pages.Basepage;

public class Loginpage extends Basepage{
	public By Login  = By.cssSelector("ul[id='menu-top-navigation'] li[class='menu-item'] a");
	public By username =  By.id("username");
	public By password = By.id("password");
	public By submit =  By.className("login");
	
	@Step("Press the login button")
	public void form() {	
		clickOnElement(Login);
	}
	
	
	@Step("Fill the username and password field")
	public void enterUsername(String username) {
		writeText(this.username,username);
	}
	public void enterPassword(String password) {
		writeText(this.password,password);
	}
	
	@Step("Submit the button")
	public void click() {
		clickOnElement(submit);
		
	}

}
