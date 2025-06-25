package Task;

import java.util.Locale;
import java.util.Scanner;

public class uri1097 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 9; i += 2) {
			for (int j = i + 6; j >= i + 4; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
		}
		sc.close();
	}
}

	