package Jan25;

import org.testng.annotations.Test;

public class priority1 {

	
	@Test(groups = {"sanity"},priority = 2)
	public void test2() {
		System.out.println("Package1: This is Test 1");
	}
	@Test(priority = 3)
	public void test3() {
		System.out.println("Package1: This is Test 2");
	}
	@Test(groups = {"sanity"},priority = 1)
	public void test4() {
		System.out.println("Package1: This is Test 3");
	}

}