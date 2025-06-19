package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1096 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 9; i += 2) {
			for (int j = 7; j >= 5; j--) {
				System.out.printf("I=%d J=%d%n", i, j);
			}
		}
		sc.close();
	}
}
