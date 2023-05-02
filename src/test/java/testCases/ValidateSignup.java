package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObject;
import pageObjectModel.SignupPageObject;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;

public class ValidateSignup extends BaseClass{
	
	@Test
	public void signup() throws IOException, InterruptedException {
		
		
		LoginPageObject LPO=new LoginPageObject(driver);
		LPO.ClickOntryForFree().click();
		Thread.sleep(2000);
		SignupPageObject SPO=new SignupPageObject(driver);
		SPO.EnterFirstname().sendKeys(Constant.firstName);
		SPO.Enterlastname().sendKeys(Constant.LastName);
		SPO.EnterPhoneNo().sendKeys(Constant.phone);
		SPO.EnterCompanyName().sendKeys(Constant.Company);
		SPO.EnterWorkEmail().sendKeys(Constant.workEmail);
		
		
		CommonMethods.Dropdowns(SPO.SelectEmployees(), 1);
	}

}
