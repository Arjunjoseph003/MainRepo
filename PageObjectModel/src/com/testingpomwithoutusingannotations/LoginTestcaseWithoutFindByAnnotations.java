package com.testingpomwithoutusingannotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestcaseWithoutFindByAnnotations {

	public static WebElement txtUsername, txtPassword, btnLogin;

	@Test
	public void loginTestWithoutFindBy() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		PageFactory.initElements(driver, LoginTestcaseWithoutFindByAnnotations.class);

		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();

	}

}
