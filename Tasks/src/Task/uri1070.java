package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1070 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int contador = 0;

		if (x % 2 == 0) {
			x++;
		}

		while (contador < 6) {
			System.out.println(x);
			x += 2;
			contador++;
		}
		sc.close();
	}
}
