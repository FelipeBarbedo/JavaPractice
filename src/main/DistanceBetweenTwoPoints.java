package main;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		double x1 = sr.nextDouble(), y1 = sr.nextDouble();
		double x2 = sr.nextDouble(), y2 = sr.nextDouble();

		System.out.printf("%.4f%n", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

		sr.close();

	}

}
