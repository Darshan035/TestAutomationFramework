package testng_basics;

import org.testng.annotations.Test;

public class Xml_exclude_methods {
	@Test(priority = 1)
	public void Register() {
		System.out.println("executing register TC");
		}
	
	@Test(priority = 2)
	public void Login() {
		System.out.println("Executing login TC");
	}
	@Test(priority = 3)
	public void Search() {
		System.out.println("Executing search TC");
	}
	@Test(priority = 4)
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test(priority = 5)
	public void Logout() {
		System.out.println("Executing logout TC");
	}

}
