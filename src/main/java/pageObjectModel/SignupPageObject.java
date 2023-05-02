package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public WebDriver driver;

	By FirstName=By.xpath("//input[@name='UserFirstName']");
	By LastName=By.xpath("//input[@name='UserLastName']");
	By WorkEmail=By.xpath("//input[@name='UserEmail']");
	By Company=By.xpath("//input[@name='CompanyName']");
	By phone=By.xpath("//input[@name='UserPhone']");
	By employees=By.xpath("//select[@name='CompanyEmployees']");
	
	public SignupPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement EnterFirstname() {
		return driver.findElement(FirstName);
	}
	public WebElement Enterlastname() {
		return driver.findElement(LastName);
	}
	public WebElement EnterWorkEmail() {
		return driver.findElement(WorkEmail);
	}
	public WebElement EnterCompanyName() {
		return driver.findElement(Company);
	}
	public WebElement EnterPhoneNo() {
		return driver.findElement(phone);
	}
	public WebElement SelectEmployees() {
		return driver.findElement(employees);
	}

}
