package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_BOOKSPAGE extends Utility_methods {
	
	// constructor
		public DWS_BOOKSPAGE(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		// WebElements 
		
		@FindBy(xpath="//option[text()='Price: Low to High']")
		WebElement low_high;
		
		@FindBy(xpath="//option[text()='12']")
		WebElement sel_page;
		
		@FindBy(xpath="//option[text()='Grid']")
		WebElement sel_view;
		
		
		
		// Methods
		public void click_low_high() {
			Utility_methods.click_button(low_high);
		}
		
		public void select_page() {
			Utility_methods.click_button(sel_page);
		}
		
		public void select_grid() {
			Utility_methods.click_button(sel_view);
		}
		
		
		
		
		
		
		
}
