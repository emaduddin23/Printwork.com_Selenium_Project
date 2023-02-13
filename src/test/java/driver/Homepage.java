package driver;

import org.openqa.selenium.By;

import io.qameta.allure.Step;
import pages.Basepage;

public class Homepage extends Basepage {
	
	public By hover = By.xpath("//li[@id='nav-menu-item-721']//a[contains(text(),'বাংলা')]");
	public By press = By.cssSelector("li[id='nav-menu-item-13852'] a");
	
	@Step("Hover on bangla features and click the features")
	public void preson() {
		action2(hover);
		clickOnElement(press);
	}

}
