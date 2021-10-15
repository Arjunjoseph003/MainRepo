package org.seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\Edge Webdriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://WWW.greenstechnologys.com/");
		String title = driver.getTitle();
		System.out.println("The Title of greensTechnology :" + title);

		driver.get("http://WWW.facebook.com/");
		String title1 = driver.getTitle();
		System.out.println("The Title of facebook :" + title1);

		driver.get("http:///WWW.amazon.in/");
		String title2 = driver.getTitle();
		System.out.println("The Title of amazon :" + title2);

		driver.get("http://greenstech.in/selenium-course-content.html");
		String title3 = driver.getTitle();
		System.out.println("The Title of GreensTechnologySelenium :" + title3);
		String currentUrl = driver.getCurrentUrl();
		String currentUrl1 = driver.getCurrentUrl();
		String currentUrl2 = driver.getCurrentUrl();
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println("The Current Url is :" + currentUrl);
		System.out.println("The Current Url1 is :" + currentUrl1);
		System.out.println("The Current Url2 is :" + currentUrl2);
		System.out.println("The Current Url is :" + currentUrl3);
		driver.quit();
	}

}
