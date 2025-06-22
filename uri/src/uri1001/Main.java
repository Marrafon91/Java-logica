package uri1001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 2; i <= N; i += 2) {
			int quadrado = i * i;
			System.out.println(i + "^2 = " + quadrado);
		}

		sc.close();
	}
}
