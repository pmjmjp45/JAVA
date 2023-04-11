package git01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class NumberOfSameAlphabet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOfSameAlphabet main = new NumberOfSameAlphabet();
			
			System.out.println("Enter the first word");
			String word1 = main.input();
			System.out.println("Enter the second word");
			String word2 = main.input();

			System.out.println("The length of the first word : " + word1.length());
			System.out.println("The length of the second word : " + word2.length());

			ArrayList<Character> list1 = main.makeList(word1);
			ArrayList<Character> list2 = main.makeList(word2);

			main.sameChar(list1, list2);
		
	}

	public String input () {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}

	public ArrayList<Character> makeList(String input) {
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}
		return list;
	}

	public void sameChar(ArrayList<Character> list1, ArrayList<Character> list2) {
		HashSet<Character> sames = new HashSet<Character>(); // HashSet don't allow duplicates
		
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					sames.add(list1.get(i));
				}
			}
		}
		System.out.println("The number of the same alphabet : " + sames.size());		
	}
}

