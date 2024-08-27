package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion2 {
	
	@Test
	public void testCse2() {
		String actualText="ab";
		String expText="ab";
		
		int a=10;
		int b=20;
		
		//equal assertion
		Assert.assertEquals(actualText, expText,"Actual and expected are not matching");
		//Assert.assertEquals(actualText,expText,"Actual and expected are not matching");
		System.out.println("Equal assertion pass");
		
		// failed assertion
		
		Assert.assertFalse(a > b,"a is greater than b");
		System.out.println("false assertion verified");
		
		// true asserrtion
		
		Assert.assertTrue(a > b,"a is lesser than b");
		// assertion failed , execution stop here
		// further line of code will not execute
		System.out.println("true assertion verified");

	}
	@Test
	public void testCase3() {
		//assertion is written in testcase2()method
		//hence the scope of assertion will be limited to testcase2() method only.
		System.out.println("Hello testcase3() method");
	}

}
