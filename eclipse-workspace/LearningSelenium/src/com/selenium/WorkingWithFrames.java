package com.selenium;

import java.util.List;
//Working with Frames
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Working with frames
public class WorkingWithFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement firstFrameButton = driver.findElement(By.id("Click"));
		firstFrameButton.click();

		String clickMe = driver.findElement(By.id("Click")).getText();
		System.out.println(clickMe);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement secondButton = driver.findElement(By.id("Click1"));
		secondButton.click();

		driver.switchTo().defaultContent();

		List<WebElement> totalFrames = driver.findElements(By.tagName("div"));
		int countFrames = totalFrames.size();
		System.out.println(countFrames);
	}

}
