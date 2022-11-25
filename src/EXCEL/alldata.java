package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class alldata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	Sheet sh = WorkbookFactory.create(fs).getSheet("Sheet1");
    int rowsize=	sh.getLastRowNum();
	for (int i=0;i<=rowsize;i++)
	{	   int colsize = sh.getRow(i).getLastCellNum()-1;
	       for(int j=0;j<=colsize;j++)
	       { CellType ct= sh.getRow(i).getCell(j).getCellType();
	
	    	if (ct==CellType.STRING)
	    	{
	    		System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"\t");
	    	}
	        if   (ct==CellType.NUMERIC)

    	     {
    		System.out.print(sh.getRow(i).getCell(j).getNumericCellValue()+"\t");
    	     }
	    
	         if   (ct==CellType.BOOLEAN)

    	     {
    		System.out.print(sh.getRow(i).getCell(j).getBooleanCellValue()+"\t");
    	     }
	    
	         } System.out.println();
	    
	
}
}
}