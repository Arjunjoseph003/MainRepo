package org.mavenmain;

import org.mavenbass.MavenBassClass;
import org.pojoclass.HomePageMyStorePojoClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CheckingMyStoreHomePage extends MavenBassClass {
	HomePageMyStorePojoClass hms;
     @BeforeSuite 
	private void launchingBrowser() {
		launchBrowser();
		getCurrentUrl();
		getPageTitle();
	}

	@BeforeClass
	private void openingMystoreHomePage() {
		launchurl("http://automationpractice.com/");
		maxBrowser();
		getCurrentUrl();
		getPageTitle();
		hms = new HomePageMyStorePojoClass();
	}
	
	@Test
	private void checkingHomePage() {
		launchurl("http://automationpractice.com/");
		hms.image1.isDisplayed();

	}
	
	

}
