package com.selenium;
//Edit TextBox
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithEditBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("arjunthedone.96@gmail.com");
		WebElement appendbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendbox.sendKeys("Arjun");
		WebElement getTextBox = driver.findElement(By.name("username"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		boolean value1 = disabledBox.isEnabled();
		System.out.println(value1);
		// driver.quit();
	}

}
