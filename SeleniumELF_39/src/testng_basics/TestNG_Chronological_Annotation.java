package testng_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Chronological_Annotation {

	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before_Suite");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After_suite");
	}
	
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before_Test");
	}
	@AfterTest
	public void AfterTestr() {
		System.out.println("After_Test");
	}
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before_class");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After_class");
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before_method");
	}
	@AfterMethod
	public void AfterMethod() {
         System.out.println("After_Method");
	}
	
	
	@Test
	public void Method1() {
		System.out.println("Welcome M1");
	}
	@Test
	public void Method2() {
		System.out.println("Welcome M2");
	}

}
