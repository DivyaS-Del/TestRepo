package TestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class01 {
	@Test
	public void a2() {
		System.out.println("hi a1 method");
	}
	@BeforeTest
	public void b() {
		System.out.println("hello b method");
	}
	@BeforeSuite
	public void c() {
		System.out.println("hello c method");
	}
	@AfterMethod
	public void d() {
		System.out.println("hello d method");
	}
	@BeforeClass
	public void e() {
		System.out.println("hello e method");
	}
	@AfterTest
	public void f() {
		System.out.println("hello f method");
	}
	@AfterClass
	public void g() {
		System.out.println("hello g method");
	}
	
	@BeforeMethod
	 public void h() {
		System.out.println("hello h method");
}    
	@AfterSuite
		public void i() {
	System.out.println("hello i method");
	}
	
	@Test
	public void a1() {
		System.out.println("Hello a1 method");
	}
	public static void main(String []args) {
		System.out.println("Hello main method");
	}
}