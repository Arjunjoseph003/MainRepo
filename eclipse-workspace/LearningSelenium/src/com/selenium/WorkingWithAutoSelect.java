package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class WorkingWithAutoSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");

		WebElement autoCompleteBox = driver.findElement(By.xpath("//*[@autocomplete='off']"));
		autoCompleteBox.click();
		autoCompleteBox.sendKeys("a");

		Thread.sleep(4000);// Explicit wait

		List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int count = optionsList.size();
		System.out.println(count);

		for (WebElement webElement : optionsList) {
			if (webElement.getText().equals("Appium")) {
				webElement.click();
				break;
			}
		}

	}

}
