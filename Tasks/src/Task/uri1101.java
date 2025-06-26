package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1101 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int M, N;

		while (true) {
			M = sc.nextInt();
			N = sc.nextInt();

			if (M <= 0 || N <= 0) {
				break;
			}
			int min = Math.min(M, N);
			int max = Math.max(M, N);
			int soma = 0;

			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
				soma += i;
			}
			System.out.print("Sum=" + soma);
		}
		sc.close();
	}
}
