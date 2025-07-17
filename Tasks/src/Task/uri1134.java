package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;

		int fim = sc.nextInt();

		while (fim != 4) {
			if (fim == 1) {
				Alcool++;
			} else if (fim == 2) {
				Gasolina++;
			} else if (fim == 3) {
				Diesel++;
			}
			fim = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);

		sc.close();
	}
}
