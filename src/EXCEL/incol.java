package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class incol {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream ft= new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
		
	Sheet sh=	WorkbookFactory.create(ft).getSheet("Sheet1");
	
	int size = sh.getLastRowNum();
	
	for(int i = 0;i<=size;i++)
		
		
	{
		
		String k = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(k);
		
		
	}	
		
		
		
		
		
	}

}
