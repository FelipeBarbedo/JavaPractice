package main;

import java.util.Scanner;

public class SimpleCalculate {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		double totalAmount = 0;

		for (int i = 0; i < 2; i++) {
			// int productCode = sr.nextInt();
			int numberOfUnits = sr.nextInt();
			double priceUnit = sr.nextDouble();

			totalAmount += numberOfUnits * priceUnit;
		}

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAmount);

		sr.close();
	}

}
