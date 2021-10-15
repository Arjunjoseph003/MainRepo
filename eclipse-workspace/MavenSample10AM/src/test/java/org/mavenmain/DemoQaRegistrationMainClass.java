package org.mavenmain;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.mavenbass.DemoQAPageDetails;
import org.mavenbass.MavenBassClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pojoclass.DemoQaRegistrationPojoClass;

public class DemoQaRegistrationMainClass extends MavenBassClass {

	public static void main(String[] args) throws Exception {

		launchBrowser();
		launchurl("https://demoqa.com/automation-practice-form");
		maxBrowser();
		DemoQaRegistrationPojoClass dp = new DemoQaRegistrationPojoClass();
		Fill(dp.getFirstName(), excelGettingSpecificCellValue("Sheet1", 1, 1));
		Fill(dp.getLastName(), excelGettingSpecificCellValue("Sheet1", 1, 2));
		Fill(dp.getUserMail(), excelGettingSpecificCellValue("Sheet1", 1, 3));
		btnClick(dp.getGender());
		Fill(dp.getMobileNumber(), excelGettingSpecificCellValue("Sheet1", 1, 4));
		dp.robotClassSelectALL(dp.getdOB());
		btnClick(dp.getAdPLus());
		implicitWait(10);
		Fill(dp.getdOB(), excelGettingSpecificCellValue("Sheet1", 1, 5));
		implicitWait(10);
		JavascriptExecutor js = javaScript();js.executeScript("arguments[0].click()", dp.getSubjects());
		js.executeScript("arguments[0].setAttribute('value','En')", dp.getSubjects());
		implicitWait(10);
		
		
		dp.getAttribute(dp.getSubjects(), "value");
		btnClick(dp.getHobbies());
		Fill(dp.getAddress(), excelGettingSpecificCellValue("Sheet1", 1, 7));
		btnClick(dp.getState());btnClick(dp.getUttarPradesh());
		btnClick(dp.getCity());btnClick(dp.getLucknow());
		btnClick(dp.getSubmit());
		
	}

}
