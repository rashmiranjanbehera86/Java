/**
 * This program will create a copy of a file
 */
package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author rashmiranjan
 *
 */

public class Test26 {

	/**
	 * @param args
	 * @throws 			 
	 */
	

	public static void main(String[] args) throws IOException {
		File inputFile = new File("..//SeleniumPratices//src//main//loginDetails.csv");
		File outputFile = new File("..//SeleniumPratices//src//main//outputFile.txt");
		
		FileReader fileReader = new FileReader(inputFile);
		FileWriter fileWriter = new FileWriter(outputFile);	
				
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String readLine = bufferedReader.readLine();

		while(readLine != null){
			System.out.println(readLine);
			bufferedWriter.write(readLine);
			System.out.println("Line written in the file");
			readLine = bufferedReader.readLine();
		}
		bufferedReader.close();
		bufferedWriter.close();
				
	}

}
