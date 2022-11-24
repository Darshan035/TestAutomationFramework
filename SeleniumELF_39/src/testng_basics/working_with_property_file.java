package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class working_with_property_file {
	@Test
	public void property_demo() throws IOException {
		String Filepath="./Test_configuration/Test_configuration.properties";
		FileInputStream fis=new FileInputStream(Filepath);
		
		// creating an object for properties class
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("FirstName"));
		System.out.println(prop.get("LastName"));
	}

}

 