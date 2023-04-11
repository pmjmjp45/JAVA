package git01;

import java.util.Scanner;

public class changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Payment: ");
		int paidMoney = scanner.nextInt();
		System.out.print("Price: ");
		int charge = scanner.nextInt();
		int change = paidMoney - charge;
		System.out.println("Here is the change: " + change);
		
		int money10000 = change / 10000;
		int money5000 = (change - (money10000*10000)) / 5000;
		int money1000 = (change - (money10000*10000) - (money5000*5000)) / 1000;
		int money500 = (change - (money10000*10000) - (money5000*5000) - (money1000*1000)) / 500;
		int money100 = (change - (money10000*10000) - (money5000*5000) - (money1000*1000) - (money500*500)) / 100;
		int money50 = (change - (money10000*10000) - (money5000*5000) - (money1000*1000) - (money500*500) - (money100*100)) / 50;
		int money10 = (change - (money10000*10000) - (money5000*5000) - (money1000*1000) - (money500*500) - (money100*100) - (money50*50)) / 10;
		
		System.out.println("10000 - " + money10000);
		System.out.println("5000 - " + money5000);
		System.out.println("1000 - " + money1000);
		System.out.println("500 - " + money500);
		System.out.println("100 - " + money100);
		System.out.println("50 - " + money50);
		System.out.println("10 - " + money10);

	}

}
