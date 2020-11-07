import java.util.Scanner;

public class Exercise3_5 {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		int x = sc.nextInt();
		System.out.println("Enter double number: ");
		double y = sc.nextDouble();
		System.out.println("Enter string: ");
		String z = sc.next();


		System.out.println("integer is: " + x);
		System.out.println("double is: " + y);
		System.out.println("string is: " + z);


		sc.close();
	}
}