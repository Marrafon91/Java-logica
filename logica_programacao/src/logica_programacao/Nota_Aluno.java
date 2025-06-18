package logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Nota_Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f%n", media);
		
		if(media < 60.0) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}		
		sc.close();

	}

}
