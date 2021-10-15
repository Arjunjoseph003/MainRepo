package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlertBOx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement confirmBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();

		WebElement promptBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Arjun");
		alert2.accept();

	}

}
