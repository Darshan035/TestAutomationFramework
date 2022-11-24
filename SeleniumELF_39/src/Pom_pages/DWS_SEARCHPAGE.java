package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_SEARCHPAGE extends Utility_methods{
	//constructor-to initialize the driver instance and WebElements
	public DWS_SEARCHPAGE(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//webElements
	@FindBy(xpath="//input[@id='small-searchterms']")
    WebElement search;   // search field
	

// Methods
	 public void click_search_field(String value) {
		  // search.click();
		   Utility_methods.Enter_value_in_edit_field(search, value);
	   }
   
   
   
   
   
   
}