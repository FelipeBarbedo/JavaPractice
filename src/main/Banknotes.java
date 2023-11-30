package main;

import java.util.Scanner;

public class Banknotes {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int[] bankNotes = { 100, 50, 20, 10, 5, 2, 1 };
		int[] notesAvailable = new int[7];
		int totalValue = sr.nextInt();
		int total = totalValue;

		for (int i = 0; i < 7; i++)
			notesAvailable[i] = 0;

		for (int i = 0; i < 7; i++) {
			if (totalValue >= bankNotes[i]) {
				notesAvailable[i] = totalValue / bankNotes[i];
				totalValue -= notesAvailable[i] * bankNotes[i];
			}
		}

		System.out.println(total);
		for (int i = 0; i < 7; i++)
			System.out.printf("%d nota(s) de R$ %d,00%n", notesAvailable[i], bankNotes[i]);

		sr.close();

	}

}
