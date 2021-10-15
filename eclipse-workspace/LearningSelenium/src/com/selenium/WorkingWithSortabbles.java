package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSortabbles {

	

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='sortable']/li"));

		WebElement fromElement = elements.get(6);
		WebElement toElement = elements.get(0);

		/*List<WebElement> elements1 = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		WebElement fromElement1 = elements1.get(6);
		WebElement toElement1 = elements1.get(1);*/

		/*List<WebElement> elements2 = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		WebElement fromElement2 = elements.get(6);
		WebElement toElement2 = elements.get(2);*/

		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement).moveToElement(toElement).release();
		actions.build().perform();
		/*Thread.sleep(3000);
		actions.clickAndHold(fromElement1).moveToElement(toElement1).release();
		actions.build().perform();
		/*actions.clickAndHold(fromElement2).moveToElement(toElement2).release();
		actions.build().perform();*/

	}

}
