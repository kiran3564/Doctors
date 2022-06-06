package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Addlcation {

	public WebDriver driver;
	
	By location = By.cssSelector("body > div:nth-child(2) > nav:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)");
	By states =By.xpath("//span[normalize-space()='States']");
	By addnew =By.xpath("//a[@type='button']");
	By statename=By.xpath("//input[@name='name']");
    By savebutton = By.xpath("//input[@name='submit']");
	
	
	public Addlcation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement location() {
		
		return driver.findElement(location);
	}
	public WebElement states() {
		return driver.findElement(states);
	}
	public WebElement addnew()
	{
		return driver.findElement(addnew);
	}
	public WebElement statename()
	{
		return driver.findElement(statename);
	}
	
	public WebElement saves()
	{
		return driver.findElement(savebutton);
	}
	public WebElement dropdown()
	{
	WebElement dropdown =driver.findElement(By.xpath("//select[@name='status']"));
	Select dropdown1 =new Select(dropdown);
	dropdown1.selectByIndex(2);
	return dropdown;
	
	}
	
}
