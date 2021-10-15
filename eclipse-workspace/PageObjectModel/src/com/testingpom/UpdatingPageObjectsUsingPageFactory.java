package com.testingpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatingPageObjectsUsingPageFactory {
	
	@FindBy(xpath="//li[@class='page-active']/following::li[3]")
	public static WebElement myProfile;
	
//	@FindBy(xpath="//*[text()='Welcome Back']")
//	public static WebElement welcome;
	
	@FindBy(xpath="//input[@name='phone']")
	public static WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='city']")
	public static WebElement city;

}
