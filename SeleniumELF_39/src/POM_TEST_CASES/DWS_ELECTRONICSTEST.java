package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_ELECTRONICSPAGE;
import Pom_pages.DWS_HOMEPAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_ELECTRONICSTEST extends Base_test {
	@DataProvider(name="Electronicstest")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("Elemouse");
		return data;
	}
	
	
	@Test(dataProvider = "Electronicstest")
	public void tc06(String val1,String val2,String val3) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.Mouse_hover_electronics();
		
		DWS_ELECTRONICSPAGE ep=new DWS_ELECTRONICSPAGE(driver);

	ep.click_low_high(val1);
	ep.select_page(val2);
	ep.select_grid(val3);

}
}
