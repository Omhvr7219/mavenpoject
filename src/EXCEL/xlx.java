package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlx {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream ip = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
Sheet sh=	WorkbookFactory.create(ip).getSheet("Sheet1");
	
	int colsz = sh.getRow(1).getLastCellNum()-1;
	for(int i=0;i<=colsz;i++)
	{   double l = sh.getRow(1).getCell(i).getNumericCellValue();
	long k  = (long)l; // converting double value to long
	System.out.print(k+"\t");
	
	
	
	
	
}
}}