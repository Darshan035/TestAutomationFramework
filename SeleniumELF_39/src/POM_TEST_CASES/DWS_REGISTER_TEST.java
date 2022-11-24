package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_REGISTERPAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_REGISTER_TEST extends Base_test {
	@DataProvider(name="register")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("Register");
		return data;
	}
	
	
	
	@Test(dataProvider = "register")
	public void TC02(String fname,String lname,String Email,String password,String Cpassword) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.Click_register();
		
		DWS_REGISTERPAGE rt=new DWS_REGISTERPAGE(driver);
		rt.click_male();
		rt.enter_first_name(fname);
		rt.enter_last_name(lname);
		rt.enter_mail(Email);
		rt.enter_pswd(password);
		rt.enter_Confirm_pswd(Cpassword);
		rt.Click_reg_btn();

}
	}
