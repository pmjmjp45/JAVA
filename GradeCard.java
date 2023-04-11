package git01;

import java.util.Arrays;
import java.util.Scanner;

public class GradeCard {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("How many students? => ");
		int number = scanner.nextInt();
		
		String[][] grades = new String[number][2];

		for (int i = 0; i < number; i++) {
			System.out.println("Enter the name");
			String name = scanner.next();
			System.out.println("Enter the score");
			String score = scanner.next();

			grades[i][0] = name;
			grades[i][1] = score;
		}
		nameAscending(grades);
		nameDescending(grades);
		scoreAscending(grades);
		scoreDescending(grades);

	}
	public static void nameAscending(String[][] grades) { 
		String nameTmp = "";  
		String scoreTmp = "";

		for (int i = 0; i < grades.length - 1; i++) {
			for (int j = i + 1; j < grades.length;j++) {
				if (grades[i][0].compareTo(grades[j][0]) > 0) { 
					nameTmp = grades[i][0];
					scoreTmp = grades[i][1];

					grades[i][0] = grades[j][0];
					grades[i][1] = grades[j][1];

					grades[j][0] = nameTmp;
					grades[j][1] = scoreTmp;

					/* 
					 * Comparing name
					 * make 'tmp' and temporarily save the data
					 * 
					 */
				}

			}
		}
		System.out.println("NAMES in ASCENDING");
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i][0] + " - " + grades[i][1]);
		}
	}
	public static void nameDescending(String[][] grades) { 
		String nameTmp = "";  
		String scoreTmp = "";

		for (int i = 0; i < grades.length - 1; i++) {
			for (int j = i + 1; j <grades.length;j++) {
				if (grades[i][0].compareTo(grades[j][0]) < 0) { 
					nameTmp = grades[i][0];
					scoreTmp = grades[i][1];

					grades[i][0] = grades[j][0];
					grades[i][1] = grades[j][1];

					grades[j][0] = nameTmp;
					grades[j][1] = scoreTmp;
				}

			}
		}
		System.out.println("NAMES in DESCENDING");
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i][0] + " - " + grades[i][1]);
		}
	}
	public static void scoreAscending(String[][] grades) { 
		String nameTmp = "";  
		String scoreTmp = "";

		for (int i = 0; i < grades.length - 1; i++) {
			for (int j = i + 1; j <grades.length;j++) {
				if (Integer.parseInt(grades[i][1]) < Integer.parseInt(grades[j][1])) { 
					nameTmp = grades[i][0];
					scoreTmp = grades[i][1];

					grades[i][0] = grades[j][0];
					grades[i][1] = grades[j][1];

					grades[j][0] = nameTmp;
					grades[j][1] = scoreTmp;

				}

			}
		}
		System.out.println("SCORES in ASCENDING");
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i][1] + " - " + grades[i][0]);
		}
	}
	public static void scoreDescending(String[][] grades) { 
		String nameTmp = "";  
		String scoreTmp = "";

		for (int i = 0; i < grades.length - 1; i++) {
			for (int j = i + 1; j <grades.length;j++) {
				if (Integer.parseInt(grades[i][1]) > Integer.parseInt(grades[j][1])) { 
					nameTmp = grades[i][0];
					scoreTmp = grades[i][1];

					grades[i][0] = grades[j][0];
					grades[i][1] = grades[j][1];

					grades[j][0] = nameTmp;
					grades[j][1] = scoreTmp;

				}

			}
		}
		System.out.println("SCORES in DESCENDING");
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i][1] + " - " + grades[i][0]);
		}
	}
}


