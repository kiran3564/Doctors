package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserinitialize() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\doctors\\src\\main\\java\\data.properties");
		
		prop.load(fis);												
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\doctors\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
				//execute in chrome driver
			
		}
		else if (browserName.equals("firefox"))
			
		{
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\doctors\\drivers\\geckodriver.exe");
			 driver= new FirefoxDriver();
			//firefox code
		}
	
	
	return driver;
	}
}
