package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	 public Properties p;

	public void initializeDriver() throws IOException {
		
		// to access the data file 
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\.metadata\\NewProjectSeleniumTestNG\\src\\main\\java\\resources\\data.properties");
		
		
		//to read the file
		 p=new Properties();
		p.load(fis);
		String browserName=p.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
	}
		else if(browserName.equalsIgnoreCase("eddge")) {
			 driver=new EdgeDriver();
		}
		else {
			System.out.println("please enter correct browser name");
		}
	}
	@BeforeMethod
	 public void launchBrowser() throws IOException {
	  
	  initializeDriver() ;
	  
	  String url=p.getProperty("url");
	  driver.get(url);
	  
	 }
	 
	 
	 @AfterMethod
	 public void quitBrowser() throws IOException {
	  
	    driver.quit();
	  
	 }
}
