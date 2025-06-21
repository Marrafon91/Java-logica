package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1059 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 2;
		
		while(x <= 100) {
			if(x  % 2 == 0) {
				System.out.println(x);
			}			
			x++;			
		}		
		sc.close();
	}
}
