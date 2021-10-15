package org.seleniumexample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTaskDay8 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("C:\\Users\\Arjun\\eclipse-workspace\\Selenium10AM\\screenshot\\interviewQuestions.png");
		WebElement pageDown = driver.findElement(By.xpath("//span[text()='Certification']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", pageDown);
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, dest);

	}

}
