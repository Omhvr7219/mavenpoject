package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.TakesScreenshot;

public class parametrization {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream f = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
//	Workbook book = WorkbookFactory.create(f);
//	Sheet S = book.getSheet("Sheet1");
//	
//    Row r = S.getRow(1);
//    Cell c = r.getCell(1);
//    c.getCellType();
//	System.out.println(c.getCellType());
//	double d = c.getNumericCellValue();
//	System.out.println(d);
	
              Sheet d = WorkbookFactory.create(f).getSheet("Sheet1");

              int size = d.getRow(1).getLastCellNum();

                for(int i =0;i<=size-1;i++)
                {
                	
                String str=	d.getRow(1).getCell(i).getStringCellValue();
                
                System.out.println(str);
                
                
                }


	
	
}
}
