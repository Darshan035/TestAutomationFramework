package Home_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	   //	driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("nithin");
		Thread.sleep(2000);
		driver.findElement(By.name("LastName")).sendKeys("gowda");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("nithin20@text.com");
		Thread.sleep(2000);
		driver.findElement(By.name("Password")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		//driver.quit();
		String expected_value="Your registration completed";                                  //   [verifying the login]
	    String actual_value=driver.findElement(By.className("result")).getText();   
		System.out.println(actual_value);
		if(expected_value.equalsIgnoreCase(actual_value)) {
			System.out.println("login succesfull");
		} 
		else {
			System.out.println("login failed");                                                 
		} 
		
	 
	 /*	driver.findElement(By.id("Email")).sendKeys("darshan19@text.com");                    //[verifying the right user]
		driver.findElement(By.id("Password")).sendKeys("Password");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		String expected_value="darshan19@text.com";
	    String actual_value=driver.findElement(By.linkText("darshan19@text.com")).getText();  // [get text method  or ]
		System.out.println(actual_value);
		
		//String attribute_value=driver.findElement(By.linkText("darshan19@text.com")).getAttribute("class"); //[get attribute method]
		//		System.out.println(attribute_value);
		
		if(expected_value.equalsIgnoreCase(actual_value)) {
			System.out.println("right user");
		}
		else {
			System.out.println("fake user");
		}   */
		
	/*	driver.findElement(By.linkText("Register")).click();                               //[css value method]
		String get_value=driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(get_value);
		driver.close(); */		
	
	
		
		

        
    
		
		
	}

}
