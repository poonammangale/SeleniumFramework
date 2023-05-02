package resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	
	
	public static void Dropdowns(WebElement a, int index) {
		Select s=new Select(a);
		s.selectByIndex(index);
	}
	
	public static void HandleAssertion(String expected, String actual, String message) {
		SoftAssert assertion=new SoftAssert();
		  assertion.assertEquals(expected, actual,message);
		        assertion.assertAll();
	}

}
