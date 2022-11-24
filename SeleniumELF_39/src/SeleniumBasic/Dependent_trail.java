package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_trail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://demowebshop.tricentis.com/desktops");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='/build-your-cheap-own-computer'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']/preceding-sibling::script/parent::div")).click();
		
	
	}

}
