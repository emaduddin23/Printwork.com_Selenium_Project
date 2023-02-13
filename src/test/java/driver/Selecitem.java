package driver;

import org.openqa.selenium.By;
import pages.Basepage;

public class Selecitem extends Basepage{
	
//	public By selectitem = By.cssSelector("//li[@id='nav-menu-item-721']//a[contains(text(),'বাংলা')]");
//	public By itemBy = By.cssSelector("li[id='nav-menu-item-13852'] a");
//	
//	public By item = By.cssSelector(".viewcart-style-2 button product_type_simple add_to_cart_button ajax_add_to_cart added");
//	
//	
//	public void testing() {
//		clickanElement(selectitem);
//	}
//	
//	public void testing3() {
//		clickOnElement(itemBy);
//	}
//	
//	public void testing4() {
//		clickOnElement(item);
//		
//		
//	}
	
	public By cart = By.xpath("//body/div[contains(@class,'page-wrapper')]/div[@id='main']/div[contains(@class,'container')]/div[contains(@class,'row main-content-wrap')]/div[contains(@class,'main-content col-md-9')]/div[@id='container']/div[@id='content']/div[contains(@class,'archive-products')]/div[contains(@class,'yit-wcan-container')]/ul[contains(@class,'products pcols-lg-4 pcols-md-3 pcols-xs-2 pcols-ls-1 pwidth-lg-4 pwidth-md-3 pwidth-xs-2 pwidth-ls-1 grid')]/li[contains(@class,'show-outimage-q-onimage product-first pcols-lg-first pcols-md-first pcols-xs-first post-15333 product type-product status-publish has-post-thumbnail product_cat-5803 product_cat-4337 product_cat-bangla-books first instock sale shipping-taxable purchasable product-type-simple')]/div[contains(@class,'add-links-wrap')]/div[contains(@class,'clearfix')]/a[1]");
	
	
	public void add() {
		//action2(cart2);
		clickOnElement(cart);
		
	}

}
