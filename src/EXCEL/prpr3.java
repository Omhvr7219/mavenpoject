package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prpr3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int cs = sh.getRow(0).getLastCellNum()-1;
	for(int r=0;r<=cs;r++)
	{
	String st=	sh.getRow(0).getCell(r).getStringCellValue();
	System.out.print(st+"\t");
	}
}
}
