package git01;

import java.util.Scanner;

public class Bank {
	int change = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank menu = new Bank();
		int balance = 0;

		while (true) { 

			showMenu(balance);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Press the menu button => ");
			int num = sc.nextInt();
			
			if (num == 3) { // break condition
				System.out.println("Good Bye");
				break;
			}
			
			System.out.print("Enter the amount of money => ");
			int money = sc.nextInt();

			balance = menu.calBal(num,money);
		}
	}

	public static void showMenu(int balance) {

		System.out.println("#####Menu#####");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("3. Exit");
		System.out.println("Balance : " + balance);
	} 

	public int calBal(int num, int money) {
		Scanner sc = new Scanner(System.in);

		if (num == 1) { 
			change = change + money;
		} else if (num == 2) { 
			change = change - money;

		}
		return change;
	}
}
