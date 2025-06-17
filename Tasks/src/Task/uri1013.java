package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior = (a + b + Math.abs(a - b)) / 2;
		int maiorAB = (maior + c + Math.abs(maior - c)) / 2;
		
		System.out.println(maiorAB + " eh o maior");
		
		sc.close();

	}

}
