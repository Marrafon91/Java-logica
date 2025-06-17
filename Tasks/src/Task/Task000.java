package Task;

import java.util.Locale;
import java.util.Scanner;

public class Task000 {

	public static void main(String[] args) {
	//Fazer um programa para ler as medidas da largura e comprimento
	// de um terreno retangular com uma casa decimal, bem como
	// o valor do metro quadrado do terreno com duas casas decimais.
	// Em seguida, o programa deve mostrar o valor da area do terreno,
	// bem como o valor do preço do terreno, ambos com duas casas decimais,
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.println("Largura = " + largura);
		System.out.println("Comprimento = " + comprimento);
		System.out.printf("Metro quadrado = %.2f%n", metroQuadrado);
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		sc.close();

	}

}
