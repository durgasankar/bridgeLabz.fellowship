package com.bridgeLabz.basicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Emter the nth term");
		int term = sc.nextInt();
		if (term > 0) {
			double value = harmonicNumber(term);
			System.out.println("Harmonic value upto " + term + " term = " + value);
		} else {
			System.out.println("Please Enter a positive term value.");
		}
	}

	private static double harmonicNumber(int number) {
		float harmonic = 1;
		for (int i = 2; i <= number; i++) {
			harmonic += (float) 1 / i;
		}
		return harmonic;
	}

}