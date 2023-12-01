package main;

import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		int[] intervals = { 0, 25, 50, 75, 100 };
		int greaterThan = -1, lessThan = -1;

		double number = sr.nextDouble();

		for (int i = 0; i < 5; i++)
			if (number > intervals[i]) {
				greaterThan = intervals[i];
			} else {
				lessThan = intervals[i];
				break;
			}

		if (greaterThan == -1 || lessThan == -1)
			System.out.println("Fora de interavalo");
		else
			for (int i = 0; i < 5; i++)
				if (number == intervals[i]) {
					System.out.printf("Intervalo (");
				} else {
					lessThan = intervals[i];
					break;
				}
		
		
		sr.close();

	}

}
