package org.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven {

	public static void main(String[] args) throws IOException {
		//Location of the excel sheet
		File file=new File("C:\\Users\\MANI SURYA\\eclipse-workspace\\FrameWork\\excel\\Data.xlsx");

		FileInputStream stream =new FileInputStream(file);



		Workbook w = new XSSFWorkbook(stream);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(1);

		Cell c = r.getCell(2);

		//String so = c.getStringCellValue();
		String so=c.getStringCellValue();
		System.out.println(so);
		if (so.equals("Chennai")) {


			c.setCellValue("Pondy");

		}
		FileOutputStream out =new FileOutputStream(file);

		w.write(out);
		System.out.println("Done. . . .");













	}

}













