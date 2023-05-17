package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prmtrzn {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int rs = sh.getLastRowNum();
	int cs= sh.getRow(0).getLastCellNum()-1;
	for(int i =0;i<=rs;i++) {
		for(int j=0;j<=cs;j++) {
			 CellType CT = sh.getRow(i).getCell(j).getCellType();
			 if(CT==CellType.BOOLEAN) {
				 System.out.print(sh.getRow(i).getCell(j).getBooleanCellValue()+"  ");
			 }
			 else  if(CT==CellType.NUMERIC) {
				 System.out.print(sh.getRow(i).getCell(j).getNumericCellValue()+"  ");
				 
			 }
			 else  if(CT==CellType.STRING) {
				 System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"  ");
			 
			
		}
		}System.out.println();
	
	}
	 
	}}

	
