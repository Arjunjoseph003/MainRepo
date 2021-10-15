package com.selenium;
//
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");

		WebElement firstLink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		firstLink.click();

		driver.navigate().back();

		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where "));
		String destinationPlace = whereToGo.getAttribute("href");
		System.out.println(destinationPlace);

		WebElement verification = driver.findElement(By.linkText("Verify am I broken?"));
		verification.click();

		String title = driver.getTitle();
		if (title.contains("404 not found")) {
			System.out.println("The Link is Broken");
		}

		driver.navigate().back();
		WebElement thirdLink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		thirdLink.click();
		driver.navigate().back();

		List<WebElement> lastLink = driver.findElements(By.tagName("a"));

		int count = lastLink.size();
		System.out.println(count);

	}

}
