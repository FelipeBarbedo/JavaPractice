package main;

import java.util.Scanner;

public class Average1 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		double avg, A, B;

		A = sr.nextDouble();
		B = sr.nextDouble();

		avg = (A * 3.5 + B * 7.5) / 11;

		System.out.printf("MEDIA = %.5f%n", avg);

		sr.close();

	}

}
