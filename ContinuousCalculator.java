package git01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContinuousCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		int mean = 0;
		int max = 0;
		int min = Integer.MAX_VALUE; // to compare minimum number, use bigggggggg number

		while (true) { // never ending loop
			Scanner scanner = new Scanner(System.in);
			
			try { // use 'try-catch' to continue even though excepetion errors 
				int input = scanner.nextInt();
				count++;
				sum = sum + input;
				mean = sum / count;
				max = Math.max(max, input);	
				min = Math.min(min, input);

				System.out.print("Result : " + count);
				System.out.print(" - Max " + max);
				System.out.print(", Min " + min);
				System.out.println(", Mean " + mean);
				
			} catch (InputMismatchException e) {
				System.out.println("Press only numbers");
			} catch (Exception e) { // Put general exception at the end
				System.out.println("error!");
			}
	
		}

	}		
}
