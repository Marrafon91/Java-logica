package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double caso1, caso2, caso3;

		double media = 0.0;
		for (int i = 0; i < N; i++) {
			caso1 = sc.nextDouble();
			caso2 = sc.nextDouble();
			caso3 = sc.nextDouble();

			media = (caso1 * 2 + caso2 * 3 + caso3 * 5) / 10;
			System.out.printf("%.1f%n", media);
		}		
		sc.close();
	}
}
