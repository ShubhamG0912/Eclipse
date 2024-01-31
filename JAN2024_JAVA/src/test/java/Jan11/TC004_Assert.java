package Jan11;

import org.junit.Ignore;
import org.junit.Test;

import Jan5.Person;

public class TC004_Assert {
	
	@Ignore
	@Test
	
	public void t1() {
		
		Person obj = new Person("Hello","world");
		System.out.println(obj.getName());
		
	}

}
