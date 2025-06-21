package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double juros = 0.0;
		int porcento = 0;

		if (salario <= 400.0) {
			porcento = 15;
		} else if (salario <= 800.0) {
			porcento = 12;
		} else if (salario <= 1200.0) {
			porcento = 10;
		} else if (salario <= 2000.0) {
			porcento = 7;
		} else {
			porcento = 4;
		}

		juros = salario * porcento / 100;
		double novoSalario = salario + juros;

		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", juros);
		System.out.printf("Em percentual: %d %%\n", porcento);

		sc.close();
	}
}
