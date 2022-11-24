package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_JEWELRYPAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_GIFTCARD_TEST extends Base_test{
	@DataProvider(name="gifttest")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("gift");
		return data;
	}
	
	@Test(dataProvider = "gifttest")
	public void tc10(String val1,String val2,String val3) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_gift_cards();
		
		DWS_JEWELRYPAGE jp=new DWS_JEWELRYPAGE(driver);
		jp.click_low_high(val1);
		jp.select_page(val2);
		jp.select_grid(val3);
		

}
	
}
