package com.selenium;
//ToolTip Text
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithToolTip{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement toolTip = driver.findElement(By.xpath("//input"));
		String toolTipName = toolTip.getAttribute("title");
		System.out.println(toolTipName);
		toolTip.sendKeys("Arjun");
	
	
	}

}
