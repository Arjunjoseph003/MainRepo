package com.selenium;

//
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithdownloadafile  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\chromeWebdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/download.html");

		WebElement excelFiles = driver.findElement(By.linkText("Download Excel"));
		excelFiles.click();

		WebElement pdfFiles = driver.findElement(By.linkText("Download PDF"));
		pdfFiles.click();
		 
		driver.navigate().back();

		WebElement textFiles = driver.findElement(By.linkText("Download Text"));
		textFiles.click(); // Thread.sleep(4000);

		File fileLocation = new File("C:\\Users\\Arjun\\Downloads");
		File[] desiredFiles = fileLocation.listFiles();

		for (File file : desiredFiles) {
			if (file.getName().equals("testleaf.xlsx")) {
				System.out.println("files is dowloaded");
			}

		}

	}

}
