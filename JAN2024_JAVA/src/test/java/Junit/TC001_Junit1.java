package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC001_Junit1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("This is Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("This is After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is After");
	}

	@Test
	public void test() {
		System.out.println("This is the test");
	}
	
	@Test
	public void test1() {
		System.out.println("This is the test-1");
	}

}
