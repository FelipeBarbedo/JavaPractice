package main;

import java.io.IOException;
import java.util.Scanner;

public class ExtremelyBasic {

	public static void main(String[] args) throws IOException {

		Scanner sr = new Scanner(System.in);

		int A, B, X;

		A = sr.nextInt();
		B = sr.nextInt();

		X = A + B;

		System.out.printf("X = %d%n", X);

		sr.close();

	}

}
