/**
 * 
 */
package main;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * @author rashmiranjan
 *
 */
public class Test18 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws IOException, AWTException {
		Runtime.getRuntime().exec("Path of the executable file");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);

	}

}
