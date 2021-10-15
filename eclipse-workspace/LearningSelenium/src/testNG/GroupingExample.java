package testNG;

import org.testng.annotations.Test;

// We have three types of methods to test within

//that we need to run only two methods 
//so we are using grouping concepts
// three methods are Dell , Havlett Packard , Lenovo

public class GroupingExample {
    @Test(groups = {"dell"})
	public void dell1() {
		System.out.println("Dell1 Method is testing");
	}
    @Test(groups = {"dell"})
	public void dell2() {
		System.out.println("Dell2 Method is testing");

	}
    @Test(groups = {"HP"})
	public void havlettPackard1() {
		System.out.println("Havlet Packard Method is testing");
	}
    @Test(groups = {"HP"})
	public void havlettPackard2() {
		System.out.println("Havlett Packard Method is testing");
	}
    @Test(groups = {"lenovo"})
	public void lenovo1() {
		System.out.println("Lenovo methd is testing");
	}
    @Test(groups = {"lenovo"})
	public void lenovo2() {
		System.out.println("Lenovo Method is testing");
	}
}
