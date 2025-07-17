package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int contador = 1;
		for (int i = 1; i <= n; i++) {
			int contador1 = contador * contador;
			int contador2 = contador * contador * contador;
			System.out.printf("%d %d %d\n", contador,contador1,contador2);
			contador += 1;
		}		
		sc.close();
	}
}
