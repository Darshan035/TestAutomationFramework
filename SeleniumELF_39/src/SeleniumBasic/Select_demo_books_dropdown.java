package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select_demo_books_dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		WebElement books=driver.findElement(By.id("products-orderby"));
		Select sel=new Select(books);
		sel.selectByVisibleText("Name: A to Z");
		WebElement display=driver.findElement(By.name("products-pagesize"));
		Select sel1=new Select(display);
		sel1.selectByVisibleText("12");
		WebElement view=driver.findElement(By.name("products-viewmode"));
		Select sel2=new Select(view);
		sel2.selectByVisibleText("List");
	
		}
}
