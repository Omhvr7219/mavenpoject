package EXCEL;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2 {
public static void main(String[] args) throws IOException {
	FileInputStream xl= new FileInputStream("C:\\Users\\admin\\Desktop\\gmeet test cases.xlsx");
	Workbook book = WorkbookFactory.create(xl);
	Sheet sh = book.getSheet("GMEET") ;
	Row r = sh.getRow(1);
	Cell c = r.getCell(5);
	String s= c.getStringCellValue();
	System.out.println(s);
	
	
}
}
