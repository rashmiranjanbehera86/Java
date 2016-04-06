/**
 * 
 */

/**
 * @author rashmiranjan
 *
 */
public class FabonicsSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int firstNumber=0,secondNumber=1,thirdNumber,count=10;
		for(int i =0; i<count; i++){
			thirdNumber = firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			System.out.println(thirdNumber+" ");
		}

	}

}
