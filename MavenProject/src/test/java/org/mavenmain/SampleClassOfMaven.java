package org.mavenmain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.mavenbass.MavenBassClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClassOfMaven extends MavenBassClass {

	public static void main(String[] args) throws IOException, AWTException {

		launchBrowser();
		launchurl("https://www.amazon.com/");
		// maxBrowser();
		implicitWait(10);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Fill(searchBox, "iphone X");
		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		btnClick(searchButton);
		WebElement product1 = driver.findElement(
				By.xpath("//span[text()='Apple iPhone X, 64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));
		rightClick(product1);
		for (int i = 0; i <= 1; i++) {
			robotClassDown();
		}
		robotClassEnter();
		desiredWindowsWithNumber(1);
		implicitWait(10);
		WebElement price = driver.findElement(By.xpath("//td[text()='Price:']"));
		webDriverWaitVisibilty(price);
		getText(price);
		WebElement priceOfProduct = driver.findElement(By.xpath("(//span[text()='$363.00'])[1]"));
		getText(priceOfProduct);

	}

}
