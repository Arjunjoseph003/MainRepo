package org.mavenmain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mavenbass.MavenBassClass;
import org.pojoclass.FlipKartPojoClass;

import junit.framework.Assert;

public class FlipkartFrameWork extends MavenBassClass {
	public static FlipKartPojoClass fp ;

	@BeforeClass
	public static void launchingBrowser() {
		launchBrowser();
		fp=new FlipKartPojoClass();
	}

	@AfterClass
	public static void exitTheTestCase() {
		System.out.println("The given input data is verified");
	}

	@Before
	public void openingFlipkart() {
		launchurl("https://www.flipkart.com/account/login");
		maxBrowser();
	}

	@After
	public void closingFlipkart() {
		closingWindow();

	}
	@Test
	public void flipkartLoginTest() throws Exception {
		Fill(fp.email, excelGettingSpecificCellValue("Sheet1", 1, 1));
		String email = getAttribute(fp.email, "value");
		Assert.assertEquals("Checking the username input data",excelGettingSpecificCellValue("Sheet1", 1, 1) , email);
		Fill(fp.password, excelGettingSpecificCellValue("Sheet1", 1, 2));
		String password = getAttribute(fp.password, "value");
		Assert.assertEquals("Checking the password input data",excelGettingSpecificCellValue("Sheet1", 1, 2) , password);
		btnClick(fp.loginbtn);
		

	}
}
