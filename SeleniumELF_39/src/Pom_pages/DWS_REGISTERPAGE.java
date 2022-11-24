package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_REGISTERPAGE extends Utility_methods{
	//constructor-to initialize the driver instance and WebElements
	
		public DWS_REGISTERPAGE(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		// WebElements
        @FindBy(css="input[id='gender-male']")
        WebElement male_radio_btn;
        
        @FindBy(xpath="//input[@id='FirstName']")
        WebElement first_name ;
        
        @FindBy(xpath="//input[@id='LastName']")
         WebElement last_name ;
        
        @FindBy(xpath="//input[@id='Email']")
        WebElement email ;
        
        @FindBy(xpath="//input[@id='Password']")
        WebElement password ;
        
        @FindBy(xpath="//input[@id='ConfirmPassword']")
        WebElement confirm_password ;
        
        @FindBy(xpath="//input[@id='register-button']")
        WebElement reg_btn ;
        
        
        
        // Methods 
        public void click_male() {
        	//male_radio_btn.click();
        	Utility_methods.click_button(male_radio_btn);
        }
        
        public void enter_first_name(String value) {
        	//first_name.sendKeys(value);
        	Utility_methods.Enter_value_in_edit_field(first_name, value);
        }
        
        public void enter_last_name(String value) {
        	//last_name.sendKeys(value);
        	Utility_methods.Enter_value_in_edit_field(last_name, value);
        }
        
        public void enter_mail(String value) {
        	//email.sendKeys(value);
        	Utility_methods.Enter_value_in_edit_field(email, value);
        }
        public void enter_pswd(String value) {
        	//password.sendKeys(value);
        	Utility_methods.Enter_value_in_edit_field(password, value);
        }
        public void enter_Confirm_pswd(String value) {
        	//confirm_password.sendKeys(value);
        	Utility_methods.Enter_value_in_edit_field(confirm_password, value);
        }
        
        public void Click_reg_btn() {
        	//reg_btn.click();
        	Utility_methods.click_button(reg_btn);
        }
        
        
        
        
        
        
        
        
        
        
        
        
}
