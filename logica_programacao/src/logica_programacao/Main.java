package logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		System.out.println("Ola Mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " Metros.");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		sc.close();
	}

}
