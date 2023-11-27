package main;

import java.util.Scanner;

public class SimpleProduct {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int PROD, A, B;

		A = sr.nextInt();
		B = sr.nextInt();

		PROD = A * B;

		System.out.printf("PROD = %d%n", PROD);

		sr.close();

	}

}
