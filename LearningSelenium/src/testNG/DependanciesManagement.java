package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("Completed High School");

	}

	@Test(dependsOnMethods = "highSchool")
	public void highSecondarySchool() {
		System.out.println("Completed HighSecondary School");

	}

	@Test(dependsOnMethods = "highSecondarySchool")
	public void engineering() {
		System.out.println("Getting Admisssions For Engineering");

	}
}
