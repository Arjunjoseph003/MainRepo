package org.mavenmain;

import org.mavenbass.MavenBassClass;
import org.pojoclass.HomePageMyStorePojoClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CheckingMyStoreHomePage extends MavenBassClass {
	HomePageMyStorePojoClass hms;
     @BeforeSuite 
	private void launchingBrowser() {
		launchBrowser();
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
		System.out.println(hms.image1.isDisplayed());
		System.out.println(hms.contactUs.isDisplayed());
		System.out.println(hms.callUsNow.isDisplayed());
		System.out.println(hms.logo.isDisplayed());
		System.out.println(hms.search.isDisplayed());
		System.out.println(hms.searchBtn.isDisplayed());
		System.out.println(hms.shoppingCart.isDisplayed());
		System.out.println(hms.women.isDisplayed());
		System.out.println(hms.dresses.isDisplayed());
		System.out.println(hms.tshirts.isDisplayed());
		System.out.println(hms.itemImg1.isDisplayed());
		System.out.println(hms.itemImg2.isDisplayed());
		System.out.println(hms.img1.isDisplayed());
		System.out.println(hms.img2.isDisplayed());
		System.out.println(hms.img3.isDisplayed());
		System.out.println(hms.img4.isDisplayed());
		System.out.println(hms.img5.isDisplayed());
		System.out.println(hms.img6.isDisplayed());
		System.out.println(hms.img7.isDisplayed());
		System.out.println(hms.popular.isDisplayed());
		System.out.println(hms.bestSellers.isDisplayed());
		System.out.println(hms.followUsFacebook.isDisplayed());
		System.out.println(hms.fanbox.isDisplayed());
		System.out.println(hms.truckIcon.isDisplayed());
		System.out.println(hms.comeVisitUs.isDisplayed());
		System.out.println(hms.visitText.isDisplayed());
		System.out.println(hms.phoneIcon.isDisplayed());
		System.out.println(hms.callltext.isDisplayed());
		System.out.println(hms.seleniumFramework.isDisplayed());
		System.out.println(hms.creditIcon.isDisplayed());
		System.out.println(hms.howToPayDues.isDisplayed());
		System.out.println(hms.HowToPayDuesText.isDisplayed());
		System.out.println(hms.customBlock.isDisplayed());
		System.out.println(hms.customBlockOfText.isDisplayed());
		System.out.println(hms.SeleniumText.isDisplayed());
		System.out.println(hms.Subsidiary.isDisplayed());
		System.out.println(hms.AutomationPracticeWebsite.isDisplayed());
		System.out.println(hms.PracticeSelenium.isDisplayed());
		System.out.println(hms.PracticeSeleniumText.isDisplayed());
		System.out.println(hms.Newsletter.isDisplayed());
		System.out.println(hms.newsLetterMail.isDisplayed());
		System.out.println(hms.submitNewsletter.isDisplayed());
		System.out.println(hms.followUs.isDisplayed());
		System.out.println(hms.facebookIcon.isDisplayed());
		System.out.println(hms.twitterIcon.isDisplayed());
		System.out.println(hms.youtubeIcon.isDisplayed());
		System.out.println(hms.googlePlusIcon.isDisplayed());
		System.out.println(hms.Categories.isDisplayed());
		System.out.println(hms.womenCategory.isDisplayed());
		System.out.println(hms.Information.isDisplayed());
		//System.out.println(hms.items.isDisplayed());
		closingWindow();
	}
	
	@AfterSuite
	private void ensuringTheCheckingHomePage() {
		System.out.println("All the Elements in Home page is validated");

	}
	
	

}
