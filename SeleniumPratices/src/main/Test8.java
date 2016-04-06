/**
 * Testing the action class in webDriver
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
public class Test8 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
		 driver.findElement(By.id("gb_70")).click();
		 driver.findElement(By.linkText("Create account")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("rashmi432");
		 driver.findElement(By.id("LastName")).sendKeys("Behera");
		 driver.findElement(By.id("GmailAddress")).sendKeys("rashmi7685855");
		 driver.findElement(By.id("Passwd")).sendKeys("qwedcxza98s");
		 driver.findElement(By.id("PasswdAgain")).sendKeys("qwedcxza98s");
		 
		 //To select date of birth month we have to create Action Class
		 Actions obj = new Actions(driver);
		 obj.sendKeys(Keys.TAB).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 //select March we can use the below two ways
		 //1
/*		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.ENTER).build().perform();*/
		 //2
		 obj.sendKeys("March",Keys.ENTER).build().perform();
		 
		 driver.findElement(By.name("BirthDay")).sendKeys("15");
		 driver.findElement(By.name("BirthYear")).sendKeys("1985");
		
		 //Select Gender
		 obj.sendKeys(Keys.TAB).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.ENTER).build().perform();
		 //Select mobile country code
		 obj.sendKeys(Keys.TAB).build().perform();
		 Thread.sleep(5000); 
		 obj.sendKeys(Keys.DOWN).build().perform();
		 Thread.sleep(5000); 
		 obj.sendKeys("i").build().perform();
		 Thread.sleep(5000); 
		 obj.sendKeys(Keys.DOWN).build().perform();
		 Thread.sleep(5000); 
		 obj.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(5000); 
		 driver.findElement(By.name("RecoveryPhoneNumber")).click();
		 driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9898589698");
		 driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("abc@gmail.com");
		 driver.findElement(By.name("SkipCaptcha")).click();
		 obj.sendKeys(Keys.TAB).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.DOWN).build().perform();
		 obj.sendKeys(Keys.ENTER).build().perform();
		 driver.findElement(By.name("TermsOfService")).click();
		 driver.findElement(By.name("submitbutton")).click();		 

	}

}
