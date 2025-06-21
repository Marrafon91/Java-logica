package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int positivos = 0;
		double soma = 0.0;

		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			if (valor > 0) {
				positivos++;
				soma += valor;
			}
		}
		
		double media = soma / positivos;
			
		System.out.println(positivos + " valores positivos");
		System.out.printf("%.1f%n", media);

		sc.close();
	}
}
