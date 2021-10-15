package org.seleniumexample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskDay7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]")).click();
		driver.findElement(By.xpath("//input[@title='User Id']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("abcedfgh");
		driver.findElement(By.xpath("//input[@title='Log In']")).click();
		

	}

}
