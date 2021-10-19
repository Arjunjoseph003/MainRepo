package org.mavenmain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mavenbass.MavenBassClass;
import org.pojoclass.LoginPojoClass;

public class FacebookFrameWork extends MavenBassClass {
	public static LoginPojoClass lo;

	@BeforeClass
	public static void launchingBrowser() {
		launchBrowser();
		lo = new LoginPojoClass();
	}

	@AfterClass
	public static void exitBrowser() {
		System.out.println("InputData verified and checked");
	}

	@Before
	public void openingFacebook() {
		launchurl("https://www.facebook.com/");
		maxBrowser();
		
	}

	@After
	public void closingTheFacebook() {
		closingWindow();

	}
	@Test
	public void checkingTheInputData() throws Exception {
		Fill(lo.getTextMail(), excelGettingSpecificCellValue("Sheet1", 1, 1));
		String email = getAttribute(lo.getTextMail(), "value");
		Assert.assertTrue("Checking the username input data", email.contains("arjun"));
		Fill(lo.getTextpass(), excelGettingSpecificCellValue("Sheet1", 1, 2));
		String pass = getAttribute(lo.getTextpass(), "value");
		Assert.assertTrue("Checking the password input data",pass.contains("arjun") );
		btnClick(lo.getLoginBtn());

	}

}
