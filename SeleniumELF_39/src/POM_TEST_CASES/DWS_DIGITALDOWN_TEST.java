package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_JEWELRYPAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_DIGITALDOWN_TEST extends Base_test {
	@DataProvider(name="digitaltest")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("digital");
		return data;
	}
	
	
	@Test(dataProvider = "digitaltest")
	public void tc08(String val1,String val2,String val3) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_digital_download();
		
		DWS_JEWELRYPAGE jp=new DWS_JEWELRYPAGE(driver);
		jp.click_low_high(val1);
		jp.select_page(val2);
		jp.select_grid(val3);
		

}
	
	
	
	
	
	
	
	
}
