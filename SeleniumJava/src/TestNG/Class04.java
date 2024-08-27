package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Class04 {

	// @Test -1st way
	public void a() {
		System.out.println(" a  test method");
	}

	// 2nd way-widely used in market
	@Test(enabled = false)
	public void b() {
		System.out.println(" b  test method");

	}

	@Test(enabled = true)
	public void c() {
		System.out.println(" c  test method");
	}

	// Invocationcount= 0 times - 3rd way
	@Test(invocationCount = 0)
	public void d() {
		System.out.println(" d test method");
	}

	// Correct Way-Not Recomended
	@Test
	public void f() {
		System.out.println(" d test method");
		throw new SkipException("Skipping f test method");
	}
}