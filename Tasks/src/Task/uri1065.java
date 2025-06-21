package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int positivos = 0;		

		for (int i = 0; i < 5; i++) {
			double valor = sc.nextDouble();
			if (valor % 2 == 0) {
				positivos++;
				;
			}
		}	
		
		System.out.println(positivos + " valores pares");
		sc.close();
	}
}
