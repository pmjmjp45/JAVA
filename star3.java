package git01;
import java.util.Scanner;
public class star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) { //for-loop for new line
			for (int j = 1; j < i; j++) { // for-loop for blank in left side
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * (number - i) + 1; k++) { // for-loop for printing stars
				System.out.print("*");
			}
			for (int l = 1; l < i; l++) { // for loop for blank in right side
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
