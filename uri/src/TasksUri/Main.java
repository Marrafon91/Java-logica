package TasksUri;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int menor = Math.min(x, y);
		int maior = Math.max(x, y);

		for (int i = menor + 1; i < maior; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
