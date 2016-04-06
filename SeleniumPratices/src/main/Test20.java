/**
 * Q. Test the login functionality
 * 1. Open www.gmail.com landing page
 * 2. Test username field
 * 3. Test password field
 */

package main;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


/**
 * @author rashmiranjan
 *
 */
public class Test20 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Logger l = Logger.getLogger(Test20.class.getName());
		PatternLayout p = new PatternLayout("Time: %d Class: %c Package: %M Message: %m %n");
		FileAppender f = new FileAppender(p, "//home//rashmiranjan//Documents//RashmiPratices//SeleniumPratices//src//main//resources//server.log", true);
		l.addAppender(f);
		/*l.info("Hello Info");
		l.warn("Hello warn");
		l.error("Hello error");
		l.debug("Hello debug");
		*/
		//Enter scenario type and username
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username scenario type: ");
		String scenarioType = s.nextLine();
		System.out.println("Enter username :");
		String username = s.nextLine();
		
		
		ProfilesIni pf = new ProfilesIni();
		FirefoxProfile fp = pf.getProfile("default");
		WebDriver obj = new FirefoxDriver(fp);
		obj.manage().window().maximize();
		obj.get("https://accounts.google.com");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//Test username field
		obj.findElement(By.name("Email")).sendKeys(username);
		Thread.sleep(5000);
		obj.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		
		if(scenarioType.equalsIgnoreCase("valid") && obj.findElement(By.name("Passwd")).isDisplayed()){
			l.info("Username is exist Test case passed");
			//Test password
			System.out.println("Enter password scenario type: ");
			String passwordScenario = s.nextLine();
			System.out.println("Enter password: ");
			String password = s.nextLine();
			obj.findElement(By.name("Passwd")).sendKeys(password);
			Thread.sleep(5000);
			obj.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/input[1]")).click();
			Thread.sleep(5000);
			if(passwordScenario.equalsIgnoreCase("valid") && obj.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[1]/div/span")).isDisplayed()){
				l.info("Password is exist Test case passed");
			}else if(passwordScenario.equalsIgnoreCase("invalid") && obj.findElement(By.id("errormsg_0_Passwd")).isDisplayed()){
				l.info("Password is not exist Test case passed");
			}else{
				l.info("Password Test case Failed");
			}
		}else if(scenarioType.equals("invalid") && obj.findElement(By.id("errormsg_0_Email")).isDisplayed()){
			l.info("Username doesn't exist Test case passed");
		}else{
			l.info("Test case failed");
		}
		s.close();
		obj.quit();
	}

}
