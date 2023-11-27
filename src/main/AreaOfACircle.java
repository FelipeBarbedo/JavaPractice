package main;

import java.io.IOException;
import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) throws IOException {

		Scanner sr = new Scanner(System.in);

		double A, R, pi = 3.14159;

		R = sr.nextDouble();

		A = pi * R * R;

		System.out.printf("A=%.4f%n", A);

		sr.close();

	}

}
