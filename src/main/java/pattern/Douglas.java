package pattern;

import java.util.Scanner;

public class Douglas {

	public static void main(String...s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Input for height of the Banner(Please enter number greater than 5 and less than 11)");
		int n = sc.nextInt();
		
		Alphabet letters=new Alphabet();
		for (int i = 0; i < n; i++) {
				letters.D(i, n);
				letters.O(i, n);
				letters.U(i, n);
				letters.G(i, n);
				letters.L(i, n);
				letters.A(i, n);
				letters.S(i, n);
			System.out.println();
	}
		System.out.println();
}
	}
