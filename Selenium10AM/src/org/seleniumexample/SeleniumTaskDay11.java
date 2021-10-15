package org.seleniumexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTaskDay11 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		//driver.manage().window().maximize();
		Actions a = new Actions(driver);
		Robot r = new Robot();
	    WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
	    Select s =new Select(fruits);
	    s.selectByIndex(0);
	    s.selectByValue("apple");
	    s.selectByVisibleText("Orange");
	    s.selectByIndex(3);
	    WebElement firstSelectedOption = s.getFirstSelectedOption();
	    String text = firstSelectedOption.getAttribute("value");
	    System.out.println("The first Selected optionis :"+text);
	   
		  		
		   		   
		
	}
	    
	  	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Thread.sleep(3000);
		WebElement close = driver.findElement(By.xpath("(//span[text()='×'])[1]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", close);
		
	/*	driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			if (eachWindow.equals(parentWindow)) {
				driver.switchTo().window(eachWindow);
			}

		}
		String text = driver.findElement(By.xpath("//pre")).getText();
		System.out.println(text);*/

	}


