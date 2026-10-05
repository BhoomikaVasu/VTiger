package practice;

import org.testng.annotations.Test;

public class MavenParameters {
	@Test
	public void Sample() {
		String value=System.getProperty("name");
		System.out.println(value);
	}

}
