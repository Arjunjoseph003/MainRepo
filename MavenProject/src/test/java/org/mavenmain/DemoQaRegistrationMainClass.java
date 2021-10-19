package org.mavenmain;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mavenbass.DemoQAPageDetails;
import org.mavenbass.MavenBassClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pojoclass.DemoQaRegistrationPojoClass;

import junit.framework.Assert;

public class DemoQaRegistrationMainClass extends MavenBassClass {
public static DemoQaRegistrationPojoClass dp;
	@BeforeClass
	public static void launchingBrowser() {
		launchBrowser();
		dp = new DemoQaRegistrationPojoClass();

	}

	@AfterClass
	public static void endOfTestCase() {
		System.out.println("The given Input Data is Checked and Verified");
	}

	@Before
	public void opeinigDemoQA() {
		launchurl("https://demoqa.com/automation-practice-form");
		maxBrowser();
	}

	@After
	public void closingDemoQA() {
		closingWindow();
	}

	@Test
	public void checkingTheInputDataOfDemoQaForm() throws Exception {
		Fill(dp.getFirstName(), excelGettingSpecificCellValue("Sheet1", 1, 1));
		String firstname = getAttribute(dp.getFirstName(), "value");
		Assert.assertEquals(excelGettingSpecificCellValue("Sheet1", 1, 1), firstname);
		//Assert.assertEquals("checking the frist name inputdata", excelGettingSpecificCellValue("Sheet1", 1, 1), firstname);
		Fill(dp.getLastName(), excelGettingSpecificCellValue("Sheet1", 1, 2));
		String lastname = getAttribute(dp.getLastName(), "value");
		Assert.assertEquals(excelGettingSpecificCellValue("Sheet1", 1, 2), lastname);
		Fill(dp.getUserMail(), excelGettingSpecificCellValue("Sheet1", 1, 3));
		String userMail = getAttribute(dp.getUserMail(), "value");
		Assert.assertEquals(excelGettingSpecificCellValue("Sheet1", 1, 3), userMail);
		btnClick(dp.getGender());
		Fill(dp.getMobileNumber(), excelGettingSpecificCellValue("Sheet1", 1, 4));
		String mobileNumber = getAttribute(dp.getMobileNumber(), "value");
		Assert.assertEquals(excelGettingSpecificCellValue("Sheet1", 1, 4), mobileNumber);
		btnClick(dp.getAdPLus());
		dp.robotClassSelectALL(dp.getdOB());
		implicitWait(10);
		Fill(dp.getdOB(), excelGettingSpecificCellValue("Sheet1", 1, 5));
		String dOB = getAttribute(dp.getdOB(), "value");
		Assert.assertEquals(excelGettingSpecificCellValue("Sheet1", 1, 5), dOB);
		implicitWait(10);
		JavascriptExecutor js = javaScript();js.executeScript("arguments[0].click()", dp.getSubjects());
		js.executeScript("arguments[0].setAttribute('value','En')", dp.getSubjects());
		implicitWait(10);
		dp.getAttribute(dp.getSubjects(), "value");
		btnClick(dp.getHobbies());
		Fill(dp.getAddress(), excelGettingSpecificCellValue("Sheet1", 1, 7));
		String address = getAttribute(dp.getAddress(), "value");
		Assert.assertEquals(excelGettingSpecificCellValue("Sheet1", 1, 7), address);
		btnClick(dp.getState());btnClick(dp.getUttarPradesh());
		btnClick(dp.getCity());btnClick(dp.getLucknow());
		btnClick(dp.getSubmit());		

	}

	
	}


