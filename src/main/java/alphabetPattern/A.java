package alphabetPattern;

import java.util.Scanner;

public class A {

	

	public static void main(String[] args) {

		Pattern pn = new Pattern();

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size of pattern (odd no. which is greater than 3)");
		int n = sc.nextInt();
		System.out.println("Enter your String ");
		String str = sc.next();

		int size = str.length();

		for (int i = 0; i < n; i++) {
			for (int a1 = 0; a1 < size; a1++) {
				switch (str.charAt(a1)) {
				case 'a':
				case 'A':
					pn.A(i, n);
					break;
				case 'b':
				case 'B':
					pn.B(i, n);
					break;
				case 'C':
				case 'c':
					pn.C(i, n);
					break;
				case 'd':
				case 'D':
					pn.D(i, n);
					break;
				case 'e':
				case 'E':
					pn.E(i, n);
					break;
				case 'F':
				case 'f':
					pn.F(i, n);
					break;
				case 'g':
				case 'G':
					pn.G(i, n);
					break;
				case 'H':
				case 'h':
					pn.H(i, n);
					break;
				case 'i':
				case 'I':
					pn.I(i, n);
					break;
				case 'J':
				case 'j':
					pn.J(i, n);
					break;
				case 'k':
				case 'K':
					pn.K(i, n);
					break;
				case 'l':
				case 'L':
					pn.L(i, n);
					break;
				case 'M':
				case 'm':
					pn.M(i, n);
					break;
				case 'N':
				case 'n':
					pn.N(i, n);
					break;
				case 'o':
				case 'O':
					pn.O(i, n);
					break;
				case 'p':
				case 'P':
					pn.P(i, n);
					break;
				case 'q':
				case 'Q':
					pn.Q(i, n);
					break;
				case 'r':
				case 'R':
					pn.R(i, n);
					break;
				case 's':
				case 'S':
					pn.S(i, n);
					break;
				case 't':
				case 'T':
					pn.T(i, n);
					break;
				case 'u':
				case 'U':
					pn.U(i, n);
					break;
				case 'v':
				case 'V':
					pn.V(i, n);
					break;
				case 'w':
				case 'W':
					pn.W(i, n);
					break;
				case 'x':
				case 'X':
					pn.X(i, n);
					break;
				case 'y':
				case 'Y':
					pn.Y(i, n);
					break;
				case 'z':
				case 'Z':
					pn.Z(i, n);
					break;
				}
			}
			System.out.println();
		}
		sc.close();
		System.out.println();
	}
}
