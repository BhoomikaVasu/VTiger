package practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestPractice {

	@Test(priority = 1)
	public void wakeUp() {
//		Assert.fail();
		System.out.println("Wake up early in the morning");
	}

	@Test(priority = -2, dependsOnMethods = {"wakeUp"})
	public void eatFood() {
		System.out.println("Wow! this dosa is very tasty");
	}

//	@Ignore
	@Test(priority = 3/*, enabled = false*/)
	public void sleepWell() {
		System.out.println("Good Night Sweet dreams");
	}
	
}
