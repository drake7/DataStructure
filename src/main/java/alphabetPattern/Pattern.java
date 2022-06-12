package alphabetPattern;

public class Pattern {
	
	 void A(int i, int n) {
			for (int j = 0; j <= n - i - 1; j++)// A
				System.out.print(" ");

			System.out.print(" *");

			if (i == n / 2) {
				for (int z = 0; z < n / 2; z++)
					System.out.print(" *");
				System.out.print(" ");
			} else {

				for (int k = 0; (k < i + i - 1); k++)
					System.out.print(" ");
				if (i != 0)
					System.out.print(" *");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < n - 1 - i; j++)
				System.out.print(" ");

			System.out.print("  ");

		}

		void B(int i, int n) {
			for (int j = 0; j < (n / 2); j++) {
				if (i == 0 || j == 0 || i == (n / 2) || i == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
				if ((j == (n / 2) - 1) && (i == 0 || i == (n / 2) || i == n - 1))
					System.out.print("  ");
				else if (j == (n / 2) - 1)
					System.out.print(" *");
			}
			System.out.print("     ");

		}

		void C(int i, int n) {
			for (int c = 0; c < n / 2 - 1; c++) {
				if (c == 1 && ((i == 0) || (i == n - 1)))
					System.out.print(" *");
				else if ((c == 0) && ((i == 0) || (i == n - 1)))
					System.out.print("  ");
				if (c == 0)
					System.out.print(" *");
				else if ((i == 0 || i == n - 1))
					System.out.print(" *");
				if (c > 0 && ((i > 0 && i < n - 1)))
					System.out.print("  ");

			}

			if (i > 0 && i < n - 1)
				System.out.print("       ");
			else
				System.out.print("   ");
			System.out.print(" ");

		}

		void D(int i, int n) {
			// D
			for (int d = 0; d < (n / 2); d++) {
				if (i == 0 || d == 0 || i == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
				if ((d == (n / 2) - 1) && (i == 0 || i == n - 1))
					System.out.print("  ");
				else if (d == (n / 2) - 1 && (i == n / 2))
					System.out.print(" *");
				else if (d == (n / 2) - 1)
					System.out.print(" *");
			}
			System.out.print("      ");

		}

		void E(int i, int n) {
			// E

			for (int e = 0; e < n / 2; e++) {
				if (e == 0)
					System.out.print(" *");
				if (i == 0 || i == n / 2 || i == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void F(int i, int n) {

			// F
			for (int f = 0; f < n / 2; f++) {
				if (f == 0)
					System.out.print(" *");
				if (i == 0 || i == n / 2)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void G(int i, int n) {
			// G
			for (int g = 0; g <= n / 2; g++) {

				if ((g == 0) && ((i == 0) || (i == n - 1)))
					System.out.print("  ");
				if (g == 0)
					System.out.print(" G");
				else if ((i == 0 && g < n / 2))
					System.out.print(" G");
				else if (i == n - 1 && g < n / 4 - 1)
					System.out.print(" G");
				for (int M = 0; M <= n / 2 - 3; M++) {
					if (i == n - 1 && g == n / 2)
						System.out.print("  ");
				}
				if (i == n - 1 && g > n / 2)
					System.out.print(" G");
				else if ((i >= n / 2) && (g == n / 4 + 1))
					System.out.print(" G");
				if (i == n / 2 && g >= n / 4 + 1)
					System.out.print(" G");

				else if ((i >= n / 2) && g == n / 2)
					System.out.print(" G");
				else if ((i == n - 1) && g > n / 2)
					System.out.print(" G");
				else if (g > 0 && ((i > 0 && i < n - 1)))
					System.out.print("  ");

			}

			if (i < n / 2)
				System.out.print("       ");
			else
				System.out.print("     ");

		}

		void H(int i, int n) {
			// h
			if (i != n / 2 || i != 0)
				System.out.print("     *");
			else
				System.out.print(" *");

			for (int j = 0; j <= n / 2; j++)

			{
				if (i == n / 2)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.print(" *");

		}

		void I(int i, int n) {
			// I
			if (i == 0 || i == n - 1)
				System.out.print("  ");

			System.out.print("   ");
			for (int j = 0; j <= n / 2 + 1; j++) {
				if (i == 0 || i == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
				if (j == n / 4 + 1 && i != n - 1) {
					if (i != 0)
						System.out.print(" *");

				}
			}

		}

		void J(int i, int n) {
			// J
			for (int J = 0; J <= n / 2; J++) {
				if (i == 0)
					System.out.print(" *");
				else if (J == n / 4 + 1)
					System.out.print(" *");
				else if (i == n - 1 && (J > 0 && J < n / 4 + 1))
					System.out.print(" *");
				else if ((i > n / 2) && J == 0)
					System.out.print(" *");
				else
					System.out.print("  ");

			}
			System.out.print("    ");

		}

		void K(int i, int n) {
			System.out.print(" *");// k
			for (int j = 0; j < n / 2 - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i - n / 2; j++) {
				System.out.print("  ");
			}

			System.out.print(" *");
			if (i <= n / 2) {
				for (int k = 0; k < i + 1; k++)
					System.out.print("  ");
			} else {
				for (int k = 0; k < n - i; k++)
					System.out.print("  ");
			}
			System.out.print(" ");

		}

		void L(int i, int n) {
			for (int l = 0; l <= n / 2; l++) {
				if (l == 0 || i == n - 1)
					System.out.print(" L");
				else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void M(int i, int n) {

			// M
			for (int m = 0; m < n; m++) {
				if (m == 0 || m == n - 1)
					System.out.print(" *");
				else if ((m == i && i <= n / 2) || (m == n - 1 - i && i < n / 2)) {
					System.out.print(" *");
				} else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void N(int i, int n) {
			// N
			for (int m = 0; m < n; m++) {
				if (m == 0 || m == n - 1)
					System.out.print(" *");
				else if (m == i) {
					System.out.print(" *");
				} else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void O(int i, int n) {
			// O
			for (int o = 0; o <= n / 2 + 1; o++) {
				if ((o == n / 2 + 1 || o == 0) && ((i == 0) || (i == n - 1)))
					System.out.print("  ");
				else if ((o <= n / 2 + 1 && o >= 0) && ((i == 0) || (i == n - 1)))
					System.out.print(" *");

				if ((o == 0 || o == n / 2 + 1) && (!(i == 0 || i == n - 1)))
					System.out.print(" *");
				else if ((o > 0 && o < n / 2 + 1) && ((i > 0 && i < n - 1)))
					System.out.print("  ");

			}
			System.out.print("     ");

		}

		void P(int i, int n) {
			// P

			for (int p = 0; p < (n / 2); p++) {
				if (i == 0 || p == 0 || i == (n / 2))
					System.out.print(" *");
				else
					System.out.print("  ");
				if ((p == (n / 2) - 1) && (i == 0 || i == (n / 2) || (i > n / 2 && i <= n - 1)))
					System.out.print("  ");
				else if (p == (n / 2) - 1)
					System.out.print(" *");
			}
			System.out.print("     ");

		}

		void Q(int i, int n) {
			// Q

			for (int q = 0; q <= n / 2 + 1; q++) {
				if ((q == n / 2 + 1 || q == 0) && ((i == 0) || (i == n - 2)))
					System.out.print("  ");
				else if ((q <= n / 2 + 1 && q >= 1) && ((i == 0) || (i == n - 2)))
					System.out.print(" *");

				if ((q == 0 || q == n / 2 + 1) && (!(i == 0 || i == n - 2 || i == n - 1)))
					System.out.print(" *");
				else if ((q > 0 && q < n / 2 + 1) && ((i > 0 && i < n - 2)))
					System.out.print("  ");
				if (((q <= n / 2) && i == n - 1)) {
					System.out.print("  ");
				} else if (i == n - 1 && q >= n / 2)
					System.out.print(" *");
			}
			System.out.print("     ");

		}

		void R(int i, int n) {
			// R

			for (int r = 0; r < (n / 2); r++) {
				if (i == 0 || r == 0 || i == (n / 2))
					System.out.print(" *");
				else
					System.out.print("  ");
				if (r == i - n / 2 - 1)
					System.out.print(" *");
				if ((r == (n / 2) - 1) && (i == 0 || i == (n / 2) || (i > n / 2 && i <= n - 1)))
					System.out.print("  ");
				else if (r == (n / 2) - 1)
					System.out.print(" *");

			}
			if (i > n / 2)
				System.out.print("   ");
			else
				System.out.print("     ");

		}

		void S(int i, int n) {
			if (i <= n / 2 || i == n - 1)
				System.out.print("     *");
			else
				System.out.print("      ");
			for (int j = 0; j < n / 2; j++) {
				if (i == 0 || i == n / 2 || i == n - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
				if (i == n / 2 && j == n / 2 - 1 || i == 0 && j == n / 2 - 1)
					System.out.print(" *");
			}
			if (i > n / 2)
				System.out.print(" *");
			else if (i > 0 && i < n / 2)
				System.out.print("  ");

		}

		void T(int i, int n) {
			// T

			for (int t = 0; t <= n / 2; t++) {
				if (t == n / 4 || i == 0)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void U(int i, int n) {
			// U

			for (int u = 0; u <= n / 2; u++) {
				if ((u >= 1 && u <= n / 2 - 1) && (i == 0))
					System.out.print("  ");
				else if (u == 0 && i == n - 1)
					System.out.print("  ");
				else if ((u < n / 2 && u >= 1) && (i == n - 1))
					System.out.print(" *");
				else if (u <= n / 2 && i == n - 1)
					System.out.print("  ");

				if ((u == 0 || u == n / 2) && (!(i == n - 1)))
					System.out.print(" *");
				else if ((u > 0 && u < n / 2 + 1) && ((i > 0 && i < n - 1)))
					System.out.print("  ");

			}
			System.out.print("     ");

		}

		void V(int i, int n) {
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			System.out.print("*");
			for (int V = 0; V <= n + n - 3 - i - i; V++) {
				System.out.print("  ");
			}
			if (i != n - 1)
				System.out.print(" *");
			for (int v = 0; v < n - i; v++) {
				System.out.print("  ");
			}
			System.out.print("    ");
		}

		void W(int i, int n) {
			// W
			for (int w = 0; w < n; w++) {
				if (w == 0 || w == n - 1)
					System.out.print(" W");
				else if ((w == i && i >= n / 2) || (w == n - 1 - i && i > n / 2)) {
					System.out.print(" W");
				} else
					System.out.print("  ");
			}
			System.out.print("    ");

		}

		void X(int i, int n) {
			// X

			for (int x = 0; x < n; x++) {
				if (x == i || x == n - i - 1)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.print("  ");

		}

		void Y(int i, int n) {
			// y
			for (int y = 0; y < n; y++) {
				if ((y == i || y == n - i - 1) && i <= n / 2)
					System.out.print(" Y");
				else if (i > n / 2 && y == n / 2)
					System.out.print(" Y");
				else
					System.out.print("  ");
			}
			System.out.print("   ");
		}

		void Z(int i, int n) {
		
			for (int z = 0; z < n; z++) {
				if (i == 0 || i == n - 1)
					System.out.print("z");
				else if (z == n - i - 1) {
					System.out.print("z");
				} else
					System.out.print(" ");
			}
			System.out.print("    ");

		}

}
