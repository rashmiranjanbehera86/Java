/**
 * This class derives the uses of window() and frame() operation
 */
package main;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test6 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver obj = new FirefoxDriver();
		
		//Wait properties
		obj.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Scenario:
		//1. Open the https://www.infosys.com/careers/ 
		obj.get("https://www.infosys.com/careers/");
		obj.manage().window().maximize();
		
		//2. Click on job opportunities
		obj.findElement(By.linkText("JOB OPPORTUNITIES")).click();
		
		//3. Click on search for jobs in india
		obj.findElement(By.linkText("SEARCH FOR JOBS IN INDIA")).click();
		
		//4. Switch to the other window and start operation
		//In Experienced Professionals click on "Click here to view jobs"		
		ArrayList<String> a = new ArrayList<>(obj.getWindowHandles());
		System.out.println("...a.get(1)..."+a.get(1));
		obj.switchTo().window(a.get(1));
		obj.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div/div[2]/a[1]")).click();
		
		//5. Click on complete profile
		obj.switchTo().frame(obj.findElement(By.id("create-profile")));
		obj.findElement(By.id("anchorredirect")).click();
		obj.switchTo().defaultContent();
		
		//6. Select experience professional radio button
		obj.findElement(By.name("ctl00$rblType")).click();
		
		//7. Click on continue button
		obj.findElement(By.id("lnkContinue")).click();
		
		//8. Enter email id
		obj.findElement(By.id("txtLoginEmail")).sendKeys("ras@gmail.com");
		
		//9. Enter password
		obj.findElement(By.id("txtLoginPassword")).sendKeys("abcf");
		
		//10. Click on login button
		obj.findElement(By.id("lnkLoginCand")).click();
		
		//11. Click on new register button
		obj.findElement(By.id("lnkRegister")).click();
		
		//12. Capture the value "Register" and compare the register page loaded or not
		
		//Close the browser
		obj.quit();
	}

}
