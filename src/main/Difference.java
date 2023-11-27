package main;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int A, B, C, D;

		A = sr.nextInt();
		B = sr.nextInt();
		C = sr.nextInt();
		D = sr.nextInt();

		System.out.printf("DIFERENCA = %d%n", (A * B - C * D));

		sr.close();

	}

}
