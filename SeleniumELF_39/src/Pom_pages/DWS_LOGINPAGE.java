package Pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_LOGINPAGE extends Utility_methods {
	
	// constructor
	public DWS_LOGINPAGE(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	// WebElements
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_btn;
	
	// Methods
	public void Enter_email(String value) {
		//username.sendKeys(value);
		Utility_methods.Enter_value_in_edit_field(username, value);
	}
	
	public void Enter_pswd(String value) {
		//password.sendKeys(value);
		Utility_methods.Enter_value_in_edit_field(password, value);
	}
	public void click_login() {
		//login_btn.click();
		Utility_methods.click_button(login_btn);
	}
	
	
	
	
	}
