/**
 * 
 */
package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author rashmiranjan
 *
 */
public class NaukriSendEmail {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String userName = "indianhyd02";
		String password = "azsxdcfvgbhn";
		
		WebDriver obj = new FirefoxDriver();
		obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		obj.get("https://login.recruit.naukri.com");
		
		Thread.sleep(5000);
		obj.manage().window().maximize();
		obj.findElement(By.name("username")).sendKeys(userName);
		obj.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(5000);
		//Click on SignIn button
		obj.findElement(By.xpath("/html/body/div[6]/form/div/div/div/div/div[2]/div[4]/button")).click();
		Thread.sleep(5000);
		obj.findElement(By.linkText("BULKSMS")).click();
		Thread.sleep(10000);
		String currentURL = obj.getCurrentUrl();
		if(currentURL.contains("modifySearchAgent")){
			obj.findElement(By.partialLinkText("Reset")).click();
			Thread.sleep(5000);
			obj.findElement(By.name("submit")).click();
		}
		obj.findElement(By.id("chkAllT")).click();
		Thread.sleep(5000);
		obj.findElement(By.id("mailMenu")).click();
		System.out.println("Clicked on mail menu");
		Thread.sleep(5000);
		obj.findElement(By.xpath("//form[@id='mailMenu']//li[.='Send Email']")).click();
		Thread.sleep(5000);
		Select s = new Select(obj.findElement(By.id("savedTemp")));
		s.selectByVisibleText("MARCC16");
		Thread.sleep(5000);
		obj.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/form/div[4]/div/span[1]/input")).click();
		Thread.sleep(5000);
		obj.findElement(By.name("send")).click();
		Thread.sleep(5000);
		obj.findElement(By.name("noprompt")).click();
		Thread.sleep(5000);
		obj.findElement(By.className("submitMain")).click();
		System.out.println("Success");
		int pagination = 0;
		for(int i =0;i<98;i++){
		try{
			if(pagination>i){
				Thread.sleep(10000);
				int a = obj.findElements(By.name("pageNo")).size();
				obj.findElements(By.name("pageNo")).get(a-1).click();
				continue;
			}	
			System.out.println("Email send successfully = "+pagination);
			pagination = pagination+1;
			Thread.sleep(10000);
			obj.findElement(By.id("chkAllT")).click();
			Thread.sleep(5000);
			obj.findElement(By.id("mailMenu")).click();
			System.out.println("Clicked on mail menu");
			Thread.sleep(5000);		
			obj.findElement(By.xpath("//form[@id='mailMenu']//li[.='Send Email']")).click();
			Thread.sleep(5000);
			Thread.sleep(10000);
			int a = obj.findElements(By.name("pageNo")).size();
			obj.findElements(By.name("pageNo")).get(a-1).click();
		}catch(Exception e){
			
			obj.get("https://login.recruit.naukri.com");
			Thread.sleep(5000);
			Thread.sleep(5000);
			obj.findElement(By.linkText("BULKSMS")).click();
			Thread.sleep(10000);
			String currentURL1 = obj.getCurrentUrl();
			if(currentURL1.contains("modifySearchAgent")){
				obj.findElement(By.partialLinkText("Reset")).click();
				Thread.sleep(5000);
				obj.findElement(By.name("submit")).click();
			}
		}
		
		}
		//obj.quit();

	}

}
