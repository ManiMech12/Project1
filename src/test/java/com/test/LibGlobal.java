package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	public static WebDriver driver;
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		}
	public static void urlLaunch(String data) {
		driver.get(data);
	
        }
	public static void enterText(WebElement element, String name) {
		element.sendKeys(name);
     
	    }
	public static void btnClick(WebElement element) {
		element.click();

	    }
	public static void visText(WebElement element, String variable) {
		Select select = new Select(element);
		select.selectByVisibleText(variable);
		
	    }
	public  String xLoc(String FileLoc,String Sheetname,int rNo, int cNo) throws IOException {
		File file = new File(FileLoc);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s=w.getSheet(Sheetname);
		Row r = s.getRow(rNo);
		Cell c = r.getCell(cNo);
		int cellType = c.getCellType();
		String value;
	
		if (cellType==1) {
			 value = c.getStringCellValue();

		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date cellValue = c.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			value = dateFormat.format(cellValue);		
		}
		else {
			double cellValue = c.getNumericCellValue();
			long l =(long)cellValue;
			 value = String.valueOf(l);
		}
	
		return value;
		
		
	}
	
	
	

	
	
	
	
}
