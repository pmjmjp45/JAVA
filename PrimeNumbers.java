package git01;
import java.util.Scanner;
public class PrimeNumbers {
/*
 * Prime Number:"a whole number greater than 1 
 * that cannot be exactly divided by any whole number other than itself and 1"
 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 2; i <= num; i++) {
			int count = 0; // initializing count for new number
			
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) { // if num is divided, add count
					count++;
				}
			}
			if(count == 1) { // if divided only by itself 
				System.out.println(i); // that is the prime number
			}
		}
	}

}
