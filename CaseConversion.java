package git01;
import java.util.Scanner;
public class CaseConversion {

	//////////////////////a -> A , A -> a
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		for(int i = 0; i < input.length(); i++) { // for all alphabets of the 'input'
			int number = input.charAt(i); // ASCII number of the alphabet
			
			if (number >= 65 && number <= 90) { // If it is a capital letter
				System.out.print((char)(number + 32)); // convert it to small letter
			} else if (number >= 97 && number <= 122) { // vice versa
				System.out.print((char)(number - 32));
			} else {
				System.out.print((char)number); // if it is not alphabet, print the same
			}
		}

	}
}
