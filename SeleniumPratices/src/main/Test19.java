/**
 * 
 */
package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 * @author rashmiranjan
 *
 */

public class Test19 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile fp = p.getProfile("default");
		WebDriver obj = new FirefoxDriver(fp);
		obj.manage().window().maximize();
		
		obj.get(" http://www.fareboom.com/SearchFromBare?olc=SFO&dlc=MNL&dd=04-07-2016&rd=04-28-2016&na=1&nc=0&cab=Y&trip=round&search=true&RefSource=KA");
		Thread.sleep(5000);
		
	}

}
