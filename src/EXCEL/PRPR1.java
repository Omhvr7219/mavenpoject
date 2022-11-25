package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PRPR1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
//	Workbook book = WorkbookFactory.create(file);
//  Sheet	SH=book.getSheet("Sheet1");
//	String value = SH.getRow(0).getCell(0).getStringCellValue();
	int value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getRowNum();
	System.out.println(value);
	
	
	
	
	
}
}
