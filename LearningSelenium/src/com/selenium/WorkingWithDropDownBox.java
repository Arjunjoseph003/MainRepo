package com.selenium;
//dropDown boxesS
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownBox{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropDown1);
		select.selectByIndex(1);

		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(dropDown2);
		select1.selectByVisibleText("Appium");

		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(dropDown3);
		select2.selectByValue("3");

		WebElement dropDown4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select select3 = new Select(dropDown4);
		List<WebElement> listOfOptions = select3.getOptions();
		int optionNumbers = listOfOptions.size();
		System.out.println(optionNumbers);

		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");

		WebElement multiSelect = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectBox = new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);

	}

}
