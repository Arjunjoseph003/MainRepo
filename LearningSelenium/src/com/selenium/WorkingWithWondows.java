package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Working with windows
public class WorkingWithWondows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement firstButton = driver.findElement(By.xpath("//label[@for='home']/following::button[@onclick='openWin();']"));
		firstButton.click();
		
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for (String newWindow : newWindowHandles) {
			driver.switchTo().window(newWindow );
			
		}

		WebElement buttonBox = driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']/following::img[@alt='Buttons']"));
		buttonBox.click();
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement multipleWindows = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		multipleWindows.click();
		
		Set<String> allwindowsHandles =driver.getWindowHandles();
		
		for (String newWindow : allwindowsHandles) {
			if(!newWindow.equals(oldWindow)) {
				driver.switchTo().window(newWindow);
				driver.close();
			}		
		}
		
			driver.quit();
		}

	}


