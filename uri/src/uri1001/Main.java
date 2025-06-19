package uri1001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int I = 1;
        int J = 7;

        while (J >= I) {
            System.out.println("I=" + I + " J=" + J);
            I += 1;
            J -= 1;
            if(J == 5)
        }		
		sc.close();
	}
}
