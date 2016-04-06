/**
 * Reading from excel file
 * 
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author rashmiranjan
 *
 */
public class Test23 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws BiffException 
	 */
	
	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("//home//rashmiranjan//Documents//RashmiPratices//SeleniumPratices//src//test.xls");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook wb = Workbook.getWorkbook(fileInput);
		
		Sheet sheet = wb.getSheet("sheet1");
		//Cell cellValue = sheet.getCell(0, 0);
		String value = sheet.getCell(0, 0).getContents();
		System.out.println(value);
	}

}
