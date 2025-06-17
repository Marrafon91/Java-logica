package logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Casting {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b; // Casting
		
		System.out.println(resultado);
		
		
		
		sc.close();

	}

}
