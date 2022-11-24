package Pom_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_methods;

public class DWS_HOMEPAGE extends Utility_methods  {
	//constructor-to initialize the driver instance and WebElements
	
	public DWS_HOMEPAGE(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	// WebElements
	 @FindBy(xpath="//a[text()='Register']")
     WebElement register_link;  // click to register
	
	@FindBy(xpath="//a[text()='Log in']")
    WebElement login_link;      // click to login
	

	@FindBy(xpath="//input[@class='button-1 search-box-button']")
     WebElement click_search;  //click search 
	
	@FindBy(xpath="(//a[@href='/books'])[1]")
    WebElement click_book; // in HomePage 
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
    WebElement mouse_hover_comp; // mouse_hover 
	@FindBy(xpath="(//a[@href='/accessories'])[1]")
    WebElement mouse_hover_accessories;
	
	
	@FindBy(xpath="(//a[@href='/electronics'])[1]")
    WebElement mouse_hover_ele; // mouse_hover Electronics
	@FindBy(xpath="(//a[@href='/camera-photo'])[1]")
    WebElement mouse_hover_photo; 
	
	@FindBy(xpath="(//a[@href='/jewelry'])[1]")
    WebElement click_jewel; 
	
	@FindBy(xpath="(//a[@href='/apparel-shoes'])[1]")
    WebElement click_apparel; 
	
	@FindBy(xpath="(//a[@href='/digital-downloads'])[1]")
    WebElement click_digital; 
	
	@FindBy(xpath="(//a[@href='/gift-cards'])[1]")
    WebElement click_gift; 
	
	
	
	@FindBy(xpath="(//a[@href='/wishlist'])[1]")
    WebElement click_wish; 
	

	@FindBy
    WebElement page_down; // home page -page down
	
	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
    WebElement add_to_cart; 
	
	
	@FindBy(xpath = "//a[@href='http://www.facebook.com/nopCommerce']")
	WebElement facebook;   // multiple window
	
	@FindBy(xpath="(//a[@href='/cart'])[1]")
    WebElement shopping_cart;
	
	
	
	
	// Methods
	public void Click_register() {
		//register_link.click();
		Utility_methods.click_button(register_link);
	}
	
	public void Click_Login() {
		//login_link.click();
		Utility_methods.click_button(login_link);
	}
	
	 public void click_search_btn() {
		   Utility_methods.click_button(click_search); 
	 }
	 
	 public void click_BOOKS() {
		 Utility_methods.click_button(click_book);
	 }
	 
	 public void Mouse_hover_comp() {
		// Utility_methods.click_button(mouse_hover);
		 Utility_methods.action_class(mouse_hover_comp).moveToElement(mouse_hover_comp).build().perform();
		 Utility_methods.action_class(mouse_hover_accessories).moveToElement(mouse_hover_accessories).click().perform();
	 }
	   public void Mouse_hover_electronics() {
		   Utility_methods.action_class(mouse_hover_ele).moveToElement(mouse_hover_ele).build().perform();
		   Utility_methods.action_class(mouse_hover_photo).moveToElement(mouse_hover_photo).click().perform();
		   
	   }
	   
	public void click_jewelry() {
		Utility_methods.click_button(click_jewel);
	}
	
	public void click_apparel_shoes(){
		Utility_methods.click_button(click_apparel);
	}
	
	public void click_digital_download() {
		Utility_methods.click_button(click_digital);
		}
	
	public void click_gift_cards() {
		Utility_methods.click_button(click_gift);
	}
	
	public void click_wishlist() {
		Utility_methods.click_button(click_wish);
	}
	
	public void Add_cart_gift() {
		Utility_methods.click_button(add_to_cart);
	}
	 public void page_down() {
		 Utility_methods.action_class(page_down).sendKeys(Keys.PAGE_DOWN).perform();
	 }
	 public void click_fb() {
			Utility_methods.click_button(facebook);
		}
	 public void click_shopping_cart() {
		 Utility_methods.click_button(shopping_cart);
	 }
	
	
	
	
}


