package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
	@DataProvider(name ="TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[5][2];
		data[0][0]="Darshan";
		data[0][1]="Gowda";
		
		data[1][0]="keerthana";
		data[1][1]="Gowda";
		
		data[2][0]="rajneesh";
		data[2][1]="Gowda";
		
		data[3][0]="soma";
		data[3][1]="shekar";
		
		data[4][0]="sankalp";
		data[4][1]="sanjapur";
		
		
		return data;
		
	}
	@Test(dataProvider ="TestData")
	public void name(String FirstName,String LastName) {
		System.out.println(FirstName);
		System.out.println(LastName);

		
	}
	

}
