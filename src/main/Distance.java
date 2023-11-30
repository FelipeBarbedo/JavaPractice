package main;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int minutes = sr.nextInt();
		
		System.out.printf("%d minutos%n", minutes * 2);	

		sr.close();

	}

}
