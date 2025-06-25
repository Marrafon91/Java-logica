package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1098 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (double i = 0; i <= 2.01; i += 0.2) {
			for (int j = 1; j <= 3; j++) {
				double valorJ = j + i;
				if (i == 0 || i == 1 || i >= 1.99) {
					System.out.printf("I=%.0f J=%.0f%n", i, valorJ);
				} else {
					System.out.printf("I=%.1f J=%.1f%n", i, valorJ);
				}

			}
		}
		sc.close();
	}
}
