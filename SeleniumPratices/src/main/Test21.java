/**
 * 
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author rashmiranjan
 *
 */
public class Test21 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("default");		
		WebDriver obj = new FirefoxDriver(fp);
		obj.manage().window().maximize();
		obj.get("http://site21.way2sms.com/content/index.html");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		System.out.println("Capture the Placeholder......:"+obj.findElement(By.id("mlocator")).getAttribute("placeholder"));
		obj.findElement(By.id("username")).sendKeys("587496857");
		Thread.sleep(5000);
		obj.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		if(ExpectedConditions.alertIsPresent()!=null){
			System.out.println("Test case passed");
		}
		obj.switchTo().alert().accept();
		Thread.sleep(5000);
		obj.quit();
	}

}
