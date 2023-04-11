package git01;

import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Write down the text");
		String text = scanner.nextLine();
		System.out.print("Enter the alphabet you want to find => ");
		String alph = scanner.next();
		
		try {
			String text2 = text.substring(0,text.indexOf(alph)); // .substring(0,.indexOf(alph)) extract from beginning to alph
			System.out.println(text2.length() + 1);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("error! No such alphabet!");
			
		} catch (Exception e) {
			System.out.println("error!");
		}

	}

}
