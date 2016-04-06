package main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
public class MyActions 
{
	public WebDriver obj;
	public String launch(String o,String d,String c)
	{
		if(o.equalsIgnoreCase("safari"))
		{
			obj=new SafariDriver();
		}
		else if(o.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\batch221\\drivers\\chromedriver.exe");
			obj=new ChromeDriver();
		}
		else if(o.equalsIgnoreCase("opera"))
		{
			System.setProperty("webdriver.opera.driver", "E:\\batch221\\drivers\\operadriver.exe");
			obj=new OperaDriver();
		}
		else if(o.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\batch221\\drivers\\IEDriverServer.exe");
			obj=new InternetExplorerDriver();
		}
		else
		{
			obj=new FirefoxDriver();
		}
		obj.get(d);
		return("Done");
	}
	public String wait(String o,String d,String c) throws InterruptedException
	{
		long l=Long.parseLong(d);
		Thread.sleep(l);
		return("Done");
	}
	public String input(String o,String d,String c)
	{
		By l;
		String p[]=o.split("~");
		if(p[0].equals("name"))
		{
			l=By.name(p[1]);
		}
		else if(p[0].equals("id"))
		{
			l=By.id(p[1]);
		}
		else if(p[0].equals("xpath"))
		{
			l=By.xpath(p[1]);
		}
		else if(p[0].equals("tagName"))
		{
			l=By.tagName(p[1]);
		}
		else if(p[0].equals("linkText"))
		{
			l=By.linkText(p[1]);
		}
		else if(p[0].equals("partialLinkText"))
		{
			l=By.partialLinkText(p[1]);
		}
		else if(p[0].equals("className"))
		{
			l=By.className(p[1]);
		}
		else
		{
			l=By.cssSelector(p[1]);
		}
		obj.findElement(l).sendKeys(d);
		return("Done");
	}
	public String click(String o,String d,String c)
	{
		By l;
		String p[]=o.split("~");
		if(p[0].equals("name"))
		{
			l=By.name(p[1]);
		}
		else if(p[0].equals("id"))
		{
			l=By.id(p[1]);
		}
		else if(p[0].equals("xpath"))
		{
			l=By.xpath(p[1]);
		}
		else if(p[0].equals("tagName"))
		{
			l=By.tagName(p[1]);
		}
		else if(p[0].equals("linkText"))
		{
			l=By.linkText(p[1]);
		}
		else if(p[0].equals("partialLinkText"))
		{
			l=By.partialLinkText(p[1]);
		}
		else if(p[0].equals("className"))
		{
			l=By.className(p[1]);
		}
		else
		{
			l=By.cssSelector(p[1]);
		}
		obj.findElement(l).click();
		return("Done");
	}
	public String validate_userid(String o, String d, String c)
	{
		String r;
		if(c.equals("valid") && obj.findElement(By.name("Passwd")).isDisplayed())
		{
			r="Test passed";
		}
		else if(c.equals("invalid") && obj.findElement(By.id("errormsg_0_Email")).isDisplayed())
		{
			r="Test passed";
		}
		else
		{
			r="Test failed";
		}
		return(r);
	}
	public String close(String o, String d, String c)
	{
		obj.quit();
		return("Done");
	}
}







