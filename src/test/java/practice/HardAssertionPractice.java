package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	@Test
	public void hardAssertionPractice() {
		String expectedName = "Robin";
		String actualName = "Robin";
		System.out.println("Hard Assertion starts");
		Assert.assertEquals(actualName, expectedName);
		System.out.println("In the middle of Hard Assertion");
		Assert.assertFalse(actualName.equals(expectedName));
		System.out.println("Hard Assertion ends");
	}
}
