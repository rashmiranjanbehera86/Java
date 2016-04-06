package main.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Test35 {

	public static void main(String[] args) throws InterruptedException {
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("default");
		WebDriver obj = new FirefoxDriver(fp);
		obj.manage().window().maximize();
		Thread.sleep(10000);
		obj.get("https://www.tripadvisor.com");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(10000);
		obj.findElement(By.id("rdoFlights")).click();
		
	}
}
