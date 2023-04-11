package git01;

import java.util.Scanner;

public class Calculator1 {
	/*
	 * 1. Recognize the mathematical symbols
	 * 2. Print the calculated results 
	 * 
	 *  .substring(start index, end index)
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		if (input.contains("+")) {
			String piece1 = input.substring(0, input.indexOf("+"));			
			Float p1 = Float.valueOf(piece1);

			String piece2 = input.substring(input.indexOf("+") + 1);
			Float p2 = Float.valueOf(piece2);
			
			System.out.println(p1 + p2);
			
		 } else if (input.contains("-")) {
				String piece1 = input.substring(0, input.indexOf("-"));			
				Float p1 = Float.valueOf(piece1);

				String piece2 = input.substring(input.indexOf("-") + 1);
				Float p2 = Float.valueOf(piece2);
				
				System.out.println(p1 - p2);
				
		 } else if (input.contains("*")) {
				String piece1 = input.substring(0, input.indexOf("*"));			
				Float p1 = Float.valueOf(piece1);

				String piece2 = input.substring(input.indexOf("*") + 1);
				Float p2 = Float.valueOf(piece2);
				
				System.out.println(p1 * p2);
				
		 } else if (input.contains("/")) {
				String piece1 = input.substring(0, input.indexOf("/"));			
				Float p1 = Float.valueOf(piece1);

				String piece2 = input.substring(input.indexOf("/") + 1);
				Float p2 = Float.valueOf(piece2);
				
				System.out.println(p1 / p2);
			
		 } else {
			 	System.out.println("error!");
		 }
	}
}
