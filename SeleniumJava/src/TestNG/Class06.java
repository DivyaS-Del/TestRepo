package TestNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Class06 {

	@Test
	public void z() {
		Assert.assertTrue(3>12);
		System.out.println("z test method");
	}
	@Test(dependsOnMethods="z")
	public void b() {
		System.out.println("b test method");
}
}