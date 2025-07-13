package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int vitorialInter = 0;
		int vitoriaGremio = 0;
		int empates = 0;
		int novoGrenal = 1;

		while (novoGrenal == 1) {
			int golInter = sc.nextInt();
			int golGremio = sc.nextInt();

			if (golInter > golGremio) {
				vitorialInter = vitorialInter + 1;
			} else if (golGremio > golInter) {
				vitoriaGremio = vitoriaGremio + 1;
			} else {
				empates = empates + 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}

		int total = vitoriaGremio + vitorialInter + empates;

		System.out.println(total + " grenais");
		System.out.println("Inter: " + vitorialInter);
		System.out.println("Gremio: " + vitoriaGremio);
		System.out.println("Empates : " + empates);

		if (vitorialInter > vitoriaGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitoriaGremio > vitorialInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();
	}

}
