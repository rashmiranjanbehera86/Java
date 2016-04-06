import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 * 
 */

/**
 * @author rashmiranjan
 *
 */
public class Reusable {
	
	static WebDriver obj;
	
	static void lunch() throws InterruptedException{
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("default");
		obj = new FirefoxDriver(fp);
		obj.get("https://accounts.google.com/ServiceLogin");
		Thread.sleep(5000);
	}
	
	static void loggedIn(String userName, String password) throws InterruptedException{
		obj.findElement(By.name("Email")).sendKeys(userName);
		Thread.sleep(5000);
		obj.findElement(By.name("signIn")).click();
		Thread.sleep(10000);
		obj.findElement(By.name("Passwd")).sendKeys(password);
		Thread.sleep(5000);
		obj.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[7]/a/span[2]")).click();
		Thread.sleep(5000);
	}
	
	static void loggedOut() throws InterruptedException{
		obj.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		Thread.sleep(5000);
	}
	
	static void close(){
		obj.close();
		obj.quit();
	}

}
