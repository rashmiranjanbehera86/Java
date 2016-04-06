/**
 * 
 */
package main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 *Test for browsers
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver obj = new FirefoxDriver();
		//WebDriver obj = new ChromeDriver();
		
		obj.get("http://newtours.demoaut.com/");
		obj.close();
		System.out.println("FireFox browser supporting......");
		
		
	}

}
