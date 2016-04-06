/**
 * 
 */
package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 * Check the Alert method uses
 *
 */


public class Test5 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new FirefoxDriver();
		obj.get("http://site23.way2sms.com/content/index.html");
		Thread.sleep(5000);
		obj.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		System.out.println(obj.switchTo().alert().getText());
		Thread.sleep(5000);
		obj.switchTo().alert().accept();
		//obj.switchTo().alert().dismiss();
		System.out.println("Successfully closed on web alert");
		obj.quit();

	}

}
