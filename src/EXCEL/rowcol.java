package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowcol {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream ft = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet ns=WorkbookFactory.create(ft).getSheet("Sheet1");
//	int rs=ns.getRow(1).getLastCellNum()-1;
//	for (int i = 0;i<=rs;i++)
//	
//	{
//		String L=ns.getRow(1).getCell(i).getStringCellValue();
//		System.out.println(L);
//	}
	
	
	int rsz=ns.getLastRowNum();
	for(int i=0;i<=rsz;i++ )
	{
	String	po=ns.getRow(i).getCell(1).getStringCellValue();
		System.out.println(po);
		
	}
	
	
	
	
	
	
}
}
