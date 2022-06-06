package colourmoon.doctors;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Addlcation;
import Pageobjects.Loginpage;
import Pageobjects.landingpage;

public class validatetitle extends Baseclass {
	
	public WebDriver driver;
	@BeforeTest
	
	public void opens() throws InterruptedException, IOException
	{
		driver =browserinitialize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	@Test
	public void open() throws IOException, InterruptedException
	{
	
	
	landingpage lp = new landingpage(driver);
	Assert.assertEquals(lp.title().getText(), "Admin Login");
	
	
	

 
	}
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
}

