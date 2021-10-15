package org.mavenbass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojoclass.DemoQaRegistrationPojoClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenBassClass {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Robot r;
	public static FluentWait<WebDriver> f;

	public static WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void Fill(WebElement element, String txt) {
		element.sendKeys(txt);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void actionDragAndDrop(WebElement from, WebElement to) {
		a = new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}

	public static void moveToElement(WebElement Element) {
		a = new Actions(driver);
		a.moveToElement(Element).perform();

	}

	public static void sendingKeysUsingActions(WebElement Element, String Usertext) {
		a = new Actions(driver);
		a.sendKeys(Element, Usertext);

	}

	public static void rightClick(WebElement Element) {
		a = new Actions(driver);
		a.contextClick(Element).perform();

	}

	public static void doubleClick(WebElement Element) {
		a = new Actions(driver);
		a.doubleClick(Element).perform();

	}

	public static Robot robotClass() throws AWTException {
		r = new Robot();
		return r;

	}

	public static void robotClassDown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void robotClassUp() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void robotClassClear() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CLEAR);
		r.keyRelease(KeyEvent.VK_CLEAR);
	}

	public static void robotClassCut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CUT);
		r.keyRelease(KeyEvent.VK_CUT);

	}

	public static void robotClassCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_COPY);
		r.keyRelease(KeyEvent.VK_COPY);

	}

	public static void robotClassSelectALL(WebElement element) throws AWTException {
		r = new Robot();
		btnClick(element);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

	}

	public static void robotClasspaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_PASTE);
		r.keyRelease(KeyEvent.VK_PASTE);

	}

	public static void robotClassPageUp() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

	}

	public static void robotClassPageDown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	public static void robotClassControl() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void robotClassEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void robotClassAlt() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_ALT);
	}

	public static void robotClassShift() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	public static File takesScreenShot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		return src;
	}

	public static void destFile(File src, String location) throws IOException {
		File dest = new File(location);
		FileUtils.copyFile(src, dest);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void selectByIndex(WebElement element, int no) {
		Select s = new Select(element);
		s.selectByIndex(no);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}

	public static void selectByValue(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}

	public static List<WebElement> selectByGettingOptions(WebElement element, String text) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static String getAttribute(WebElement element, String attributeName) {
		 String attribute = element.getAttribute(attributeName);
		 return attribute;
		//System.out.println(attribute);
	}

	public static void getEnteredValue(WebElement element) {
		String enteredValue = element.getAttribute("Value");
		System.out.println(enteredValue);
	}

	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static WebDriverWait webDriverWait() {
		WebDriverWait w = new WebDriverWait(driver, 10);
		return w;
	}

	public static void webDriverWaitAlert() {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
	}

	public static void webDriverWaitClickable(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void webDriverWaitSelectable(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeSelected(element));
	}

	public static void webDriverWaitVisibilty(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(element));
	}

	public static FluentWait<WebDriver> fluentWait() {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		return f;

	}

	public static Alert fluentWaitAlert() {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		Alert a = f.until(ExpectedConditions.alertIsPresent());
		return a;
	}

	public static void fluentWaitClickable(WebElement element) {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		f.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void fluentWaitSelectable(WebElement element) {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		f.until(ExpectedConditions.elementToBeSelected(element));

	}

	public static void fluentWaittitleContains(String title) {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		f.until(ExpectedConditions.titleContains(title));

	}

	public static void fluentWaittitleIs(String title) {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		f.until(ExpectedConditions.titleIs(title));

	}

	public static void fluentWaitVisibility(WebElement element) {
		f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(1))
				.ignoring(Throwable.class);
		f.until(ExpectedConditions.visibilityOf(element));

	}

	public static Alert SwitchingAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public static void switchingFrames(int framesNo) {
		driver.switchTo().frame(framesNo);
	}

	public static void switchingFramesToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

	public static void switchingFramesToparentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void switchingFrames(String framesNameAndId) {
		driver.switchTo().frame(framesNameAndId);
	}

	public static void switchingFrames(WebElement framesElement) {
		driver.switchTo().frame(framesElement);
	}

	public static void getPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closingWindow() {
		driver.close();
	}

	public static void quittingBrowser() {
		driver.quit();
	}
	public static void back() {
		driver.navigate().back();
	}

	public static String parentWindowsHandle() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public static Set<String> ChildWindowsHandle() {
		Set<String> ChildWindows = driver.getWindowHandles();
		return ChildWindows;
	}

	public static void desiredWindow() {
		String parentWindow = parentWindowsHandle();
		Set<String> childWidowsHandle = ChildWindowsHandle();
		for (String eachWindow : childWidowsHandle) {
			if (!eachWindow.equals(parentWindow)) {
				driver.switchTo().window(eachWindow);
			}
		}
	}

	public static void desiredWindowsWithNumber(int no) {
		parentWindowsHandle();
		Set<String> childWindows = ChildWindowsHandle();
		List<String> li = new ArrayList();
		for (String windowsId : childWindows) {
			li.add(windowsId);
		}
		String string = li.get(no);
		driver.switchTo().window(string);
	}

	public static JavascriptExecutor javaScript() {
		return js = (JavascriptExecutor) driver;

	}

	public static void scrollDown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public static void scrollUp(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void javaScriptgetAttribute(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("returnarguments[0].getAttribute('value')", element);

	}

	public static void javaScriptSetAttribute(WebElement element, String text) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','text')", element);

	}
	public static void javaScriptremoveAttribute(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", element);

	}


	public static void javaScriptClick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].Click()", element);

	}

	public static Sheet excelSheetRead(String sheetName) throws Exception {
		File f = new File("C:\\Users\\Arjun\\Documents\\booking hotel details.xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(read);
		Sheet sheet = w.getSheet(sheetName);
		return sheet;
	}

	public static int excelSheetReadRowNo(String sheetName) throws Exception {
		File f = new File("C:\\Users\\Arjun\\Documents\\booking hotel details.xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(read);
		Sheet sheet = w.getSheet(sheetName);
		int rowNo = sheet.getPhysicalNumberOfRows();
		return rowNo;
	}

	public static int excelSheetReadCellNo(String sheetName) throws Exception {
		File f = new File("C:\\Users\\Arjun\\Documents\\StudentsDetails.xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(read);
		int cellNo = 0;
		Sheet sheet = w.getSheet(sheetName);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			cellNo = cellNo + cellCount;
		}
		return cellNo;
	}

	public static void excelGettingAllCellValues(String sheetName) throws Exception {
		Sheet sheet = excelSheetRead(sheetName);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				// String name = "";
				if (type == 1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat sDF = new SimpleDateFormat("dd MM yyyy");
					String format = sDF.format(date);
					System.out.println(format);

				} else {
					double d = cell.getNumericCellValue();
					long lo = (long) d;
					String valueOf = String.valueOf(lo);
					System.out.println(valueOf);

				}

			}

		}

	}

	public static String excelGettingSpecificCellValue(String sheetName, int rowNo, int cellNo) throws Exception {
		String value = "";
		Sheet sh = excelSheetRead(sheetName);
		Row row = sh.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();
		System.out.println(type);
		if (type == 1) {
			value = cell.getStringCellValue();
			System.out.println(value);

		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			String dateFormat1;
			SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");
			value = sDF.format(date);

		} else {
			double d = cell.getNumericCellValue();
			long lo = (long) d;
			value = String.valueOf(lo);

		}

		return value;
	}

}
