package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1066 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		int negativo = 0;
		int positivos = 0;

		for (int i = 0; i < 5; i++) {
			int valor = sc.nextInt();

			if (valor % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			if (valor > 0) {
				positivos++;
			} else if (valor < 0) {
				negativo++;
			}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		sc.close();
	}

}
