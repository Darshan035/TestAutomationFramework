package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_MULTIPLEHANDLE_PAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_MULTIPLEHANDLE_TEST extends Base_test{
	@DataProvider(name="multihandletest")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("multihandle");
		return data;
	}
	
	@Test(dataProvider = "multihandletest")
	public void Tc12(String val1,String val2) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
	//	hp.page_down();
	//	hp.page_down();
		hp.click_fb();
	
	
	DWS_MULTIPLEHANDLE_PAGE mhp=new DWS_MULTIPLEHANDLE_PAGE(driver);
	 // mhp.Click_mail(val1);
	  //mhp.Click_password_fb(val2);
	  //mhp.Click_btn_ffb();

}
}