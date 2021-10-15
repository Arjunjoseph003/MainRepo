package testNG;

import org.testng.annotations.Test;

public class PrioritySetting {
	@Test(priority = 0)
	public void drivingACAr() {
		System.out.println("Driving A Car");

	}

	@Test(priority = 1)
	public void startTheCar() {
		System.out.println("Starting THe car");

	}

	@Test(priority = 6, enabled = true)
	public void putReverseGear() {
		System.out.println("Reverse Gear Engaged");

	}

	@Test(priority = 2)
	public void putFirstGear() {
		System.out.println("Put First Gear");

	}

	@Test(priority = 3)
	public void putSecondGear() {
		System.out.println("Put Second Gear");

	}

	@Test(priority = 4)
	public void putThirdGear() {
		System.out.println("Put Third Gear");

	}

	@Test(priority = 5)
	public void putFourthGear() {
		System.out.println("Put Fourth Gear");

	}
}
