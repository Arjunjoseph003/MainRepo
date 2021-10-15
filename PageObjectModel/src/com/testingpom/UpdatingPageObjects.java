package com.testingpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdatingPageObjects {
	
	public static WebElement myProfile(WebDriver driver ) {
		return driver.findElement(By.xpath("//li[@class='page-active']/following::li[3]"));

	}    
	
	public static WebElement phoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='phone']"));

	}
	
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='city']"));

	}
	
}
