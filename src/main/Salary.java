package main;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int employeeNumber, hoursWorked;
		double hourRate;

		employeeNumber = sr.nextInt();
		hoursWorked = sr.nextInt();
		hourRate = sr.nextDouble();

		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", employeeNumber, hoursWorked * hourRate);

		sr.close();

	}

}
