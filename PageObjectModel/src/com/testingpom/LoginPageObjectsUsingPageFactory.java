package com.testingpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectsUsingPageFactory {

	@FindBy(xpath = "//input[@type='email'][@name='email']")
	public static WebElement username;

	@FindBy(xpath = "//input[@type='password'][@name='password']")
	public static WebElement password;
	
	@FindBy(xpath="//div[@class='btn-box pt-3 pb-4']/following::span[@class='ladda-spinner']")
	public static WebElement login;

	
	

}
