/*
 * This class will select the Element by moving the mouse to the particular element by using the method "moveToElement(WebElement webElement)
 */

package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test13 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver obj = new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("http://www.flipkart.com");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		try {
			WebElement men = obj
					.findElement(By
							.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/a/span[1]"));
			Actions a = new Actions(obj);
			a.moveToElement(men).build().perform();
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		obj.quit();

	}

}
