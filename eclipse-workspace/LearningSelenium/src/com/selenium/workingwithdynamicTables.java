package com.selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class workingwithdynamicTables {

	public static void main(String[] args)   {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");

		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columnsCount = columns.size();
		System.out.println(columnsCount);

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println(rowsCount);

		WebElement progressValue = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']/following::td[1]"));
		String gettingProgressValue = progressValue.getText();
		System.out.println("Getting progress value :"+gettingProgressValue);
		
		List<WebElement> check = driver.findElements(By.xpath("//td[2]"));
	    List<Integer> numberList = new ArrayList<Integer>();
		for (WebElement webElement : check) {
			String progressValues =webElement.getText().replace("%", "");	
		    numberList.add(Integer.parseInt(progressValues ));	
		}
		System.out.println(numberList);
		int smallValue=Collections.min(numberList);
		String SmallValueString =Integer.toString(smallValue)+"%";
		System.out.println(SmallValueString);
		
		String finalXpath = "//td[normalize-space()="+"\"" + SmallValueString + "\""+"]/following::td[1]/input";
		System.out.println(finalXpath);
		
		WebElement checkBox =driver.findElement(By.xpath(finalXpath));
		checkBox.click();
			
		}
	}
	

