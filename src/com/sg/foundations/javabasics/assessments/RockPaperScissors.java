package com.sg.foundations.javabasics.assessments;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// result counters
		int winCounter = 0;
		int loseCounter = 0;
		int drawCounter = 0;

		boolean keepPlaying = true;
		while (keepPlaying) {// to keep playing unless user says no (n)
			System.out.println("How many rounds of Rock, Paper, Scissors would you like to play (1-10)?");
			int rounds = Integer.parseInt(in.nextLine());
			if (rounds < 1 || rounds > 10) {// error msg if outside 1-10
				System.out.println("Please choose a number from 1 to 10 instead");
			} else {// to select number or rounds to play
				System.out.println("Alright! Here we go!");
				for (int i = 0; i < rounds; i++) { // loop for selected number of rounds
					System.out.println("Select 1 = Rock, 2 = Paper, 3 = Scissors.");
					int choice = Integer.parseInt(in.nextLine()); //records user's hand
					Random randomizer = new Random();
					int bot = randomizer.nextInt(3) + 1;// randomizes computer's hand

					// Outcomes:
					if (bot == 1) {// results against Rock
						if (choice == 1) {
							System.out.println("Rock against Rock! Its a tie!");
							drawCounter++;
						} else if (choice == 2) {
							System.out.println("Paper against Rock! You won!");
							winCounter++;
						} else if (choice == 3) {
							System.out.println("Scissors against Rock! You lose!");
							loseCounter++;
						}
					} else if (bot == 2) {// results against Paper
						if (choice == 1) {
							System.out.println("Rock against Paper! You lose!");
							loseCounter++;
						} else if (choice == 2) {
							System.out.println("Paper against Paper! Its a tie!");
							drawCounter++;
						} else if (choice == 3) {
							System.out.println("Scissors against Paper! You win!");
							winCounter++;
						}
					} else if (bot == 3) {// results against Scissors
						if (choice == 1) {
							System.out.println("Rock against Scissors! You won!");
							winCounter++;
						} else if (choice == 2) {
							System.out.println("Paper against Scissors! You lose!");
							loseCounter++;
						} else if (choice == 3) {
							System.out.println("Scissors against Scissors! Its a tie!");
							drawCounter++;
						}
					}
				}
				// Display of summary
				System.out.println("You won " + winCounter + " times, lost " + loseCounter + " times and tied "
						+ drawCounter + " times.");
				if (winCounter > loseCounter) {
					System.out.println("You're the overall winner, congratulations!");
				} else if (loseCounter > winCounter) {
					System.out.println("HAH! You're the overall loser! Better luck next time!");
				} else {
					System.out.println("Looks like we tied overall, REMATCH!!");
				}

				System.out.println("Would you like to play again? (y/n)");
				String ans = in.nextLine();
				if (ans.equals("n")) {
					System.out.println("Thanks for playing!");
					keepPlaying = false; //ends game
				}
			}
		}
	}
}
