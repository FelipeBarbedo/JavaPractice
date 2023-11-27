package main;

import java.util.Scanner;

public class SimpleSum {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int SOMA, A, B;

		A = sr.nextInt();
		B = sr.nextInt();

		SOMA = A + B;

		System.out.printf("SOMA = %d%n", SOMA);

		sr.close();
	}

}
