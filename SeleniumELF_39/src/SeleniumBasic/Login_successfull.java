package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_successfull {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.cssSelector("input[id='gender-male']")).click();
			driver.findElement(By.id("FirstName")).sendKeys("darshann");
			driver.findElement(By.name("LastName")).sendKeys("gowdaa");
			driver.findElement(By.id("Email")).sendKeys("darshannn1@text.com");
			driver.findElement(By.name("Password")).sendKeys("Password");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("Password");
			driver.findElement(By.id("register-button")).click();
			//driver.quit();
			
			String actual_value=driver.findElement(By.className("result")).getText();
			String expected_value="Your registration completed";
			if(expected_value.equalsIgnoreCase(actual_value)) {
				System.out.println("logined ");
			}
				else {
					System.out.println(".....");
					
				}
			}
			
			
	}


