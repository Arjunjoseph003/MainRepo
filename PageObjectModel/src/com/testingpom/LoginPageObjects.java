package com.testingpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public static WebElement username (WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='email'][@name='email']"));
           
	}
	
	public static  WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password'][@name='password']"));

	}
	
}
