package com.extentreportsframework;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportFrameWorkExample {
	WebDriver driver;
	ExtentReports extentreport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testCase;

	@BeforeTest
	public void launchingBrowser() {
		extentreport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter(
				"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\ExtentReporter.html");
		extentreport.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openFaceBook() throws IOException {
		testCase = extentreport.createTest("Verifying Login Scenario of FaceBook");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\facebookusername.png");
		File dest1 = new File(
				"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\facebookpassword.png");
		driver.navigate().to("https://en-gb.facebook.com/");
		testCase.log(Status.INFO, "entering the username credential");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);
		testCase.addScreenCaptureFromPath(
				"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\facebokusername.png");
		testCase.log(Status.INFO, "entering the password credential");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcdef");
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, dest1);
		testCase.addScreenCaptureFromPath(
				"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\facebookpassword.png");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

	@Test
	public void openInstagram() throws IOException, InterruptedException {
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		testCase=extentreport.createTest("Verifying the Instagram Credential");
		File dest = new File("C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\instausername.png");
		File dest1 = new File("C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\instapassword.png");
		driver.get("https://www.instagram.com/accounts/login/");
		testCase.log(Status.INFO, "entering the username credential");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);
		testCase.addScreenCaptureFromPath(
				"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\instausername.png");
		testCase.log(Status.INFO, "entering the password credential");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdef");
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, dest1);
		testCase.addScreenCaptureFromPath(
				"C:\\Users\\Arjun\\eclipse-workspace\\LearningSelenium\\Screenshot\\instapassword.png");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		driver.close();

	}

	@AfterTest
	public void quittingBrowser() {
		driver.quit();
		extentreport.flush();

	}

}
