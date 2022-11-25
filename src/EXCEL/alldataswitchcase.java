package EXCEL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class alldataswitchcase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
		Sheet sh = WorkbookFactory.create(fs).getSheet("Sheet1");
	    int rowsize=sh.getLastRowNum();
		for (int i=0;i<=rowsize;i++)
		{	   int colsize = sh.getRow(i).getLastCellNum()-1;
		       for(int j=0;j<=colsize;j++)
		{            Cell CV=sh.getRow(i).getCell(j);
		    	   switch( CV.getCellType())
		    	   {
		    	   case STRING : System.out.println(CV.getStringCellValue()+"\t");
		    
		    	   break;
		    	   case NUMERIC : System.out.print(CV.getNumericCellValue()+"\t");
		    	   break;
		    	   case BOOLEAN : System.out.println(CV.getNumericCellValue()+"\t");
		    	   break;
		    	   default :
		    	   System.out.println("invalid data");
		    	   }
		    	   System.out.println(" ");}
		    	   
		}
		}
	}