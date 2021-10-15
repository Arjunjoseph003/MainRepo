package org.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskDay9 {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", login);
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('Value','abc@gmail')", username);
		Object o = js.executeScript("return arguments[0].getAttribute('Value')", username);
		String s=(String)o;
		System.out.println(s);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('Value','abcgmail')", password);
		Object o1 = js.executeScript("return arguments[0].getAttribute('value')", password);
		String s1=(String)o1;
		System.out.println(s1);
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].click()", submit);
		 driver.quit();
	}

}
