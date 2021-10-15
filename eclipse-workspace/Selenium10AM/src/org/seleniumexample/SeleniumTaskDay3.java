package org.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskDay3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=google_search_sok_food_na_narm_order_web_m_web_clubbedcities_neev_brand_newuser_v1_nonfocus_brand_exact&gclid=EAIaIQobChMIz5_y7IXT8gIVyZhmAh0SHAoTEAAYASAAEgKEDvD_BwE");
		driver.manage().window().maximize();

		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signUp.click();

		WebElement mobile = driver.findElement(By.xpath("//input[@name='mobile']"));
		mobile.sendKeys("9874561223");
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys("Arjun");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("abc@gmail.com");
		
		WebElement passwrd = driver.findElement(By.xpath("//input[@name='password']"));
		passwrd.sendKeys("jamesbond004");
		
		WebElement continueBtn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		continueBtn.click();

		//driver.quit();

	}

}
