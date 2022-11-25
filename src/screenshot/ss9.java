package screenshot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ss9 {
public static void main(String[] args) throws IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\gmeet test cases.xlsx");
	Workbook book = WorkbookFactory.create(f);
	Sheet s =  book.getSheet("GMEET");
	Row r = s.getRow(6);
	Cell c = r.getCell(0
			);
	String st = c.getStringCellValue();
	System.out.println(st);
	
	
	
	
	
	
}
}
