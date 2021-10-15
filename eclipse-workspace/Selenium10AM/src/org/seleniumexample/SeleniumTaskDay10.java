package org.seleniumexample;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTaskDay10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
		a.moveToElement(home).perform();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Home Furnishings']")).click();
	    Thread.sleep(3000);
	    WebElement tvsAndAppliances = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	    a.moveToElement(tvsAndAppliances).perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[text()='Mi']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[text()='Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV'])[1]")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		a.moveToElement(home).perform();
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']")).click();
		Thread.sleep(3000);
		WebElement homeandFurnitures = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		a.moveToElement(homeandFurnitures).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Bath Towels']")).click();
		/*
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		driver.quit();*/
		

	}

}
