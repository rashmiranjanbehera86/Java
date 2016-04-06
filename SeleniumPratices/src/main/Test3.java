/**
 * 
 */
package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author rashmiranjan
 * Feb 24th class testing........
 *
 */
public class Test3 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Lunching browser
		WebDriver obj = new FirefoxDriver();
		obj.get("http://newtours.demoaut.com/");
		
		//Maximize the browser
		obj.manage().window().maximize();
		
		//Wait for 5 second for page load.
		Thread.sleep(5000);
		
		//Click on register link. It will redirect to registration page
		obj.findElement(By.linkText("REGISTER")).click();
		
		//Stating filling the registration page......
		
		//Insert the first name
		obj.findElement(By.name("firstName")).sendKeys("Rashmiranjan");
		
		//Insert the last name
		obj.findElement(By.name("lastName")).sendKeys("Behera");
		
		//Insert the phone number
		obj.findElement(By.name("phone")).sendKeys("9160859008");
		
		//Insert the email address
		obj.findElement(By.name("userName")).sendKeys("rashmiranjan.ehera86@gmail.com");
		
		//Insert address
		obj.findElement(By.name("address1")).sendKeys("Yana Software, A.P Productivity House Building,");
		obj.findElement(By.name("address2")).sendKeys("Plot No: 87, Road No. 2 Banjara Hills, Hyderabad TS 500 033.");
		
		//Insert city
		obj.findElement(By.name("city")).sendKeys("Hyderabad");
		
		//Insert state/province
		obj.findElement(By.name("state")).sendKeys("TS");
		
		//insert postal code
		obj.findElement(By.name("postalCode")).sendKeys("500018");
		Thread.sleep(3000);
		
		//select country from the list box
		Select s = new Select(obj.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		//s.selectByIndex(index);
		//s.selectByValue(value);
		
		//Insert user name
		obj.findElement(By.name("email")).sendKeys("rashmiranjan.behera86@gmail.com");
		
		//insert password
		obj.findElement(By.name("password")).sendKeys("yana1234");
		
		//re-enter the password
		obj.findElement(By.name("confirmPassword")).sendKeys("yana1234");
		
		//Click on register button using linktext method
		obj.findElement(By.name("register")).click();
		
		System.out.println("Successfully registered...........");
		
		

	}

}
