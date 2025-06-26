package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1099 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); 

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();

			int min = Math.min(X, Y) + 1;
			int max = Math.max(X, Y);

			int soma = 0;
			for (int j = min; j < max; j++) {
				if (j % 2 != 0) {
					soma += j;
				}
			}
			System.out.println(soma);
		}
		sc.close();
	}
}
