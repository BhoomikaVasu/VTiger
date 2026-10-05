package practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

	@Test
	public void softAssertionPractice() {
		String expectedCity = "Bangalore";
		String actualCity = "Delhi";
		System.out.println("Soft Assertion starts");
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualCity.equals(expectedCity));
		System.out.println("In the middle of Soft Assertion");
		s.assertNotEquals(actualCity, expectedCity);
		s.assertEquals(actualCity, expectedCity);
		System.out.println("Soft Assertion ends");
		s.assertAll();
	}
}
