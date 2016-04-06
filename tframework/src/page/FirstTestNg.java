package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTestNg {
	
	public static String applicationUrl = "https://www.google.co.in/";
	
	
	@Test
	public void executeSessionOne(){
		  WebDriver obj=new FirefoxDriver();
		  obj.get(applicationUrl);
		  String actual = obj.getTitle();
		  obj.quit();
		  System.out.println(actual);
		  Assert.assertEquals(actual, "Google");
		
	}
	
  @Test
  public void executeSessionTwo() {
	  WebDriver obj=new FirefoxDriver();
	  obj.get(applicationUrl);
	  String actual = obj.getTitle();
	  obj.quit();
	  System.out.println(actual);
	  Assert.assertEquals(actual, "Google");
  }
  
}
