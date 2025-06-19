package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1095 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int I = 1;
        int J = 60;

        while (J >= 0) {
            System.out.println("I=" + I + " J=" + J);
            I += 3;
            J -= 5;
        }		
		sc.close();
	}

}
