package logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int y = sc.nextInt();
		double z = sc.nextDouble();
		char a = sc.next().charAt(0);
		System.out.println("Voce se chama: " + x);
		System.out.println("Voce tem: " + y + " anos ");
		System.out.printf("Voce pesa: %.2f KG %n", z);
		System.out.println("Sua primeira letra: " + a);
		
		
		
		sc.close();

	}

}
