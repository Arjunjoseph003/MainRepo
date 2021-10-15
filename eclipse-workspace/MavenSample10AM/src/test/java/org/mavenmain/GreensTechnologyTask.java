package org.mavenmain;

import org.mavenbass.MavenBassClass;
import org.pojoclass.GreensTechnologyPojoClass;

public class GreensTechnologyTask extends MavenBassClass {

	public static void main(String[] args) {
		launchBrowser();
		launchurl("http://www.greenstechnologys.com/");
		maxBrowser();
		GreensTechnologyPojoClass gt = new GreensTechnologyPojoClass();
		scrollDown(gt.getPhoneNumber());
		getText(gt.getPhoneNumber());
		scrollUp(gt.getNo1Text());
		getText(gt.getNo1Text());
		btnClick(gt.getCertifications());
		btnClick(gt.getSeleniumCourseContent());
		getText(gt.getParagraph());
		getText(gt.getSeleniumTraining());
		moveToElement(gt.getCourses());
		moveToElement(gt.getJavaTraining());
		btnClick(gt.getCoreJavaTraining());
		scrollDown(gt.getAnithaReviews());
		getText(gt.getAnithaReviews());
		btnClick(gt.getCareers());
		scrollDown(gt.getCareerPhoneNo());
		getText(gt.getEmailcareers());
		driver.navigate().back();
		btnClick(gt.getTestimonials());
		getText(gt.getGreensTechnologyOMRPhoneNo());
		btnClick(gt.getContactUs());
		getText(gt.getMainBranches());
		scrollDown(gt.getCopyRights());
		getText(gt.getCopyRights());

	}

}
