package testng_basics;

import org.testng.annotations.Test;

public class Smoke_test_1 {
	@Test
	public void Register() {
		System.out.println("executing register TC");
		}
	
	@Test(groups = "SmokeTest",priority = 1)
	public void Login() {
		System.out.println("Executing login TC");
	}
	@Test
	public void Search() {
		System.out.println("Executing search TC");
	}
	@Test(groups = "SmokeTest",priority = 2)
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test(groups = "SmokeTest")
	public void Logout() {
		System.out.println("Executing logout TC");
	}

}
