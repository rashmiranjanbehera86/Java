/**
 * 
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test17 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver obj;
		
		obj = new FirefoxDriver();
		obj.get("http://www.google.com");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		String title = obj.getTitle();;
		System.out.println("Firefox title: "+title);
		Thread.sleep(10000);
		obj.quit();
		
		System.getProperty("webdriver.chrome.driver", "SeleniumPratices/BrowserDriver/chromedriver");
		obj = new ChromeDriver();
		obj.get("http://www.google.com");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		title = obj.getTitle();
		System.out.println("Chrome title: "+title);
		Thread.sleep(10000);
		obj.quit();
				
		
		

	}

}
