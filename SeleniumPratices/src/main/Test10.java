/**
 * 
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author rashmiranjan
 *
 */
public class Test10 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("q")).sendKeys("KALAM");
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
	}

}
