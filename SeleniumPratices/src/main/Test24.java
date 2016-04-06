package main;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Test24 {

	public static void main(String[] args) throws InterruptedException, IOException {
		Logger logger = Logger.getLogger(Test24.class.getName());
		PatternLayout patternLayout = new PatternLayout("Date: %d Class: %c Package: %M Message: %m %n");
		FileAppender fileAppender = new FileAppender(patternLayout, "..//SeleniumPratices//src//test.log", true);
		logger.addAppender(fileAppender);
		
		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("default");
		WebDriver obj = new FirefoxDriver(fp);
		obj.manage().window().maximize();
		obj.get("https://accounts.google.com/ServiceLogin");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		obj.findElement(By.id("Email")).sendKeys("rashmiranjan.yanasoftware");
		Thread.sleep(5000);
		obj.findElement(By.id("next")).click();
		Thread.sleep(5000);
		obj.findElement(By.id("Passwd")).sendKeys("yana1234");
		Thread.sleep(5000);
		obj.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		obj.findElement(
				By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a"))
				.click();
		Thread.sleep(5000);
		obj.findElement(
				By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[7]/a/span[1]"))
				.click();
		Thread.sleep(5000);
		int totalEmails = 0, unreadEmail = 0, readEmail = 0;

		WebElement table = obj
				.findElement(By
						.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div[7]/div/div[1]/div[2]/div/table/tbody"));
		List<WebElement> trows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			totalEmails += 1;
			List<WebElement> cols = trows.get(i).findElements(By.tagName("b"));
			if (cols.size() > 0) {
				unreadEmail += 1;
			} else {
				readEmail += 1;
			}
		}
		obj.quit();
		logger.info("The total number of emails: "+totalEmails);
		logger.info("The total number of un-read emails: "+unreadEmail);
		logger.info("The total number of read emails: "+readEmail);
		
	}

}
