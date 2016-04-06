/**
 * This piece of code use for how to handle the web table scenario.
 */

package main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author rashmiranjan
 *
 */
public class Test14 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver obj = new FirefoxDriver();
		obj.manage().window().maximize();
		obj.get("https://accounts.google.com/ServiceLogin");
		obj.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		obj.findElement(By.xpath(".//*[@id='Email']")).sendKeys(
				"rashmiranjan.yanasoftware");
		obj.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("yana1234");
		obj.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath(".//*[@id='gb23']/span[2]")).click();
		Thread.sleep(5000);

		int j;
		int emailRead = 0;
		for (j = 0; j < 1; j++) {
			WebElement table = obj
					.findElement(By
							.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div[7]/div/div[1]/div[2]/div/table/tbody"));
			List<WebElement> tr = table.findElements(By.tagName("tr"));

			int i;
			for (i = 0; i < tr.size(); i++) {
				emailRead +=1;
				List<WebElement> td = tr.get(i).findElements(By.tagName("td"));
				System.out.println("The subject of " + emailRead + " emails is : "
						+ td.get(5).getText());				
				
			}
			
			
			obj.findElement(
					By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[3]/img"))
					.click();
			Thread.sleep(10000);
		}
		System.out.println("Total email subject captured is = "+emailRead);
		obj.quit();
	}

}
