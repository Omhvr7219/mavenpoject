package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex {
public static void main(String[] args) throws IOException {
	FileInputStream f = new FileInputStream("C:\\Users\\admin\\Desktop\\gmeet test cases.xlsx");
	
	Workbook bk= WorkbookFactory.create(f);
	Sheet st = bk.getSheet("GMEET");
	Row rw = st.getRow(2);
	Cell cl= rw.getCell(0);
	
	String gs= cl.getStringCellValue();
	
	System.out.println(gs);
	
	
	
	
}
}
