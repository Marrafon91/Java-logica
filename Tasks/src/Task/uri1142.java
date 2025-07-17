package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int primeiro = 1;

		for (int i = 1; i <= N; i++) {
			int segundo = primeiro + 1;
			int terceiro = primeiro + 2;
			System.out.printf("%d %d %d PUM%n", primeiro, segundo, terceiro);
			primeiro += 4;
		}
		sc.close();
	}
}
