package org.mavenmain;

import java.awt.AWTException;

import org.mavenbass.MavenBassClass;
import org.pojoclass.MyStoreCreateAccountPojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyStoreCreateAccMain extends MavenBassClass {
	public static MyStoreCreateAccountPojoClass my;

	@BeforeSuite
	public void launchingBrowser() {
		launchBrowser();
		my = new MyStoreCreateAccountPojoClass();
	}

	@BeforeClass
	public void openingMyStore() {
		launchurl("http://automationpractice.com/index.php");
		maxBrowser();
		System.out.println("Opening My store");
	}

	@AfterClass
	public void closingMystore() {
		System.out.println("closing my MyStore ");
	}

	@Test
	public void signIn() throws InterruptedException, AWTException {
		btnClick(my.signIn);
		Fill(my.email, "arjun03josephs@gmail.com");
		btnClick(my.getCreateAnAcc());
		Thread.sleep(10000);
		btnClick(my.Mr);
		Fill(my.firstName, "Arjun");
		Fill(my.lastName, "Joseph");
		Fill(my.password, "jamesbond003");
		selectByValue(my.days, "3");
		selectByValue(my.months, "5");
		selectByValue(my.years, "1996");
		btnClick(my.notify1);
		btnClick(my.notify2);
		Fill(my.firstName1, "Arjun");
		Fill(my.lastName1, "Joseph");
		Fill(my.company, "abc Pvt Ltd ");
		Fill(my.address1, "No;13, xyz nagar chennai-09");
		Fill(my.address2, "No;14, xyz nagar chennai-09");
		Fill(my.city, "George Town");
		selectByValue(my.state, "32");
		Fill(my.postCode, "45678");
		selectByValue(my.country, "21");
		Fill(my.additionalInfo, "Demo Account creation");
		Fill(my.homePhone, "7894561231");
		Fill(my.mobilePhoneNo, "8975642312");
		Fill(my.alias, "No;15");
		btnClick(my.register);
		closingWindow();
	}

	@Test
	public void changingNewPassword() {
		launchurl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Fill(my.loginEmail, "arjun03josephs@gmail.com");
		Fill(my.loginPassword, "jamesbond003");
		btnClick(my.loginSignIn);
		btnClick(my.myPersonalInfo);
		Fill(my.oldPassword, "jamesbond003");
		Fill(my.newPassword, "jamesbond003");
		Fill(my.confirmation, "jamesbond003");
		btnClick(my.save);
		getText(my.alertmsge);
		closingWindow();
	}

	@AfterSuite
	public void closingBrowser() {
		 
		System.out.println("Account has been successfully created");
	}

}
