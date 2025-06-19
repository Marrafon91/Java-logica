package uri1001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double area = ((A + B) * C) / 2.0;
		double perimetro = A + B + C;

		if (A < B + C && B < A + C && C < A + B) {
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			System.out.printf("Area = %.1f%n", area);
		}
		sc.close();
	}

}
