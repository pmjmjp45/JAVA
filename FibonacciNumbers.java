package git01;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(0);
		number.add(1);
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

		for (int i = 0; i < input - 1; i++) {
			number.add(number.get(i) + number.get(i + 1));
		}

		for (int i = 0; i < input; i++) {
			System.out.println(number.get(i));
		}

	}

}
