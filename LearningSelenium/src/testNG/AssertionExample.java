package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	String value = "Arjun";
    @Test
	public void assertionEquals() {

		/*if (value.equals("Arjun")) {
			System.out.println("name is Equal");
		} else {
			System.out.println("name is not equal");
		}*/
    	Assert.assertEquals(value, "arjun");

	}
}
