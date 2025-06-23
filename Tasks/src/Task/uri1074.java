package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			int x = sc.nextInt();

			if (x == 0) {
				System.out.println("NULL");
			} else if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			}
		}

		sc.close();
	}
}
