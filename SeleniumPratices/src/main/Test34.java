/**
 * 
 */
package main;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * @author rashmiranjan
 *
 */
public class Test34 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws BiffException 
	 * @throws WriteException 
	 * @throws RowsExceededException 
	 */
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File file = new File("../SeleniumPratices/src/test.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(1);
		int rowCount = sheet.getRows();
		
		WritableWorkbook writableWorkbook = Workbook.createWorkbook(file, workbook);
		WritableSheet writableSheet = writableWorkbook.getSheet(1);
		
		for(int counter=1;counter<rowCount;counter++){
			int number1 = Integer.parseInt(sheet.getCell(0,counter).getContents());
			int number2 = Integer.parseInt(sheet.getCell(1,counter).getContents());
			int sum = number1+number2;
			Number number = new Number(2, counter, sum);
			writableSheet.addCell(number);			
		}
		writableWorkbook.write();
		writableWorkbook.close();
		workbook.close();
	}

}
