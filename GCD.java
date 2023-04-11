package git01;
import java.util.Scanner;
public class GCD {
/////////////Find the Greatest Common Divisor
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int gcd = 0;
		
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				gcd = i;			
			}							
		} System.out.println(gcd);
	}				
}
