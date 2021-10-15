package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaRegistrationPojoClass extends MavenBassClass {
	
	public DemoQaRegistrationPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastName;
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement userMail;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement mobileNumber;
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	private WebElement dOB;
	@FindBy(xpath="//img[@title='Ad.Plus Advertising']")
	private WebElement adPLus;
	@FindBy(xpath="//div[@id='subjectsContainer']")
	private WebElement subjects;
	@FindBy(xpath="//div[text()='English']")
	private WebElement english;
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement hobbies;
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement address;
	@FindBy(xpath="//div[@class=' css-yk16xz-control']")
	private WebElement state;
	@FindBy(xpath="//div[text()='Uttar Pradesh']")
	private WebElement uttarPradesh;
	@FindBy(xpath="//div[@id='city']")
	private WebElement city;
	@FindBy(xpath="//div[text()='Lucknow']")
	private WebElement lucknow;
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submit;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getUserMail() {
		return userMail;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getdOB() {
		return dOB;
	}

	public WebElement getSubjects() {
		return subjects;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAdPLus() {
		return adPLus;
	}

	public WebElement getUttarPradesh() {
		return uttarPradesh;
	}

	public WebElement getLucknow() {
		return lucknow;
	}

	public WebElement getEnglish() {
		return english;
	}

	public WebElement getSubmit() {
		return submit;
	}
	





	

}
