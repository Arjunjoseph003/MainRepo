package com.selenium;
//RadioButtons
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\chromeWebdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");

		WebElement classes = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/child::div/label/input"));
		classes.click();

		WebElement unchecked = driver.findElement(By.name("news"));
		boolean status = unchecked.isSelected();

		WebElement checked = driver
				.findElement(By.xpath("//div[@class='example']/following-sibling::div/div/div/label[3]/input"));
		boolean status1 = checked.isSelected();
		System.out.println(status + "\n" + status1);

		WebElement ageSelection = driver.findElement(By.name("age"));
		ageSelection.click();

	}

}
