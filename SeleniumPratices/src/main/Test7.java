/**
 * 2nd Mar 2016
 * Here it contains the testing of navigate(),cookies(), implicityWait()
 */
package main;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test7 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the webDriver
		WebDriver obj = new FirefoxDriver();
		
		//Lunch google.com
		obj.navigate().to("http://www.google.com");
		//implicity wait
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Open youtube.com using navigate().to()
		obj.navigate().to("http://www.youtube.com");
		Thread.sleep(5000);
		//Navigate Back
		obj.navigate().back();
		Thread.sleep(5000);
		//Navigate forword
		obj.navigate().forward();
		Thread.sleep(5000);
		//Refresh the page
		obj.navigate().refresh();
		//Check the cookies
		Set<Cookie> cooki = obj.manage().getCookies();
		System.out.println("Cookie size...... = "+cooki.size());
		obj.manage().deleteAllCookies();
		System.out.println("After deleting the cookie size is ="+obj.manage().getCookies().size());
		obj.close();
		
	}

}
