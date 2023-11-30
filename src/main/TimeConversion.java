package main;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		int time = sr.nextInt();
		int hours = 0, minutes = 0, seconds = 0;

		if (time > 59) {
			seconds = time % 60;
		} else if (time % 60 != 0) {
			seconds = time % 60;
		}

		time /= 60;

		if (time > 59) {
			minutes = time % 60;
		} else if (time % 60 != 0) {
			minutes = time % 60;
		}

		time /= 60;

		hours = time;

		System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

		sr.close();

	}

}