package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_ADVANCE_SEARCH_PAGE;
import Pom_pages.DWS_HOMEPAGE;

import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_ADVANCE_SEARCH_TEST extends Base_test {
	@DataProvider(name="search1")
	public Object[][] testdata1() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("advancesearch");
		return data;
	}
	@Test(dataProvider = "search1")
	public void tc13(String value ,String cid1,String mid1) {
		
		DWS_ADVANCE_SEARCH_PAGE adsp=new DWS_ADVANCE_SEARCH_PAGE(driver);
		adsp.click_search_field(value);
	
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_search_btn();
		
		DWS_ADVANCE_SEARCH_PAGE adsp1=new DWS_ADVANCE_SEARCH_PAGE(driver);
		adsp1.click_checkbox_1();
		adsp1.click_cid(cid1);
		adsp1.click_checkbox_2();
		adsp1.click_mid(mid1);
		adsp1.click_checkbox_3();
	//	adsp1.click_advance_btn();
		
		
		 
	}		

}