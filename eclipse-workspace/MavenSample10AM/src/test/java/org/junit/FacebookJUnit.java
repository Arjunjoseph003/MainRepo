package org.junit;

import org.mavenbass.MavenBassClass;
import org.pojoclass.LoginPojoClass;

public class FacebookJUnit extends MavenBassClass {
	public static LoginPojoClass lo;

	@BeforeClass
	public static void launchingBrowser() {
		launchBrowser();
		launchurl("https://en-gb.facebook.com/");
		maxBrowser();
		lo = new LoginPojoClass();
	}

	@AfterClass
	public static void closingTheBrowser() {
		closingWindow();
	}

	@Before
	public void openingFacebook() {
		System.out.println("Verifying the LoginPage Credentials");
	}

	@After
	public void verifiedFacebook() {
		System.out.println("Login Page Verified Successfully");

	}

	@Test
	public void verifyingFacebookCredentials() throws Exception {
		Fill(lo.getTextMail(), excelGettingSpecificCellValue("Sheet1", 1, 1));
		String email = getAttribute(lo.getTextMail(), "value");
		if (excelGettingSpecificCellValue("Sheet1", 1, 1).equals(email)) {
			System.out.println("The given username Input is correct");
		} else {
			System.out.println("The given UserName input is not correct");
		}
		Fill(lo.getTextpass(), excelGettingSpecificCellValue("Sheet1", 1, 2));
		String password = getAttribute(lo.getTextpass(), "value");
		if (excelGettingSpecificCellValue("Sheet1", 1, 2).equals(password)) {
			System.out.println("The given password Input is correct");
		} else {
			System.out.println("The given password input is not correct");
		}

		btnClick(lo.getLoginBtn());

	}

}
