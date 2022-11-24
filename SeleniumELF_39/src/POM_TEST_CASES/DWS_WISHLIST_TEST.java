package POM_TEST_CASES;

import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import framework_utility.Base_test;

public class DWS_WISHLIST_TEST extends Base_test {
	@Test
	public void TC12() {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_wishlist();
	}

}
