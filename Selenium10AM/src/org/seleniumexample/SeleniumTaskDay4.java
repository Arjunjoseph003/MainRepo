package org.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskDay4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='What is on your mind today?']"));
		searchBox.sendKeys("shoes men");

		WebElement searchBtn = driver.findElement(By.xpath("//a[text()='Search']"));
		searchBtn.click();

		WebElement firstProduct = driver.findElement(By.xpath("//img[@id='det_img_151717297']"));
		firstProduct.click();
		// Thread.sleep(3000);

		/*
		 * WebElement password =
		 * driver.findElement(By.xpath("//input[@placeholder='Password']"));
		 * password.sendKeys("abc1234"); String attribute =
		 * password.getAttribute("value");
		 * 
		 * String text = email.getAttribute("value");
		 * System.out.println("The Entered Username is: " + text);
		 * System.out.println("The Entered password is: " + attribute);
		 * 
		 * driver.quit();
		 */

	}

}
