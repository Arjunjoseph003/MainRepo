package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalenders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		/*WebElement calendar =driver.findElement(By.xpath("//input"));
		calendar.sendKeys("09/15/2021"+Keys.ENTER);*/
		
		WebElement calendar =driver.findElement(By.xpath("//input"));
		calendar.click();
		Thread.sleep(3000);
		WebElement nextButton =driver.findElement(
				By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        nextButton.click();
        
        WebElement dateClicked =driver.findElement(By.xpath("//a[text()='10']"));
        dateClicked.click();
	}

}
