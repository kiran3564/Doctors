package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {

	public WebDriver driver;
	
	By title = By.xpath("//h2[@class='font-bold']");
	
	


public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}




public WebElement title()
{
	return driver.findElement(title);
}

}