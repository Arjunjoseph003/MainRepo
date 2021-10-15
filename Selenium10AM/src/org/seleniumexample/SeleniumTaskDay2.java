package org.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskDay2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Arjun");

		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastName.sendKeys("Joseph");

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		email.sendKeys("abc@gmail.com");

		WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
		phoneNumber.sendKeys("7894561231");

		WebElement subjects = driver
				.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']/child::div[1]"));
		subjects.sendKeys("Selenium Automation Testing");

		WebElement address = driver.findElement(By.xpath("//textarea"));
		address.sendKeys("abc ,xyz colony lmn nagar ch=600078");

		// driver.quit();

	}

}
