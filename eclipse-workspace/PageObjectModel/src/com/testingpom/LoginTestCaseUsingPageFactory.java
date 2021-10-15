package com.testingpom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestCaseUsingPageFactory {
	WebDriver driver;

	@BeforeTest
	public void launchingBrowser() {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void loginTestCaseUsingPageFactory() {

		driver.navigate().to("https://www.phptravels.net/login");

		PageFactory.initElements(driver, LoginPageObjectsUsingPageFactory.class);

		LoginPageObjectsUsingPageFactory.username.sendKeys("admin@phptravels.com");
		LoginPageObjectsUsingPageFactory.password.sendKeys("demoadmin");
		LoginPageObjectsUsingPageFactory.login.click();

		PageFactory.initElements(driver, UpdatingPageObjectsUsingPageFactory.class);
		
	/*	do {
			LoginPageObjectsUsingPageFactory.login.click();
		}while(!UpdatingPageObjectsUsingPageFactory.welcome.getText().contains("Welcome Back"));*/
		UpdatingPageObjectsUsingPageFactory.myProfile.click();
		UpdatingPageObjectsUsingPageFactory.phoneNumber.clear();
		UpdatingPageObjectsUsingPageFactory.phoneNumber.sendKeys("1234567890");
		UpdatingPageObjectsUsingPageFactory.city.clear();
		UpdatingPageObjectsUsingPageFactory.city.sendKeys("Chennai");

	}

	@AfterTest
	public void quittingBrowser() {

		 driver.quit();
	}

}
