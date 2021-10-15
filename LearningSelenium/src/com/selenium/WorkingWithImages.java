package com.selenium;
// 
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Image.html");

		String oldWindows = driver.getWindowHandle();
		WebElement image1 = driver.findElement(By.xpath("//img[@src='../images/testleaf_logo.png']"));
		image1.click();
		driver.navigate().back();

		WebElement brokenImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));

		if (!brokenImage.getAttribute("naturalwidth").equals("0")) {
			System.out.println("Its not a  broken Image ");
		} else {
			System.out.println("Its not a broken Image");
		}
	}

}
