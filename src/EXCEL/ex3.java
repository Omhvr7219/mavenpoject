package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3 {
 public static void main(String[] args) throws IOException {
	FileInputStream xl = new  FileInputStream("C:\\Users\\admin\\Desktop\\gmeet test cases.xlsx");
	Workbook book = WorkbookFactory.create(xl);
	Sheet s= book.getSheet("BMI ");
	Row r = s.getRow(0);
	Cell c = r.getCell(3);
	String str= c.getStringCellValue();
	System.out.println(str);
	
	
//	
//	c.getNumericCellValue()
//	
//	c.getBooleanCellValue()
	
	
}
}
