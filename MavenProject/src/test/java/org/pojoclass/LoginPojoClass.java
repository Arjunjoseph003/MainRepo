package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends MavenBassClass {

	public LoginPojoClass() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@id='email']")
	private WebElement textMail;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement textpass;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;

	public WebElement getTextMail() {
		return textMail;
	}

	public WebElement getTextpass() {
		return textpass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
