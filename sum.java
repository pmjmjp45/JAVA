package git01;

import java.util.Scanner;

public class sum{

	public static void main(String[] args) {
		// want to add all integers from 1 to 'input'
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int sum = 0;
		
		// add one by one with for-loop
		for (int i = 1; i <= input; i++) {
			sum = sum + i; 
		}
		System.out.println(sum);
	}

}
