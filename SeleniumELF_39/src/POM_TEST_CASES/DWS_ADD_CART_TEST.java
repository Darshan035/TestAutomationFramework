package POM_TEST_CASES;

import org.testng.annotations.Test;

import Pom_pages.DWS_ADDCART_PAGE;
import Pom_pages.DWS_HOMEPAGE;
import framework_utility.Base_test;

public class DWS_ADD_CART_TEST extends Base_test {
	@Test
	public void Tc14() {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.page_down();
		hp.Add_cart_gift();
		
	//	DWS_ADDCART_PAGE adc=new DWS_ADDCART_PAGE(driver);
	
//		adc.page_down_cart();
//		adc.click_final_cart_btn();
		
	}

}
