package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet("Actors").getRow(1).createCell(1);
		c.setCellValue("Sahana");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajat burnwal\\Desktop\\TestData.xlsx");
		wb.write(fos);
		
	}

}
