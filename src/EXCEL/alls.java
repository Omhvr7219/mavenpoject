package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class alls {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream g =  new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	
	Sheet s=WorkbookFactory.create(g).getSheet("Sheet1");
	
int	Rowsize =  s.getLastRowNum();

for (int i=0;i<=Rowsize;i++) {
	 int colsize = s.getRow(i).getLastCellNum()-1;
	 for(int j =0;j<=colsize;j++)
	 { Cell CV = s.getRow(i).getCell(j);
		CellType ct = s.getRow(i).getCell(j).getCellType();
		
		
		
		if (ct==CellType.STRING)
			System.out.print(CV.getStringCellValue()+"\t");
		if (ct==CellType.BOOLEAN)
			System.out.print(CV.getBooleanCellValue()+"\t");
		
		if (ct==CellType.NUMERIC)
			System.out.print(CV.getNumericCellValue()+"\t");
		 
		 
	 }	 
		 
		 System.out.println();
	 
	 
			 
			 
			 
			 
			 
			 
			 
			 
}
	
	
	
	
	
	
}
}
