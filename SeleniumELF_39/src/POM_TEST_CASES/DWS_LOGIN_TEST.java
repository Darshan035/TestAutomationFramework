package POM_TEST_CASES;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_pages.DWS_HOMEPAGE;
import Pom_pages.DWS_LOGINPAGE;
import framework_utility.Base_test;
import framework_utility.Utility_methods;

public class DWS_LOGIN_TEST extends Base_test {
	
	@DataProvider(name="login")
	public Object[][] testdata() throws IOException {
		Object[][] data=Utility_methods.TestData_excel("Login");
		return data;
	}
	
	
	@Test(dataProvider = "login")
	public void TC01(String Email,String password) {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.Click_Login();
		
		DWS_LOGINPAGE lp=new DWS_LOGINPAGE(driver);
		lp.Enter_email(Email);
		lp.Enter_pswd(password);
		lp.click_login();
	}

}
