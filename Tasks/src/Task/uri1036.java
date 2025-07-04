package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double delta = B * B -4.0 * A * C;
		
		if(A == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");
		} else {
			double R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			double R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}
					
		sc.close();
	}

}
