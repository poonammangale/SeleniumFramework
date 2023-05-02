package testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObject;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constant;

public class VerifyLogin extends BaseClass {
	@Test
	public void login() throws IOException {
		
		
		LoginPageObject LPO=new LoginPageObject(driver);
		LPO.EnterUsername().sendKeys(Constant.username);
		LPO.EnterPassword().sendKeys(Constant.password);
		LPO.ClickonLogin().click();
		
		
		String actualText=LPO.errorMessage().getText();
        String expctedText=Constant.loginExpected;
        CommonMethods.HandleAssertion(expctedText, actualText, "error message is not vaid");
	}
		
	
	
}
