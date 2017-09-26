import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting junitstring=new jUnitTesting();
		String result=junitstring.addstring("capstone", "project");
		assertEquals("capstoneproject",result);
		
	}
}
