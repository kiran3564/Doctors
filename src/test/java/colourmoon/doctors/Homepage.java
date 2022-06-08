package colourmoon.doctors;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.Addlcation;
import Pageobjects.Loginpage;
import resources.Baseclass;

public class Homepage extends Baseclass {
	
	public WebDriver driver;
	
@BeforeTest
	
	public void opens() throws InterruptedException, IOException
	{
		driver =browserinitialize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	
	@Test(dataProvider="getdata")
	public void open(String user,String password) throws IOException, InterruptedException
	{

	Loginpage lp =new Loginpage(driver);
		lp.username().sendKeys(user);
		lp.password().sendKeys(password);
		lp.loginbutton().click();
		
		Addlcation ad = new Addlcation(driver);
				ad.location().click();
				ad.states().click();
				ad.addnew().click();
			    ad.statename().sendKeys("kolkata");
		        ad.dropdown().click();
		       ad.saves().click();
		  

 
	}
	
	
@AfterTest
public void teardown()
{
	driver.close();
}

	
	@DataProvider
	public Object[][] getdata() throws InterruptedException {
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="admin";
		data[0][1]="cmoon";
		
		data[1][0]="admin";
		data[1][1]="cmoon@123";
		return data;
		
	}
	
	
	

}

