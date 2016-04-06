import java.util.Scanner;


public class Test2 {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the palindrome: ");
		
		Test2 test2 = new Test2();
		test2.palindrome(Integer.parseInt(scanner.nextLine()));

	}
	
	public void palindrome(int numbers){
		System.out.println(".........The palindrome.........");
		int a = 0;
		for(int i = 0;i<numbers;i++){
			for(int j=1;j<i;j++){
				System.out.print(j+a);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}

}
