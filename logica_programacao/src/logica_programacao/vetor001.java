package logica_programacao;

import java.util.Locale;
import java.util.Scanner;

public class vetor001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		
		int[] vetor = new int[N];
		
		for(int i=0;i<N;i++) {
			vetor[i] = sc.nextInt();			
		}
		
		for(int i=0;i<N;i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();
	}

}
