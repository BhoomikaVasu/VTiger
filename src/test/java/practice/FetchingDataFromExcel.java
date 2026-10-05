package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

//		FileInputStream fis = new FileInputStream("path of the excel file");
//		Workbook wb = WorkbookFactory.create(fis);
//		Cell c = wb.getSheet("Actors").getRow(0).getCell(0);
//		DataFormatter df = new DataFormatter();
//		String value = df.formatCellValue(c);
//		System.out.println(value);
		ExcelUtility eutil = new ExcelUtility();
		String value = eutil.getDataFromExcel("Actors", 5, 2);
		System.out.println(value);
		String value2 = eutil.getDataFromExcel("Flower", 3, 2);
		String value3 = eutil.getDataFromExcel("Animal", 4, 4);
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
