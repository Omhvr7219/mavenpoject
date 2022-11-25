package EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MULTI {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f = new FileInputStream("C:\\Users\\admin\\Desktop\\DATA.xlsx");
	
//	 int s = WorkbookFactory.create(f).getSheet("Sheet1").getLastRowNum()+1;
//	System.out.println(s);
	
	 int t = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getLastCellNum();
	System.out.println(t);
	
	
	
	
}
}
