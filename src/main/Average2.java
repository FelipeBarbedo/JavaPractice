package main;

import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		double A, B, C;

		A = sr.nextDouble();
		B = sr.nextDouble();
		C = sr.nextDouble();

		System.out.printf("MEDIA = %.1f%n", (A * 2 + B * 3 + C * 5) / 10);

		sr.close();

	}

}
