package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prpr4 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

	int rs = sh.getLastRowNum();
for(int i =0;i<=rs;i++)
{

    int cs = sh.getRow(0).getLastCellNum()-1;
	
    for(int j =0;j<=cs;j++)
    {
    	CellType ct = sh.getRow(i).getCell(j).getCellType();
    	if (ct==CellType.BOOLEAN)
    	{
    		System.out.print(sh.getRow(i).getCell(j).getBooleanCellValue());
    	}
    	if (ct==CellType.NUMERIC)
    	{
    		System.out.print(sh.getRow(i).getCell(j).getNumericCellValue());
    	}
       if(ct==CellType.STRING)
    	{
    	   System.out.print(sh.getRow(i).getCell(j).getStringCellValue());
    	}
 
        }System.out.println();
    
    
    
	
	
}
}
}