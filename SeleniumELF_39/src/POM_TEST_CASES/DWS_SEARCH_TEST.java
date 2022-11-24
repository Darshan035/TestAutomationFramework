package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_SEARCHPAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_SEARCH_TEST extends Base_test {
	@DataProvider(name="searchtest")
	public Object[][] testdata1() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("search");
		return data;
	}
	
	
	
	@Test(dataProvider = "searchtest")
	public void TC03(String searchproduct) {
		DWS_SEARCHPAGE sp=new DWS_SEARCHPAGE(driver);
		sp.click_search_field(searchproduct);
		
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_search_btn();
		
		
		}
}
