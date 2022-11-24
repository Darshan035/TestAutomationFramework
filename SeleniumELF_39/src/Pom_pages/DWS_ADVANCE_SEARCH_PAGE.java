package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_ADVANCE_SEARCH_PAGE extends Utility_methods {
	//constructor-to initialize the driver instance and WebElements
		public DWS_ADVANCE_SEARCH_PAGE(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//webElements
		@FindBy(xpath="//input[@id='small-searchterms']")
	    WebElement search;   // search field
		
		
		@FindBy(xpath="(//input[@type='checkbox'])[1]")
		WebElement  checkbox1;
			@FindBy(xpath="//select[@id='Cid']")
		WebElement cid;
		
			@FindBy(xpath="(//input[@type='checkbox'])[2]")
		WebElement  checkbox2;
		@FindBy(xpath="//select[@id='Mid']")
		WebElement mid;
		
		@FindBy(xpath="(//input[@type='checkbox'])[3]")
		WebElement  checkbox3;
		@FindBy(xpath="//input[@class='button-1 search-button']")
		WebElement  click;  
		
		
		

         //Methods
		 public void click_search_field(String value) {
			  // search.click();
			   Utility_methods.Enter_value_in_edit_field(search, value);
		   }
		
		
		
		
		
		public void click_checkbox_1() {
			//checkbox1.click();
			Utility_methods.click_button(checkbox1);
		}
			public void click_cid(String value) {
			Utility_methods.drop_down_visible_text(cid, value);
			}
		public void click_checkbox_2() {
			Utility_methods.click_button(checkbox2);
	   }
		public void click_mid(String value) {
			Utility_methods.drop_down_visible_text(mid, value);
		}
		public void click_checkbox_3() {
			Utility_methods.click_button(checkbox3);
		}
		
		public void click_advance_btn() {
			Utility_methods.click_button(click);
		}   
		
}
