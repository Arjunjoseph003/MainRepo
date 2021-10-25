package org.mavenmain;

import java.util.Date;

import org.mavenbass.MavenBassClass;
import org.pojoclass.OrderingAProductPojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrderingAProduct extends MavenBassClass {
	public static OrderingAProductPojoClass oAP;
	
	@BeforeSuite
	public void launchingBrowser() {
		System.out.println("Iniatializing the browser");
		launchBrowser();
	}
	
	@BeforeClass
	public void startingTheTestCaseOrderingAProduct() {
		Date d = new Date();
		System.out.println(d);
	}
	
	
	@Test
	public void orderingAProductTestCase() {
	oAP= new OrderingAProductPojoClass();
	launchurl("http://automationpractice.com/index.php");
	maxBrowser();
	btnClick(oAP.signIn);
	Fill(oAP.loginMail, "arjunJosephs@gmail.com");
	Fill(oAP.loginPassword, "jamesbond003");
	btnClick(oAP.loginButton);
	driver.navigate().back();
	driver.navigate().back();
	btnClick(oAP.getFadedShortSleeve());
	getAttribute(oAP.price, "value");
	btnClick(oAP.getAddToCart());
	String cartMessage = getAttribute(oAP.popupMessage, "value");
	System.out.println(cartMessage);
	closingWindow();
	}
	@AfterClass
	private void complltetionOffirstTestCase() {
		Date d= new Date();
		System.out.println(d);
	}
	
	@AfterSuite
	public void quittedBrowser() {
		
		System.out.println("The product ordered checking is done");

	}
	
}
