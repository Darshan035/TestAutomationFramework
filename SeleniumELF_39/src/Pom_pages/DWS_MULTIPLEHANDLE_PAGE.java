package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_MULTIPLEHANDLE_PAGE extends Utility_methods{
	// constructor
				public DWS_MULTIPLEHANDLE_PAGE (WebDriver driver) {
					PageFactory.initElements(driver,this);
				}
           // webElement
				@FindBy(xpath="//input[@name='email']")
				WebElement mail; 
				
				@FindBy(xpath="//input[@name='pass']")
				WebElement password;
			
				@FindBy(xpath="(//span[text()='Log in'])[1]")
				WebElement click_fb_btn;
				
				
				
				
				// Methods
				public void Click_mail(String email) {
					Utility_methods.Enter_value_in_edit_field(mail,email);
				}
				public void Click_password_fb(String pwd) {
					Utility_methods.Enter_value_in_edit_field(password, pwd);
				}
				public void Click_btn_ffb() {
					Utility_methods.click_button(click_fb_btn);
				}
					
}