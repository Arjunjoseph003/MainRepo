package org.mavenmain;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.print.attribute.DocAttribute;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mavenbass.MavenBassClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.pojoclass.BookingHotelPojoClass;

public class BookingHotelMavenMain extends MavenBassClass {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		launchurl("http://adactinhotelapp.com/SearchHotel.php");
		maxBrowser();
		getPageTitle();
		BookingHotelPojoClass bh = new BookingHotelPojoClass();
		Fill(bh.getUserName(), excelGettingSpecificCellValue("Sheet1", 1, 1));
		Fill(bh.getPassword(), excelGettingSpecificCellValue("Sheet1", 1, 2));
		btnClick(bh.getLogin());
		selectByVisibleText(bh.getLocation(), excelGettingSpecificCellValue("Sheet1", 1, 3));
		selectByVisibleText(bh.getHotels(), excelGettingSpecificCellValue("Sheet1", 1, 4));
		selectByVisibleText(bh.getRoomType(), excelGettingSpecificCellValue("Sheet1", 1, 5));
		selectByValue(bh.getRoomNo(), excelGettingSpecificCellValue("Sheet1", 1, 6));
		robotClassSelectALL(bh.getCheckInDate());
		Fill(bh.getCheckInDate(), excelGettingSpecificCellValue("Sheet1", 1, 7));
		robotClassSelectALL(bh.getCheckOutDate());
		Fill(bh.getCheckOutDate(), excelGettingSpecificCellValue("Sheet1", 1, 8));
		selectByValue(bh.getAdultNO(), excelGettingSpecificCellValue("Sheet1", 1, 9));
		selectByValue(bh.getChildNo(), excelGettingSpecificCellValue("Sheet1", 1, 10));
		btnClick(bh.getSearch());
		btnClick(bh.getConfirmHotel());
		btnClick(bh.getContinueBtn());
		Fill(bh.getFirstName(), excelGettingSpecificCellValue("Sheet1", 1, 11));
		Fill(bh.getLastName(), excelGettingSpecificCellValue("Sheet1", 1, 12));
		Fill(bh.getBillingAddress(), excelGettingSpecificCellValue("Sheet1", 1, 13));
		Fill(bh.getCreditCardNo(), excelGettingSpecificCellValue("Sheet1", 1, 14));
		selectByValue(bh.getCreditCardType(), excelGettingSpecificCellValue("Sheet1", 1, 15));
		selectByValue(bh.getCreditExpMonth(), excelGettingSpecificCellValue("Sheet1", 1, 16));
		selectByValue(bh.getCreditExpYear(), excelGettingSpecificCellValue("Sheet1", 1, 17));
		Fill(bh.getCvvNo(), excelGettingSpecificCellValue("Sheet1", 1, 18));
		btnClick(bh.getBookNo());
		implicitWait(20);
		String attribute = getAttribute(bh.getOrderNo(), "value");
		File f = new File(
				"C:\\Users\\Arjun\\eclipse-workspace\\MavenSample10AM\\Excel Source\\booking hotel details.xlsx");
		FileInputStream read = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(read);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(19);
		cell.setCellValue("Order No");
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.createCell(19);
		cell1.setCellValue(attribute);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

	}

}
