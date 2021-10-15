package com.selenium;
//Working with Selectable
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//
public class WorkingwithSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectable = driver.findElements(By.xpath("//ol/li"));
		int count = selectable.size();
		System.out.println(count);
		Actions actions = new Actions(driver);
		/*
		 * actions.keyDown(Keys.CONTROL); actions.click(selectable.get(0));
		 * actions.click(selectable.get(1)); actions.click(selectable.get(2));
		 * actions.click(selectable.get(3)); actions.build().perform();
		 */
		actions.clickAndHold(selectable.get(0));
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.clickAndHold(selectable.get(3));
		actions.build().perform();

	}

}
