package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class EX1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\gmeet test cases.xlsx");// to select file location
//		Workbook book = WorkbookFactory.create(file) ;// to open xcel file
//		Sheet sh = book.getSheet("GMEET");//to select sheet
//		Row re = sh.getRow(0);//to select row
//		Cell cl = re.getCell(0); // to select cell using row's variable
//		String  value = cl.getStringCellValue();// to get string value in a cell
//		Row ro = sh.getRow(0);
//		Cell cll = ro.getCell(1);
//		String  value1 = cll.getStringCellValue();
//		System.out.println(value1);
//		
		String s =WorkbookFactory.create(file).getSheet("GMEET").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(s);
		
	}

}
