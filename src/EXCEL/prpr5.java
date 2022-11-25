package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prpr5 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	int rs = sh.getLastRowNum();
	for(int r=0;r<=rs;r++)
	{
		int cs = sh.getRow(0).getLastCellNum()-1;
		for(int c=0;c<=cs;c++)
		{
			CellType ct = sh.getRow(r).getCell(c).getCellType();
			if(ct==CellType.NUMERIC) 
			{
				double bl = sh.getRow(r).getCell(c).getNumericCellValue();
				long il=(long) bl;
				System.out.println(il+"  ");
			}
			 if(ct==CellType.BOOLEAN) 
			{
				System.out.print(sh.getRow(r).getCell(c).getBooleanCellValue()+"\t");
			}
			 if(ct==CellType.STRING) 
			{
				System.out.print(sh.getRow(r).getCell(c).getStringCellValue()+"\t");
				
			}
		}System.out.println();
			
		}
		
	}

	
	
	
}

