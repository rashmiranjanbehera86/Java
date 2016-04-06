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
 * Actions class with Enter different lines of text in the body of message. Use gmail email sending.
 */
public class Test9 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//Lunch the www.google.com
		driver.get("https://www.google.co.in/");
		
		//Wait for page load use implicity wait
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		//Click on Gmail link
		driver.findElement(By.linkText("Gmail")).click();
		
		//Enter email id
		driver.findElement(By.name("Email")).sendKeys("rashmiranjan.yanasoftware");
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		
		//Enter password
		driver.findElement(By.name("Passwd")).sendKeys("yana1234");
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		
		//Click on compose email
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id=':it']/div/div")).click();
		
		//To
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("rashmiranjan.behera86@gmail.com");
		Thread.sleep(5000);
		
		//TODO: Need to implement CC and BCC
		
		//Subject
		driver.findElement(By.name("subjectbox")).sendKeys("Test email");
		
		//Insert body
		//To insert multiple lines we will use action class
		Actions a = new Actions(driver);
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys("Hi Friends,").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("Hope you are doing good!",Keys.ENTER).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("I am sending this email form the automation.",Keys.ENTER,Keys.ENTER,"Please ignore this email!").build().perform();
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(10000);
		a.sendKeys(Keys.ENTER).build().perform();
						
		//Sign-out
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		//Close the browser
		driver.close();

	}

}
