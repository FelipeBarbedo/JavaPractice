package main;

import java.util.Scanner;

public class AgeInDays {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int ageInDays = sr.nextInt();
		int years = 0, months = 0, days = 0;

		if (ageInDays > 364) {
			years = ageInDays / 365;
			ageInDays -= years * 365;
		}

		if (ageInDays > 29) {
			months = ageInDays / 30;
			ageInDays -= months * 30;
		}

		days = ageInDays;

		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", years, months, days);

		sr.close();

	}

}
