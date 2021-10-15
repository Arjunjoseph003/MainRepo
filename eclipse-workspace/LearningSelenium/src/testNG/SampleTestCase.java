package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	@Test(priority = 0)
	private void firstTestCase() {
		System.out.println("The first Test case ");

	}
	
	@Test(priority = 1)
	private void SecondTestCase() {
		System.out.println("The Second Test case ");

	}
	
	@Test(priority = 2)
	private void ThirdTestCase() {
		System.out.println("The third Test case ");

	}
	
	@Test(priority = 3)
	private void fourthTestCase() {
		System.out.println("The fourth Test case ");

	}

}
