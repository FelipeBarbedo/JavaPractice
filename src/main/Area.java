package main;

import java.util.Scanner;

interface AreaInterface {
	double shape(double a, double b, double c);
}

public class Area {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		double A = sr.nextDouble(), B = sr.nextDouble(), C = sr.nextDouble();

		AreaInterface triangle = (a, b, c) -> {
			return (a * c) / 2;
		};

		AreaInterface circle = (a, b, c) -> {
			return (3.14159 * Math.pow(c, 2));
		};

		AreaInterface trapezium = (a, b, c) -> {
			return ((a + b) * c) / 2;
		};

		AreaInterface square = (a, b, c) -> {
			return b * b;
		};

		AreaInterface rectangle = (a, b, c) -> {
			return a * b;
		};

		System.out.printf("TRIANGULO: %.3f%n", triangle.shape(A, B, C));
		System.out.printf("CIRCULO: %.3f%n", circle.shape(A, B, C));
		System.out.printf("TRAPEZIO: %.3f%n", trapezium.shape(A, B, C));
		System.out.printf("QUADRADO: %.3f%n", square.shape(A, B, C));
		System.out.printf("RETANGULO: %.3f%n", rectangle.shape(A, B, C));

		sr.close();

	}

}
