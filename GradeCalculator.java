package git01;

import java.util.Scanner;

public class GradeCalculator {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeCalculator main = new GradeCalculator();

		System.out.print("How many class did you take? => ");
		int number = scanner.nextInt();

		main.calGrades(main.inputUnit(number), main.inputGrade(number));

	}
	//unit ÀÔ·Â
	public int[] inputUnit(int number) { 
		int[] units = new int[number];
		
		System.out.println("Enter the units of the class in order");
		for (int i = 0; i < number; i++) {
			units[i] = scanner.nextInt();
		}
		return units;
	}
	//ÇÐÁ¡ ÀÔ·Â 
	public float[] inputGrade(int number) {

		float[] grades = new float[number];
		
		System.out.println("Enter the grades of the class in order\nPress A+, A0, B+, B0, C+, C0, or F");
		for (int i = 0; i < number; i++) {
			String grade = scanner.next();

			if (grade.equals("A+")) {
				grades[i] = 4.5f;
			} else if (grade.equals("A0")) {
				grades[i] = 4.0f;
			} else if (grade.equals("B+")) {
				grades[i] = 3.5f;
			} else if (grade.equals("B0")) {
				grades[i] = 3.0f;
			} else if (grade.equals("C+")) {
				grades[i] = 2.5f;
			} else if (grade.equals("C0")) {
				grades[i] = 2.0f;
			} else if (grade.equals("F")) {
				grades[i] = 0.0f;
			} else {
				System.out.println("error! Press A+, A0, B+, B0, C+, C0, or F");
				break;
			}
		}
		return grades;
	}
	public void calGrades(int[] units, float[]grades) {
		float sum = 0;
		int totalUnit = 0;
		
		for (int i = 0; i < units.length; i++) {
			sum += units[i] * grades[i];
			totalUnit += units[i];
		}
		float avg = sum / totalUnit;
		
		System.out.println("Your grades is : " + avg);
	}
}

