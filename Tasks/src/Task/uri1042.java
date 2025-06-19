package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int menor, meio, maior;
		if(a <= b && a <= c) {
			menor = a;
		} else if(b <= a && b <= c) {
			menor = b;
		} else {
			menor = c;
		}
				
		if(a >= b && a >= c) {
			maior = a;
		} else if(b >= a && b >= c) {
			maior = b;
		} else {
			maior = c;
		}
		
		meio = a + b + c - menor - maior;
		
		System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);        
        System.out.println();         
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        sc.close();		

	}

}
