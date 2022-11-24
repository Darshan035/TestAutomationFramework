package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider_sending_keys {
	@DataProvider(name ="TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[5][5];
		data[0][0]="Darshan";
		data[0][1]="Gowda";
		data[0][2]="darshan500@gmail.com";
		data[0][3]="Password";
		data[0][4]="Password";
		
		data[1][0]="Darshan";
		data[1][1]="Gowda";
		data[1][2]="darshan501@gmail.com";
		data[1][3]="Password";
		data[1][4]="Password";
		
		data[2][0]="Darshan";
		data[2][1]="Gowda";
		data[2][2]="darshan502@gmail.com";
		data[2][3]="Password";
		data[2][4]="Password";
		
		data[3][0]="Darshan";
		data[3][1]="Gowda";
		data[3][2]="darshan503@gmail.com";
		data[3][3]="Password";
		data[3][4]="Password";
		
		data[4][0]="Darshan";
		data[4][1]="Gowda";
		data[4][2]="darshan504@gmail.com";
		data[4][3]="Password";
		data[4][4]="Password";
		
		 return data;
	}
	
	@Test(dataProvider ="TestData")
	public void name(String FirstName,String LastName,String email,String pswd,String cpswd) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.name("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(pswd);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(cpswd);
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		driver.close();
		
		
	}
	
}
	
