package org.mavenmain;

import org.mavenbass.MavenBassClass;
import org.pojoclass.LoginPojoClass;

public class PomFrameWorkMain extends MavenBassClass {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		launchurl("https://en-gb.facebook.com/");
		getPageTitle();
		LoginPojoClass lp = new LoginPojoClass();
		Fill(lp.getTextMail(), excelGettingSpecificCellValue("Sheet1", 1, 1));
		Fill(lp.getTextpass(), excelGettingSpecificCellValue("Sheet1", 1, 2));
		btnClick(lp.getLoginBtn());

	}

}
