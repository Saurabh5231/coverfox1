package Excel_reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.SheetUtil;

public class Excel_row_column_reading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\testexcel.xlsx");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				

			//	System.out.println(data+" ");
			}

		}

		System.out.println();

	}

}
