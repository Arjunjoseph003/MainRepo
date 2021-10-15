package com.testingpom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//user@phptravels.com
//demouser

public class Logintestcase {
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
		
	@Test
	public void loginTestScenario()  {
		//driver=new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		
		LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser"+Keys.ENTER);
		
		
		UpdatingPageObjects.myProfile(driver).click();
		
		UpdatingPageObjects.phoneNumber(driver).clear();
		UpdatingPageObjects.phoneNumber(driver).sendKeys("1234567890");
		
		UpdatingPageObjects.city(driver).clear();
		UpdatingPageObjects.city(driver).sendKeys("Chennai");
	
			}
	@AfterTest
	public void afterTest() {
		driver.quit();

	}
}
