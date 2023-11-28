package main;

import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int distance = sr.nextInt();
		double fuelConsumption = sr.nextDouble();

		System.out.printf("%.3f km/l%n", distance / fuelConsumption);

		sr.close();

	}

}
