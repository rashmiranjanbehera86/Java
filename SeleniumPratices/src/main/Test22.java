/**
 * 
 */
package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author rashmiranjan
 *
 */
public class Test22 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("..//SeleniumPratices//src//test.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInput);
		String url = properties.getProperty("url");
		System.out.println("The URL is: "+url);
		
	}

}
