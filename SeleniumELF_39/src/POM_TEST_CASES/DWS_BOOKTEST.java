package POM_TEST_CASES;

import org.testng.annotations.Test;

import Pom_pages.DWS_BOOKSPAGE;
import Pom_pages.DWS_HOMEPAGE;
import framework_utility.Base_test;

public class DWS_BOOKTEST extends Base_test{
	@Test
	public void tc04() {
		DWS_HOMEPAGE hp=new DWS_HOMEPAGE(driver);
		hp.click_BOOKS();
		
		
		DWS_BOOKSPAGE bp=new DWS_BOOKSPAGE(driver);
		bp.click_low_high();
		bp.select_page();
		bp.select_grid();
		
		
		
		
		
		
	}
	
	
	

}
