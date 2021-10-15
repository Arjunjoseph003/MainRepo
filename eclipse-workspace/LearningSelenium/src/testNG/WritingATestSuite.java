package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WritingATestSuite {
	WebDriver driver;
	Long startTime, endTime, totalTime;

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void openGoogle() {

		driver.get("http://WWW.google.co.in");

	}

	@Test
	public void openBing() {

		driver.get("http://WWW.bing.com");

	}

	@Test
	public void openYahoo() {
		driver.get("http://WWW.yahoo.com");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();

		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println(totalTime);

	}

}
