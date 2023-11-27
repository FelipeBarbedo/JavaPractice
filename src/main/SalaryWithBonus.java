package main;

import java.util.Scanner;

public class SalaryWithBonus {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		String employeesName = sr.next();
		double fixedSalary = sr.nextDouble();
		double totalSales = sr.nextDouble();

		System.out.println(employeesName);
		System.out.printf("TOTAL = R$ %.2f%n", fixedSalary + totalSales * 0.15);

		sr.close();

	}

}
