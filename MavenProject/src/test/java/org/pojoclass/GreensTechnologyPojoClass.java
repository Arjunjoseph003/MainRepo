package org.pojoclass;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensTechnologyPojoClass extends MavenBassClass {
	public GreensTechnologyPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='+91- 89399 15577 '])[5]")
	private WebElement PhoneNumber;
	@FindBy(xpath = "//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement No1Text;
	@FindBy(xpath = "//a[text()='Certifications']")
	private WebElement certifications;
	@FindBy(xpath = "(//a[text()='Course Content'])[29]")
	private WebElement seleniumCourseContent;
	@FindBy(xpath = "//p[text()=' includes Selenium Architecture, Selenium WebDriver 3.0, Waits, TestNG, Jenkins, Page Object Modeling [POM], Locating Techniques, AutoIT, Sikuli, Page Object Design Pattern, mobile testing with Appium and Selenium Grid and more with Live Projects – Hands on 80 hours training on Live Selenium Project.']")
	private WebElement paragraph;
	@FindBy(xpath = "//strong[text()='Selenium Training in Chennai']")
	private WebElement SeleniumTraining;
	@FindBy(xpath = "//a[text()='COURSES']")
	private WebElement courses;
	@FindBy(xpath = "//a[text()='Java Training ']")
	private WebElement javaTraining;
	@FindBy(xpath = "//a[text()='Core Java Training']")
	private WebElement coreJavaTraining;
	@FindBy(xpath = "//h2[text()='Java training Reviews from Anitha']")
	private WebElement anithaReviews;
	@FindBy(xpath = "//a[text()='CAREERS']")
	private WebElement careers;
	@FindBy(xpath = "(//a[text()='+91 89399 15577'])[5]")
	private WebElement careerPhoneNo;
	@FindBy(xpath = "(//a[text()='contact@greenstechnologys.com'])[5]")
	private WebElement emailcareers;
	@FindBy(xpath = "//a[text()='TESTIMONIALS']")
	private WebElement testimonials;
	@FindBy(xpath = "(//li[text()='+91 8939 915 577 '])[2]")
	private WebElement greensTechnologyOMRPhoneNo;
	@FindBy(xpath = "(//a[text()='Contact Us'])[1]")
	private WebElement contactUs;
	@FindBy(xpath = "//h3[text()='Our Main Branches In Chennai ']")
	private WebElement mainBranches;
	@FindBy(xpath = "//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement copyRights;

	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}

	public WebElement getNo1Text() {
		return No1Text;
	}

	public WebElement getCertifications() {
		return certifications;
	}

	public WebElement getSeleniumCourseContent() {
		return seleniumCourseContent;
	}

	public WebElement getParagraph() {
		return paragraph;
	}

	public WebElement getSeleniumTraining() {
		return SeleniumTraining;
	}

	public WebElement getCourses() {
		return courses;
	}

	public WebElement getJavaTraining() {
		return javaTraining;
	}

	public WebElement getCoreJavaTraining() {
		return coreJavaTraining;
	}

	public WebElement getAnithaReviews() {
		return anithaReviews;
	}

	public WebElement getCareers() {
		return careers;
	}

	public WebElement getCareerPhoneNo() {
		return careerPhoneNo;
	}

	public WebElement getEmailcareers() {
		return emailcareers;
	}

	public WebElement getTestimonials() {
		return testimonials;
	}

	public WebElement getGreensTechnologyOMRPhoneNo() {
		return greensTechnologyOMRPhoneNo;
	}

	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getMainBranches() {
		return mainBranches;
	}

	public WebElement getCopyRights() {
		return copyRights;
	}

}
