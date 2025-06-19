package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horas = sc.nextDouble();
		double distancia = sc.nextDouble();
		
		double gasto = (horas * distancia) / 12;
		
		System.out.printf("%.3f%n", gasto);
		
		
		sc.close();
	}

}
