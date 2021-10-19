package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreCreateAccountPojoClass extends MavenBassClass {

	public MyStoreCreateAccountPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	public static WebElement signIn;
	@FindBy(xpath = "//input[@id='email_create']")
	public static WebElement email;
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	public static WebElement createAnAcc;
	@FindBy(xpath = "//input[@id='id_gender1']")
	public static WebElement Mr;
	@FindBy(xpath = "//input[@id='id_gender2']")
	public static WebElement Mrs;
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public static WebElement firstName;
	@FindBy(xpath = "//input[@id='customer_lastname']")
	public static WebElement lastName;
	@FindBy(xpath = "//input[@id='passwd']")
	public static WebElement password;
	@FindBy(xpath = "//select[@id='days']")
	public static WebElement days;
	@FindBy(xpath = "//select[@id='months']")
	public static WebElement months;
	@FindBy(xpath = "//select[@id='years']")
	public static WebElement years;
	@FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
	public static WebElement notify1;
	@FindBy(xpath = "//label[text()='Receive special offers from our partners!']")
	public static WebElement notify2;
	@FindBy(xpath = "//input[@id='firstname']")
	public static WebElement firstName1;
	@FindBy(xpath = "//input[@id='lastname']")
	public static WebElement lastName1;
	@FindBy(xpath = "//input[@id='company']")
	public static WebElement company;
	@FindBy(xpath = "//input[@id='address1']")
	public static WebElement address1;
	@FindBy(xpath = "//input[@id='address2']")
	public static WebElement address2;
	@FindBy(xpath = "//input[@id='city']")
	public static WebElement city;
	@FindBy(xpath = "//select[@id='id_state']")
	public static WebElement state;
	@FindBy(xpath = "//input[@id='postcode']")
	public static WebElement postCode;
	@FindBy(xpath = "//select[@id='id_country']")
	public static WebElement country;
	@FindBy(xpath = "//textarea[@id='other']")
	public static WebElement additionalInfo;
	@FindBy(xpath = "//input[@id='phone']")
	public static WebElement homePhone;
	@FindBy(xpath = "//input[@id='phone_mobile']")
	public static WebElement mobilePhoneNo;
	@FindBy(xpath = "//input[@id='alias']")
	public static WebElement alias;
	@FindBy(xpath = "//span[text()='Register']")
	public static WebElement register;
	@FindBy(xpath = "//a[@title='Information']")
	public static WebElement myPersonalInfo;
	@FindBy(xpath = "//input[@id='old_passwd']")
	public static WebElement oldPassword;
	@FindBy(xpath = "//input[@id='passwd']")
	public static WebElement newPassword;
	@FindBy(xpath = "//input[@id='confirmation']")
	public static WebElement confirmation;
	@FindBy(xpath = "//button[@name='submitIdentity']")
	public static WebElement save;
	@FindBy(xpath="//input[@id='email']")
	public static WebElement loginEmail;
	@FindBy(xpath="//input[@id='passwd']")
	public static WebElement loginPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public static WebElement loginSignIn;
	@FindBy(xpath="//p[@class='alert alert-success']")
	public static WebElement alertmsge;

	public static WebElement getAlertmsge() {
		return alertmsge;
	}

	public static WebElement getLoginEmail() {
		return loginEmail;
	}

	public static WebElement getLoginPassword() {
		return loginPassword;
	}

	public static WebElement getLoginSignIn() {
		return loginSignIn;
	}

	public static WebElement getSignIn() {
		return signIn;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getCreateAnAcc() {
		return createAnAcc;
	}

	public static WebElement getFirstName() {
		return firstName;
	}

	public static WebElement getMr() {
		return Mr;
	}

	public static WebElement getMrs() {
		return Mrs;
	}

	public static WebElement getLastName() {
		return lastName;
	}

	public static WebElement getMyPersonalInfo() {
		return myPersonalInfo;
	}

	public static WebElement getOldPassword() {
		return oldPassword;
	}

	public static WebElement getConfirmation() {
		return confirmation;
	}

	public static WebElement getSave() {
		return save;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getDays() {
		return days;
	}

	public static WebElement getMonths() {
		return months;
	}

	public static WebElement getYears() {
		return years;
	}

	public static WebElement getNotify1() {
		return notify1;
	}

	public static WebElement getNotify2() {
		return notify2;
	}

	public static WebElement getFirstName1() {
		return firstName1;
	}

	public static WebElement getLastName1() {
		return lastName1;
	}

	public static WebElement getCompany() {
		return company;
	}

	public static WebElement getAddress1() {
		return address1;
	}

	public static WebElement getAddress2() {
		return address2;
	}

	public static WebElement getCity() {
		return city;
	}
	public static WebElement getNewPassword() {
		return newPassword;
	}

	public static WebElement getState() {
		return state;
	}

	public static WebElement getPostCode() {
		return postCode;
	}

	public static WebElement getCountry() {
		return country;
	}

	public static WebElement getAdditionalInfo() {
		return additionalInfo;
	}

	public static WebElement getHomePhone() {
		return homePhone;
	}

	public static WebElement getRegister() {
		return register;
	}

	public static WebElement getMobilePhoneNo() {
		return mobilePhoneNo;
	}

	public static WebElement getAlias() {
		return alias;
	}

}
