package org.seleniumexample;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskDay12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeWebDriver 93\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement eachrow = rows.get(4);

		List<WebElement> datas = eachrow.findElements(By.tagName("td"));
		System.out.println(datas.size());
		for (int i = 0; i < datas.size(); i++) {
			WebElement data = datas.get(i);
			String text = data.getText();
			if (text.contains("Helen ")) {
				System.out.println(text);
			}

		}
		driver.quit();

	}

}
