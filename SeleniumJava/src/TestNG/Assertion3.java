package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void testCase4() {
		String actualText = "ab";
		String expText = "ab";
		try {
			Assert.assertEquals(expText, actualText);

		} catch (Error e) {
		}
		System.out.println("Equal Assertion Pass");
	}
}
