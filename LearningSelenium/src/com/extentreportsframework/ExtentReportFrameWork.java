package com.extentreportsframework;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportFrameWork {
	WebDriver driver;
	ExtentReports extentreports;
	ExtentHtmlReporter htmlreport;
	ExtentTest testCase;

	@BeforeTest
	public void launchingBrowser() {
		extentreports = new ExtentReports();
		htmlreport = new ExtentHtmlReporter("ExtentReport.html");
		extentreports.attachReporter(htmlreport);
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openGoogle() throws IOException {
		testCase = extentreports.createTest("Verify google Title");
		testCase.log(Status.INFO, "Navigating to google");
		driver.navigate().to("http://WWW.google.co.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		testCase.log(Status.INFO, "Actual title :" + title);
		testCase.log(Status.INFO, "Expected title :" + "Google");
		testCase.log(Status.INFO, "Verification of google Actual and Expected Title");
		if (title.contains("Google")) {
			testCase.log(Status.PASS, "Actual and expected title are equal");
		} else {
			testCase.log(Status.FAIL, "Actual and expected title are not equal");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\google.png");
			FileUtils.copyFile(src, dest);
			testCase.addScreenCaptureFromPath(
					"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\google.png");
		}

	}

	@Test
	public void openBing() throws IOException {
		testCase = extentreports.createTest("Verify bing Title");
		testCase.log(Status.INFO, "Navigating to bing");
		driver.navigate().to("https://www.bing.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		testCase.log(Status.INFO, "Actual title :" + title);
		testCase.log(Status.INFO, "Expected title :" + "bing");
		testCase.log(Status.INFO, "Verification of google Actual and Expected Title");
		if (title.contains("Bing")) {
			testCase.log(Status.PASS, "Actual and expected title are equal");
			;
		} else {
			testCase.log(Status.FAIL, "Actual and expected title are not equal");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\bing.png");
			FileUtils.copyFile(src, dest);
			testCase.addScreenCaptureFromPath(
					"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\bing.png");
		}
	}

	@Test
	public void openWikipedia() throws IOException {
		testCase = extentreports.createTest("Verify wikipedia Title");
		testCase.log(Status.INFO, "Navigating to wikipedia");
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		testCase.log(Status.INFO, "Actual title :" + title);
		testCase.log(Status.INFO, "Expected title :" + "Wikipedia");
		testCase.log(Status.INFO, "Verification of google Actual and Expected Title");
		if (title.contains("Wikipedia")) {
			testCase.log(Status.PASS, "Actual and expected title are equal");
			;
		} else {
			testCase.log(Status.FAIL, "Actual and expected title are not equal");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\wikipedia.png");
			FileUtils.copyFile(src, dest);
			testCase.addScreenCaptureFromPath(
					"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\wikipedia.png");
		}
	}

	@AfterTest
	public void closingTheBrowser() {
		driver.quit();
		extentreports.flush();

	}

}
