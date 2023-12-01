package main;

import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		String[][] values = { { "1", "Cachorro Quente", "4.00" }, { "2", "X-Salada", "4.50" },
				{ "3", "X-Bacon", "5.00" }, { "4", "Torrada simples", "2.00" }, { "5", "Refrigerante", "1.50" } };

		int code = sr.nextInt();
		int amount = sr.nextInt();

		System.out.printf("Total: R$ %.2f%n", amount * Double.parseDouble(values[code - 1][2]));

		sr.close();

	}

}
