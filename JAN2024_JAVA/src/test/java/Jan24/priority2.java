package Jan24;

import org.testng.annotations.Test;

public class priority2 {
	public void test1() {
		System.out.println("Package2 : Test1");
	}
	
	
	@Test(groups = {"sanity"},priority = 2)
	public void test2() {
		System.out.println("Package2: Test2");
	}
	@Test(priority = 3)
	public void test3() {
		System.out.println("Package2: Test3");
	}
	@Test(groups = {"sanity"},priority = 1)
	public void test4() {
		System.out.println("Package2:  Test4");
	}

}
