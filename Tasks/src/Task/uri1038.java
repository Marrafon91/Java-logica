package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qntd = sc.nextInt();

		double total = 0.0;

		switch (cod) {
		case 1:
			total = qntd * 4.00;
			break;
		case 2:
			total = qntd * 4.50;
			break;
		case 3:
			total = qntd * 5.00;
			break;
		case 4:
			total = qntd * 2.00;
			break;
		case 5:
			total = qntd * 1.50;
			break;
		default:
			System.out.println("Código inválido.");
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
		return;

	}

}
