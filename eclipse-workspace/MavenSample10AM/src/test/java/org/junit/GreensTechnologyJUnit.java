package org.junit;

import java.util.Date;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojoclass.GreensTechnologyPojoClass;
import org.pojoclass.LoginPojoClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GreensTechnologyJUnit extends MavenBassClass {
	//public static WebDriver driver;
	public static GreensTechnologyPojoClass gt ;

	@Before
	public void startingdate() {
		Date d= new Date();
		System.out.println(d);
	}

	@After
	public void closingDate() {
		Date d = new Date();
		System.out.println(d);
		

	}

	@Test
	public void loginTestCase() {
		maxBrowser();
		scrollDown(gt.getPhoneNumber());
		getText(gt.getPhoneNumber());
		scrollUp(gt.getNo1Text());
		getText(gt.getNo1Text());
		btnClick(gt.getCertifications());
		btnClick(gt.getSeleniumCourseContent());
		getText(gt.getParagraph());
		getText(gt.getSeleniumTraining());
		moveToElement(gt.getCourses());
		moveToElement(gt.getJavaTraining());
		btnClick(gt.getCoreJavaTraining());
		scrollDown(gt.getAnithaReviews());
		getText(gt.getAnithaReviews());
		btnClick(gt.getCareers());
		scrollDown(gt.getCareerPhoneNo());
		getText(gt.getEmailcareers());
		driver.navigate().back();
		btnClick(gt.getTestimonials());
		getText(gt.getGreensTechnologyOMRPhoneNo());
		btnClick(gt.getContactUs());
		getText(gt.getMainBranches());
		scrollDown(gt.getCopyRights());
		getText(gt.getCopyRights());
	}

	@BeforeClass
	public static void launchingBrowser() {
		launchBrowser();
		launchurl("http://www.greenstechnologys.com/");
		// driver= new ChromeDriver();
		gt= new GreensTechnologyPojoClass();
		
		
		
	}

	@AfterClass
	public static void quittingBrowser() {
		closingWindow();
		

	}

}
