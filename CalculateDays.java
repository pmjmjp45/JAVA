package git01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculateDays {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day 1(yyyymmdd) => ");
		String day1 = sc.next();
		System.out.println("Enter the day 2(yyyymmdd) => ");
		String day2 = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		//String -> SimpleDateFormat -> Date
		Date date1 = sdf.parse(day1);
		Date date2 = sdf.parse(day2);

		// calculate days gap in milliseconds
		//.getTime() count time in 'seconds'
		long diffSec = (date1.getTime() - date2.getTime()) / 1000; 
		long diffDays = (diffSec / (24 * 60 * 60)); 

		if (diffDays < 0) {
			System.out.println("The difference between two dates is "+ -1 * diffDays);
		} else {
			System.out.println("The difference between two dates is "+ diffDays);
		}

	}

}

