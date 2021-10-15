package com.selenium;
//Buttons Operation
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtonsOPeration {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xyPoint = getPositionButton.getLocation();
		int xValue = xyPoint.getX();
		int yValue = xyPoint.getY();
		System.out.println("X value is " + xValue + " , YValue is " + yValue);
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Button Color is" + color);
		WebElement buttonSize = driver.findElement(By.id("size"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		System.out.println("Height of the Button is " + height + "Width of the Button is " + width);

		WebElement goToHomePageButtons = driver.findElement(By.id("home"));
		goToHomePageButtons.click();

	}

}
