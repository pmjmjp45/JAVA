package git01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
	public static int SCISSORS = 0;
	public static int ROCK = 1;
	public static int PAPER = 2;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RockPaperScissors main = new RockPaperScissors();

		ArrayList<Integer> mine = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();

		while (true) {
			Scanner scanner = new Scanner(System.in);
			int me = scanner.nextInt();
			mine.add(me);
			computer.add(main.getRockPaperScissors());

			if (me == SCISSORS) {
				if (main.getRockPaperScissors() == PAPER) {
					System.out.println("YOU WIN!");
					break;
				} else {
					System.out.println("TRY AGAIN!");
				}
			} else if (me == ROCK) {
				if (main.getRockPaperScissors() == SCISSORS) {
					System.out.println("YOU WIN!");
					break;
				} else {
					System.out.println("TRY AGAIN!");
				}
			} else if (me == PAPER) {
				if (main.getRockPaperScissors() == ROCK) {
					System.out.println("YOU WIN!");
					break;
				} else {
					System.out.println("TRY AGAIN!");
				}
			}
		} 

		FileOutputStream output = new FileOutputStream("////the path////");
		String data = "";
		for (int i = 0; i < mine.size(); i++) {
			data = "ME: " + mine.get(i) + " - COM: " + computer.get(i);
			System.out.println(data);
			output.write(data.getBytes());
		}
		output.close();

	}

	public int getRockPaperScissors() { // computer make random number
		int com = (int)(Math.random() * 3);
		return com;

	}
}

