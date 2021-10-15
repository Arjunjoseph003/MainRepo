package org.seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTaskDay5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		// driver.manage().window().maximize();
		Actions a = new Actions(driver);

		WebElement sighIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		Thread.sleep(3000);
		//WebElement heels = driver.findElement(By.xpath("//div[text()='Heels']"));
	//	WebElement portableAirConditioners = driver
			//	.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])[1]"));
		a.moveToElement(sighIn).perform();
		a.moveToElement(register).click().perform();
		driver.switchTo().frame("iframeLogin");
		
		// a.moveToElement(portableAirConditioners).click().perform();
		// driver.quit();
	}

}
