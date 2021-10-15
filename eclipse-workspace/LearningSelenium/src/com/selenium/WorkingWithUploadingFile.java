package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class WorkingWithUploadingFile{

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");

		WebElement uploadingFile = driver.findElement(By.xpath("//input[@type='file']"));
		uploadingFile.click();

		
		  String file = "F:\\X-path\\testleaf.xls";
		  
		  StringSelection selection = new StringSelection(file);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
		  null);
		  
		  Robot robot = new Robot(); 
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V);
		 
		  robot.keyPress(KeyEvent.VK_ENTER); robot.keyPress(KeyEvent.VK_V);
		 

	}
}
