package uri1001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
						
		int cod1 = sc.nextInt();
		int qnt1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int qnt2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double resultado = qnt1 * preco1 + qnt2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", resultado);
		sc.close();
	}

}
