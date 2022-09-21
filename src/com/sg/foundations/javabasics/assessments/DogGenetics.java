package com.sg.foundations.javabasics.assessments;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random randomizer = new Random();
		System.out.print("What is your dog's name? ");
		String input = in.nextLine();
		System.out.println(
				"Well then, I have this highly reliable report on " + input + "'s prestigious background right here.");
		System.out.println("\n" + input + " is:");
		while (true) {
			int num1 = randomizer.nextInt(100) + 1;
			int num2 = randomizer.nextInt(100) + 1;
			int num3 = randomizer.nextInt(100) + 1;
			int num4 = randomizer.nextInt(100) + 1;
			int num5 = randomizer.nextInt(100) + 1;
			if (num1 + num2 + num3 + num4 + num5 == 100) {
				System.out.println("\n" + num1 + "% St. Bernard");
				System.out.println(num2 + "% Chihuahua");
				System.out.println(num3 + "% Dramatic RedNosed Asian Pug");
				System.out.println(num4 + "% Common Cur");
				System.out.println(num5 + "% King Doberman");
				System.out.println("\nWow, that's QUITE the dog!");
				break;
			}
		}
	}
}