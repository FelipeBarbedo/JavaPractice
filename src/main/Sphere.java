package main;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		double pi = 3.14159;
		double radius = sr.nextDouble();

		System.out.printf("VOLUME = %.3f%n", radius * radius * radius * pi * (4.0 / 3));

		sr.close();

	}

}
