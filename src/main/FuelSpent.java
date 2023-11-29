package main;

import java.util.Scanner;

public class FuelSpent {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int hours = sr.nextInt();
		int kmPerHour = sr.nextInt();
		double fuelConsumption = 12.0;

		System.out.printf("%.3f%n", (kmPerHour * hours) / fuelConsumption);

		sr.close();

	}

}
