package Home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_select_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		WebElement books=driver.findElement(By.name("products-orderby"));
		Select sel=new Select(books);
	   // sel.selectByValue("  ");
		//sel.selectByIndex(0);
		sel.selectByVisibleText("Name: A to Z");
		
		WebElement books1=driver.findElement(By.id("products-pagesize"));
		Select sel1=new Select(books1);
		sel1.selectByVisibleText("12");
		
		
		WebElement books2=driver.findElement(By.id("products-viewmode"));
		Select sel2=new Select(books2);
		sel2.selectByVisibleText("List");
	}

}
