package Utility;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization
{
	
	/*public static String getData(int row, int cell) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file=new FileInputStream("F:\\workspace\\KiteZerodha\\src\\test\\resources\\Book.xlsx");
		String value=WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}*/
	public static String getData(String Sheet,int row, int cell) throws EncryptedDocumentException, IOException  
	{
		FileInputStream file=new FileInputStream("F:\\workspace\\KiteZerodha\\src\\main\\resources\\Book.xlsx");
		String value=WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	
	
}