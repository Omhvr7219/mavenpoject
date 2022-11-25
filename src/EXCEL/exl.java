package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	
		Sheet sh = WorkbookFactory.create(fs).getSheet("Sheet1");
	int k = sh.getRow(1).getLastCellNum()-1;
	 for(int i =0;i<=k;i++)
	 
	 {
		 String value = sh.getRow(1).getCell(i).getStringCellValue();
		 
		 System.out.println(value);
		//print data in a row
	 }
	 
		
		
		
		
		
	}

}
