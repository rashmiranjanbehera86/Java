/**
 * Actions class mouse movement.
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author rashmiranjan
 *
 */
public class Test11 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new FirefoxDriver();
		obj.manage().window().maximize();
		
		obj.get("http://www.flipkart.com/");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		int x = obj.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[6]/a/span")).getLocation().getX();
		int y = obj.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[6]/a/span")).getLocation().getY();
		
		Actions a = new Actions(obj);
		a.moveByOffset(x, y).build().perform();
		Thread.sleep(5000);
		obj.findElement(By.linkText("PC Games")).click();
		Thread.sleep(5000);
		obj.findElement(By.linkText("Far Cry Primal (for PC)")).click();
		Thread.sleep(500);
		obj.close();
		
	}

}
