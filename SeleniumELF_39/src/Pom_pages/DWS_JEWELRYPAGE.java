package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_JEWELRYPAGE {
	// constructor
			public DWS_JEWELRYPAGE(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}

			// WebElements 
			
			@FindBy(id="products-orderby")
			WebElement low_high_ele;
		
		
		@FindBy(name="products-pagesize")
		WebElement sel_page_ele;
		
		@FindBy(name="products-viewmode")
		WebElement sel_view_ele;
		

		// Methods
		public void click_low_high(String value) {
			//Utility_methods.click_button(low_high);
			Utility_methods.drop_down_visible_text(low_high_ele,value);
		}
		
		public void select_page(String value) {
			//Utility_methods.click_button(sel_page);
			Utility_methods.drop_down_visible_text(sel_page_ele, value);
		}
		
		public void select_grid(String value) {
			//Utility_methods.click_button(sel_view);
			Utility_methods.drop_down_visible_text(sel_view_ele,value);
		}
		

}
