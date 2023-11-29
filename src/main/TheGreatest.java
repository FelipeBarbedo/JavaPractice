package main;

import java.util.Scanner;

public class TheGreatest {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int greatest;

		int a = sr.nextInt();
		int b = sr.nextInt();
		int c = sr.nextInt();

		greatest = (a + b + Math.abs(a - b)) / 2;

		greatest = (greatest + c + Math.abs(greatest - c)) / 2;

		System.out.printf("%d eh o maior%n", greatest);

		sr.close();

	}

}
