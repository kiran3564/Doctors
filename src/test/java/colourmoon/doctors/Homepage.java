package colourmoon.doctors;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepage extends Baseclass {

	@Test
	public void open() throws IOException
	{
	
	driver =browserinitialize();
	driver.manage().window().maximize();
	driver.get("https://stackoverflow.com/questions/7600898/testng-error-cannot-find-class-in-classpath");
	
	}
	
}
