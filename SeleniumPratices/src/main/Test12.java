/**
 * RIght click in the webElement
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author rashmiranjan
 *
 */
public class Test12 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new FirefoxDriver();
		
		obj.manage().window().maximize();
		obj.get("http://docs.seleniumhq.org");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		obj.findElement(By.linkText("Download")).click();
		Thread.sleep(5000);
		WebElement e = obj.findElement(By.xpath("/html/body/div/div[2]/div[2]/table[1]/tbody/tr[1]/td[4]/a"));
		Actions a = new Actions(obj);
		Thread.sleep(5000);
		int loop =0;
		for(loop=0;loop<5;loop++){
			a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		//rightclick on the application
		a.contextClick(e).build().perform();
		Thread.sleep(5000);

		obj.close();
	}

}
