package org.loginexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jdk.jfr.DataAmount;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginTestCase {
	WebDriver driver;

	String[][] data;

	@DataProvider(name = "loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		return data = excelData();
	}

	public String[][] excelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("F:\\X-path\\Excel 97-2003.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet(0);
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String[][] testData = new String[rowCount-1][columnCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				testData[i - 1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}

	@Test(dataProvider = "loginData")
	public void loginWithBothcorrect(String uName, String pWord) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		userName.sendKeys(uName);

		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys(pWord);

		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginButton.click();
		driver.quit();

	}


}
