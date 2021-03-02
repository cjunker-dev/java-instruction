package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTests {

	@Test
	public void testA() {
		System.out.println("Test A");
	}

	@Test
	public void testB() {
		System.out.println("Test B");
	}
	
	@Test
	public void testC() {
		System.out.println("Test C");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Before Class Test");
	}
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("After Class Test");
	}
}
