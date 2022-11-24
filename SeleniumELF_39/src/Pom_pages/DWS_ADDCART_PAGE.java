package Pom_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_ADDCART_PAGE {
	//constructor-to initialize the driver instance and WebElements
			public DWS_ADDCART_PAGE(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			
			@FindBy
			WebElement page_down;
			
			@FindBy(xpath="//input[@id='add-to-cart-button-31']")
		    WebElement last_click; 
			
			
			
			
			
			
			// Methods 

			public void page_down_cart() {
				Utility_methods.action_class(page_down).sendKeys(Keys.PAGE_DOWN).perform();
			}
			
			public void click_final_cart_btn() {
				Utility_methods.click_button(last_click);;
			}

}
