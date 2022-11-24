package SeleniumBasic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/demo%20(1).html");
		WebElement car=driver.findElement(By.id("standard_cars"));
		Select sel=new Select(car);
		sel.selectByValue("aud");
		Thread.sleep(1000);
		sel.selectByVisibleText("Ford");
		Thread.sleep(1000);
		sel.selectByIndex(5);

		
	}

}
