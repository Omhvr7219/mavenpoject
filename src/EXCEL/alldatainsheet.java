package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class alldatainsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream ft = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
		Sheet ns=WorkbookFactory.create(ft).getSheet("Sheet1");
    int	row = ns.getLastRowNum();
    
    for (int i=0;i<=row;i++)
    	
    	{
    	
    	int col =ns.getRow(i).getLastCellNum()-1;
    			
    		for (int j=0;j<=col;j++)	
    		{
    			String value= ns.getRow(i).getCell(j).getStringCellValue();
    					System.out.print(value+" \t"  );
    		}
    			
    			System.out.println();
    	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
