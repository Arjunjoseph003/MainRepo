package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreHomePojoClass extends MavenBassClass {
	
	public MyStoreHomePojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@class='img-responsive']")
	public static WebElement image1;

	@FindBy(xpath="//a[@class='login']")
	public static WebElement signIn;
	@FindBy(xpath="//a[text()='Contact us']")
	public static WebElement contactUs;
	
	@FindBy(xpath="//span[text()='Call us now: ']")
	public static WebElement callUsNow;
	
	
	
}
