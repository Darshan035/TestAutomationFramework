package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	//	driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		//driver.findElement(By.xpath("(//span[contains(@class,'cart-label')])[1]")).click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Digital')])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]")).sendKeys("Digital DOWNLOADS");
		driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		driver.findElement(By.cssSelector("input[id='As']")).click();
		driver.findElement(By.cssSelector("select[id='Cid']")).click();
		driver.findElement(By.cssSelector("option[value='2']")).click();
		driver.findElement(By.cssSelector("select[data-val='true']")).click();
		driver.findElement(By.cssSelector("input[class='button-1 search-button']")).click();
		
		
	}

}
