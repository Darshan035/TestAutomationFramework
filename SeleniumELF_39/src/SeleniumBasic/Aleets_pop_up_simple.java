package SeleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Aleets_pop_up_simple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement double_click =driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		    Actions action=new Actions(driver);
		   action.doubleClick(double_click).build().perform();
		   Thread.sleep(1000);
		   
		   //switching the alertN
		     Alert ale=driver.switchTo().alert();
		     // to get text of pop up
		     System.out.println(ale.getText());
		     // to accept
		     ale.accept();
		     //to dismiss
		  //   ale.dismiss();
		
	}

}
