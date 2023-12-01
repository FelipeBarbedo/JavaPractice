package main;

import java.util.Scanner;

public class SelectionTest1 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		int[] values = new int[4];

		for (int i = 0; i < 4; i++)
			values[i] = sr.nextInt();

		boolean test1 = values[1] > values[2];
		boolean test2 = values[3] > values[0];
		boolean test3 = values[2] + values[3] > values[0] + values[1];
		boolean test4 = values[2] > 0 && values[3] > 0;
		boolean test5 = values[0] % 2 == 0;

		if (test1 && test2 && test3 && test4 && test5)
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");

		sr.close();

	}

}
