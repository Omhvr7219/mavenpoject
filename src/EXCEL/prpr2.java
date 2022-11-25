package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prpr2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int rowsize = sh.getRow(0).getRowNum();
	for(int r=0;r<=rowsize;r++)
	{
		String value = sh.getRow(r).getCell(0).getStringCellValue();
		System.out.println(value);
	}
}
}
