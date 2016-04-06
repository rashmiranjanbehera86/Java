/**
 * Java script Executor we can use to find the element
 * Click on login button on way2sms.com using javascript executor
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test16 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor)obj;
		obj.manage().window().maximize();
		
		obj.navigate().to("http://site23.way2sms.com/content/index.html");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		obj.findElement(By.id("username")).sendKeys("9160859008");				
		Thread.sleep(5000);
		obj.findElement(By.id("password")).sendKeys("yana1234");
		Thread.sleep(5000);
		
		//Using javascript executor click on the Login button
		js.executeScript("javascript:validate();");
		

	}

}
