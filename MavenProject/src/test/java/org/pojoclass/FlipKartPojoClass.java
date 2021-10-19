package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPojoClass extends MavenBassClass {
	public  FlipKartPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	public static WebElement email;
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginbtn;
	
}
