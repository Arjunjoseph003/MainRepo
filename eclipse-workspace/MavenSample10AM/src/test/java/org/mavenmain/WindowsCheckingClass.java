package org.mavenmain;

import org.mavenbass.MavenBassClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowsCheckingClass extends MavenBassClass {

	public static void main(String[] args) {
		launchBrowser();
		launchurl("http://www.greenstech.in/selenium-course-content.html");
		maxBrowser();
		WebElement seleniumTestPaper = driver.findElement(By.xpath("(//h2[@class='mb-0'])[5]"));
		btnClick(seleniumTestPaper);
		implicitWait(10);
		WebElement day5Task = driver.findElement(By.xpath("//a[text()=' DAY 5 TASK']"));
		btnClick(day5Task);
		desiredWindowsWithNumber(1);
		WebElement questions5 = driver.findElement(By.xpath("//pre"));
		implicitWait(10);
		getText(questions5);
		desiredWindowsWithNumber(0);
		WebElement day6Task = driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
		btnClick(day6Task);
		desiredWindowsWithNumber(2);
		WebElement questions6 = driver.findElement(By.xpath("//pre"));
		getText(questions6);
		desiredWindowsWithNumber(0);
		WebElement day7Task = driver.findElement(By.xpath("//a[text()=' DAY 7 TASK']"));
		btnClick(day7Task);
		desiredWindowsWithNumber(3);
		WebElement questions7 = driver.findElement(By.xpath("//pre"));
		getText(questions7);

	}

}
