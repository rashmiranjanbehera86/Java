package main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Driver 
{
	public static void main(String[] args) throws IOException, BiffException, RowsExceededException, WriteException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		//Open excel file
		File f=new File("..//keyworddrivenframework//src//main//kwexcels.xls");
		Workbook wb=Workbook.getWorkbook(f);
		//Goto sheet1 for reading
		Sheet sh1=wb.getSheet(0); //sheet1
		int nor=sh1.getRows();
		//Goto sheet2 for reading and writing
		Sheet sh2=wb.getSheet(1); //sheet2
		int nos=sh2.getRows();
		WritableWorkbook wwb=Workbook.createWorkbook(f,wb);
		WritableSheet wsh2=wwb.getSheet(1);
		//Create collection object for all Actions/methods
		MyActions ma=new MyActions();
		Method m[]=ma.getClass().getMethods();
		//First row of sheet1 have columns names
		for(int i=1;i<nor; i++)
		{
			//get 1st column and 3rd column data of sheet1
			String tname=sh1.getCell(0,i).getContents();
			String mode=sh1.getCell(2,i).getContents();
			if(mode.equalsIgnoreCase("yes"))
			{
				//first row of sheet2 have columns names
				for(int j=1;j<nos;j++)
				{
					//get 1st column data
					String tid=sh2.getCell(0,j).getContents();
					if(tname.equalsIgnoreCase(tid))
					{
						//get 3rd, 4th, 5th and 6th columns of sheet2
						String taction=sh2.getCell(2,j).getContents();
						String objdesc=sh2.getCell(3,j).getContents();
						String testdata=sh2.getCell(4,j).getContents();
						String criteria=sh2.getCell(5,j).getContents();
						System.out.println(taction+","+objdesc+","+
								                        testdata+","+criteria);
						for(int k=0;k<m.length;k++)
						{
							System.out.println(m[k].getName());
							/*if(m[k].getName().equals(taction))
							{
								String res=(String) m[k].invoke(ma,objdesc,testdata,criteria);
								Label l=new Label(6,j,res);
								wsh2.addCell(l);
								break;
							}*/
						}
					}
				}	
			}
		}
		wwb.write(); //save excel file
		wwb.close();
		wb.close(); 
	}
}