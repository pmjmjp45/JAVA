package git01;

import java.util.Scanner;

public class CountAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the english text");
		String input = scanner.nextLine();

		count(input);
	}

	public static void count (String input) {
		char [] c = input.toCharArray(); 

		for (int i = 0; i < 26; i++) {
			int cnt = 0;
			for (int j = 0; j < input.length(); j++) {
				if ((int)c[j] == 65 + i || (int)c[j] == 97 + i) { // ASCII code 65 ~ Capital letter, 97 ~ small letter
					cnt++;
				}
			}
			System.out.println("the number of \"" + (char)(65 + i) + "\" is " + cnt);
		}

	}

}
