import java.lang.reflect.Method;

import org.openqa.selenium.By;

/**
 * Test the successfully logged in functionality
 */

/**
 * @author rashmiranjan
 *
 */
public class Test1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Test1 test1 = new Test1();
		Method[] methods = test1.getClass().getMethods();
		System.out.println(methods.length);
		for(int i=0;i<methods.length;i++){
			System.out.println(methods[i].getName());
		}
		/*Reusable.lunch();
		Reusable.loggedIn("rashmiranjan.yanasoftware", "yana1234");
		if(Reusable.obj.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).isDisplayed()){
			System.out.println("Test Passed");
		}else{
			System.out.println("Test Failed");
		}
		Reusable.loggedOut();
		Reusable.close();
*/
	}
	
	void test1(){
		System.out.println("Accepted1");
	}
	void test2(){
		System.out.println("Accepted2");
	}
	void test3(){
		System.out.println("Accepted3");
	}
	void test4(){
		System.out.println("Accepted4");
	}
	void test5(){
		System.out.println("Accepted5");
	}
}
