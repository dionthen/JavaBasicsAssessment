package com.sg.foundations.javabasics.assessments;

import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);

		System.out.print("What is your age? ");
		int age = inputReader.nextInt();
		int maxHR = 220 - age;
		int minHRZone = (int) Math.round(maxHR * 0.5);
		int maxHRZone = (int) Math.round(maxHR * 0.85);

		System.out.println("Your maximum heart rate should be "+maxHR+" beats per minute.");
		System.out.print("Your target HR Zone is "+minHRZone+" - "+maxHRZone+" beats per minute.");

	}
}