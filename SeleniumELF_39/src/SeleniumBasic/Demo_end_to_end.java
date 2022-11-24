package SeleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_end_to_end {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();             
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Darshu");
		driver.findElement(By.name("LastName")).sendKeys("Gowda");
		driver.findElement(By.id("Email")).sendKeys("darshu2@text.com");
		driver.findElement(By.name("Password")).sendKeys("Password");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();   // login
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("darshu2@text.com");
		driver.findElement(By.name("Password")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		
	//	driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("BOOKS");
		driver.findElement(By.linkText("BOOKS")).click();
		
		WebElement books=driver.findElement(By.id("products-orderby"));
		Select sel=new Select( books);
		sel.selectByVisibleText("Name: A to Z");
		
		//List<WebElement> allbooks=driver.findElements(By.xpath("//div[@class='item-box']"));	//to print all name,price	
		//for(int i=0;i<=allbooks.size()-1;i++) {
			//System.out.println( allbooks.get(i).getText());                                  //by using gettext();
			
			List<WebElement> allbooks=driver.findElements(By.xpath("//img"));	// to print only name	
			for(int i=0;i<=allbooks.size()-1;i++) {
				System.out.println( allbooks.get(i).getAttribute("alt"));                     // by using GetAttribute(value);
		}
		}
}
