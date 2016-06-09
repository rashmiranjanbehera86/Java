/**
 * This piece of code use for how to handle the web table scenario.
 */

package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test15 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("https://accounts.google.com/ServiceLogin");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		obj.findElement(By.xpath(".//*[@id='Email']")).sendKeys(
				"XXXXXXXXXXXXXXXXX");
		obj.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("XXXXXXX");
		obj.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='gb23']/span[2]")).click();
		Thread.sleep(10000);

		int j;		
		for (j = 0; j < 100; j++) {
			
			obj.findElement(By.xpath("html/body/div[7]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div/div[1]/span/div")).click();
			Thread.sleep(5000);
			obj.findElement(By.xpath("html/body/div[7]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[2]/div[4]")).click();
			Thread.sleep(10000);
			obj.findElement(By.xpath("html/body/div[7]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[1]/div/div[1]/span/div")).click();
			Thread.sleep(10000);
			obj.findElement(By.xpath("html/body/div[7]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[4]/div")).click();
			Thread.sleep(10000);
		}		
		obj.quit();
	}

}
