package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Loginpage  {

	public WebDriver driver;
	
	By username =By.cssSelector("input[placeholder='Username']");
	By password  =By.cssSelector("input[placeholder='Password']");
	By loginbutton = By.cssSelector("button[type='submit']");
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

	
	

public WebElement username()
{
	return driver.findElement(username);
	
}
public WebElement password()
{
	return driver.findElement(password);
}
public WebElement loginbutton()
{
	return driver.findElement(loginbutton);
}
}