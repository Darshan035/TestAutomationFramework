package testng_basics;

import org.testng.annotations.Test;

public class execution_order_helper_method {
	@Test
	public void Register() {
		System.out.println("executing register TC");
		}
	
	@Test(dependsOnMethods = "Register")
	public void Login() {
		System.out.println("Executing login TC");
	}
	@Test(dependsOnMethods = "Login")
	public void Search() {
		System.out.println("Executing search TC");
	}
	@Test(dependsOnMethods = "Search")
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test(dependsOnMethods = "Wishlist")
	public void Logout() {
		System.out.println("Executing logout TC");
	}
	

}
