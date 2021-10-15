package com.selenium;
//Drag and Droppable
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDropAndDroppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement from = driver
				.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement to = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));

		Actions actions = new Actions(driver);
		//two ways to perform the drag and drop elements
		// actions.clickAndHold(from).moveToElement(to).release().build().perform();
		actions.dragAndDrop(from, to).build().perform();
	}

}
