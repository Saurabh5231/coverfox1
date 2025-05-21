package Commanlyusedmethod;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamicclassforexcelreading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			FileInputStream file = new FileInputStream("D:\\excel\\excelforreading.xlsx");
					
					Sheet mysheet = WorkbookFactory.create(file).getSheet("Data");
					for (int i=0;i<=2;i++)
					{
						String row1data = mysheet.getRow(0).getCell(i).getStringCellValue();
					System.out.print(row1data+" ");
					}
			
	}

}
