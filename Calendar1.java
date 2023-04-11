package git01;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year => ");
		int year = sc.nextInt();
		System.out.print("Enter the month => ");
		int month = sc.nextInt();
		
		cal.set(year,  month -  1, 1); // set the year and month(***month starts with '0', so should subtract 1)

		System.out.println("Sun\tMon\tTues\tWed\tThurs\tFri\tSat");
			
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // the last day of the month
		int yoil = cal.get(Calendar.DAY_OF_WEEK); //the first day of the week (SUN=0, SAT=6)
		
		for (int i = 1; i <= maxDay; i++) { 
			if (i == 1) {
				for (int j = 1; j < yoil; j++) { // should print blank before the first day
					System.out.print("\t");
				}
			}
			System.out.print(i + "\t"); 
			if (yoil % 7 == 0) { // new line after the Saturday
				System.out.println();
			}
			yoil++; 
		}
	}

}

