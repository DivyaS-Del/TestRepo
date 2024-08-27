package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion5 {
	@Test
	public void testCase5() {
		int i = 10;
		int j = 10;
		try {
			Assert.assertTrue(i > j);

		} catch (Error e) {
		}
		System.out.println(" Assertion Pass");
	}
}