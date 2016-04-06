/**
 * This is the script we have witten based on the testing the sending SMS functionality 
 * using www.way2sms.com.
 * Scenario:
 * 1. Open www.way2sms.com
 * 2. Enter username and password and click on Login button,
 * 3. Select send sms link in the header
 * 4.         
 */
package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test4 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		//Initialize the firefox browser
		WebDriver obj = new FirefoxDriver();
		obj.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		obj.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		System.out.println(obj.switchTo().alert().getText());
		Thread.sleep(5000);
		obj.switchTo().alert().accept();
		Thread.sleep(5000);
		obj.findElement(By.name("username")).sendKeys("9160859008");
		Thread.sleep(5000);
		obj.findElement(By.name("password")).sendKeys("yana1234");
		Thread.sleep(5000);
		obj.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[2]/div/form/div[2]/div[1]/input")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[7]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		obj.switchTo().frame("frame");
		Thread.sleep(5000);
		obj.findElement(By.name("mobile")).sendKeys("9160859008");
		Thread.sleep(5000);
		obj.findElement(By.name("message")).sendKeys("Hello Mr.Rashmi....");
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[3]/div/form/div[2]/div[2]/input")).click();
		Thread.sleep(5000);
		String x = obj.findElement(By.xpath("/html/body/form/div[3]/div/p/span")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		obj.switchTo().defaultContent();
		//obj.switchTo().parentFrame();
		obj.findElement(By.xpath("/html/body/div[5]/div/ul/li[7]/i")).click();
		System.out.println("Successfully sign-out");
		//obj.close();
		obj.quit();
	}

}
