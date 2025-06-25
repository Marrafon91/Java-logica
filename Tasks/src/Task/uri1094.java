package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;

		for (int i = 0; i < N; i++) {
			int quantidade = sc.nextInt();
			char tipo = sc.next().charAt(0);

			if (tipo == 'C') {
				coelhos += quantidade;
			} else if (tipo == 'R') {
				ratos += quantidade;
			} else {
				sapos += quantidade;
			}
		}

		int total = coelhos + ratos + sapos;
		double porcentagemC = (double) coelhos / total * 100.0;
		double porcentagemR = (double) ratos / total * 100.0;
		double porcentagemS = (double) sapos / total * 100.0;

		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemC);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemR);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemS);
		sc.close();
	}
}
