package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();

		System.out.println(valor);

		int[] notas = { 100, 50, 20, 10, 5, 2, 1 };

		for (int nota : notas) {
			int quantidade = valor / nota;
			System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
			valor = valor % nota;
		}
		sc.close();
	}

}
