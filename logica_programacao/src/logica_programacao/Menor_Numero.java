package logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Menor_Numero {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("Menor é A = " + a);
		} else if(b < a && b < c) {
			System.out.println("Menor é B = " + b);
		} else {
			System.out.println("Menor é C = " + c);
		}
		
				
		sc.close();

	}

}
