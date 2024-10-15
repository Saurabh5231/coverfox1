package Commanlyusedmethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Classforexcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream file = new FileInputStream("D:\\excel\\excelforreading.xlsx");
		
		String data = WorkbookFactory.create(file).getSheet("Data").getRow(0).getCell(1).getStringCellValue();
	
		System.out.println(data);
		
	}
	
	
	

}
