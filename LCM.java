package git01;
import java.util.Scanner;
public class LCM {

	/// Find the Least Common Multiple(LCM)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		if (num1 > num2) {
			if (num1 % num2 == 0) { // LCM could be the bigger number
				System.out.println(num1);
			} else {
				System.out.println(num1 * num2); // nor, multiple of two numbers
			}	
		} else if (num1 < num2) {
			if (num2 % num1 == 0) {
				System.out.println(num2);
			} else {
				System.out.println(num1 * num2);
			}

		}	else { 
			System.out.println(num1);
		}

	}
}
