package git01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		String[] word = text.split(" "); // .split(" ") split the String and make array
		
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + ", ");
		}
		System.out.println();

		Arrays.sort(word, Collections.reverseOrder()); // sort in descending order
		
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + ", ");
		}
	}
}
