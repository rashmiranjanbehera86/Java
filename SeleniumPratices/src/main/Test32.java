/**
 * Garbage collection
 */
package main;

/**
 * @author rashmiranjan
 *
 */
public class Test32 {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		Test32 test32 = new Test32();
		System.out.println("Main method execution: "+test32.printNumber());
		test32 = null;
		test32.printNumber();
		
	}

	String printNumber(){
		String helloWorld = "Hello World";
		System.out.println("printNumber method executed: "+helloWorld);
		return helloWorld;
	}
}
