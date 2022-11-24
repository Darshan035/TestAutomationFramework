package testng_basics;

import org.testng.annotations.Test;

public class Smoke_test_2 {
	@Test
	public void Search() {
		System.out.println("Executing search TC");
	}
	@Test(groups = "SmokeTest",priority = 4)
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test(groups = "SmokeTest",priority = 3)
	public void AdvacnceSearch() {
		System.out.println("Executing advance serach");
	}

}
