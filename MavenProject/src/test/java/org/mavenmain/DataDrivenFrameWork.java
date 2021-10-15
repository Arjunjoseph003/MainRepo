package org.mavenmain;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mavenbass.DemoQAPageDetails;
import org.mavenbass.MavenBassClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFrameWork extends MavenBassClass {

	public static void main(String[] args) throws Exception {
		/*
		 * excelGettingAllCellValues("Sheet1"); excelGettingSpecificCellValue("Sheet1",
		 * 4, 2);
		 */
		/*
		 * int rowNo = excelSheetReadRowNo("Sheet1"); int cellNo =
		 * excelSheetReadCellNo("Sheet1");
		 * System.out.println("The Excel Sheet Total rowNo :"+rowNo+
		 * "\n"+"The Excel Sheet total cellNo :"+cellNo );
		 */
		File f = new File("C:\\Users\\Arjun\\eclipse-workspace\\MavenSample10AM\\Excel Source\\StudentsDetails.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");
		Row additionalRow = sheet.createRow(12);
		Cell cell = additionalRow.createCell(0);
		cell.setCellValue("12");
		Cell cell1 = additionalRow.createCell(1);
		cell1.setCellValue("parthiban");
		Cell cell2 = additionalRow.createCell(2);
		cell2.setCellValue("Oracle");
		FileOutputStream fos = new FileOutputStream(f);
		book.write(fos);

	}

}
