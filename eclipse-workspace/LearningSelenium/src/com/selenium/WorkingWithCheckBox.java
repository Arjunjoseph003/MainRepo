package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//CheckBoxes
public class WorkingWithCheckBox{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");

		WebElement languages = driver.findElement(By.xpath("//input[@type='checkbox']/following::input[2]"));
		languages.click();

		WebElement confirmation = driver.findElement(By.xpath("//div[@class='example']/following-sibling::div/div/input"));
		boolean status = confirmation.isSelected();
		System.out.println(status);


		WebElement firstElement = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));

		if (firstElement.isSelected()) {
			firstElement.click();
		}

		WebElement secondElement = driver
				.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));

		if (secondElement.isSelected()) {
			secondElement.click();
		}
	

		WebElement options = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
		options.click();

	}

}
