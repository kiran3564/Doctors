package colourmoon.doctors;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.landingpage;
import resources.Baseclass;

public class validatetitle extends Baseclass {
	
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(validatetitle.class.getName());
	@BeforeTest
	
	public void opens() throws InterruptedException, IOException
	{
		driver =browserinitialize();
		log.info("driver got initialized");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("browser maximized");
	
	}
	
	
	@Test
	public void open() throws IOException, InterruptedException
	{
	
	
	landingpage lp = new landingpage(driver);
	Assert.assertEquals(lp.title().getText(), "Admin Login");
	
	
	

 
	}
	@AfterTest
	
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
}

