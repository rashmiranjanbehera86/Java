/**
 * 
 */

/**
 * @author rashmiranjan
 *
 */
public class Audi extends Car{

	/**
	 * @param args
	 */
	public void speed() {
		System.out.println("The speed of the audi car is 180 KPH");
	}
	
	@Override
	public void milage() {
		// TODO Auto-generated method stub
		//super.milage();
		System.out.println("The milage of the audi car is 20KM/H");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi audi = new Audi();
		audi.speed();
		audi.milage();

	}

}
