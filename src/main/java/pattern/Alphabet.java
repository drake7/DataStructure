package pattern;

public class Alphabet {

	void D(int i, int n) {
		for (int d = 0; d < (n / 2); d++) {
			if (i == 0 || d == 0 || i == n - 1)
				System.out.print(" DD");
			else
				System.out.print("  ");
			if ((d == (n / 2) - 1) && (i == 0 || i == n - 1))
				System.out.print("  ");
			else if (d == (n / 2) - 1 && (i == n / 2))
				System.out.print(" DD");
			else if (d == (n / 2) - 1)
				System.out.print(" DD");
		}
		System.out.print("      ");

	}

	void O(int i, int n) {
		for (int o = 0; o <= n / 2 + 1; o++) {
			if ((o == n / 2 + 1 || o == 0) && ((i == 0) || (i == n - 1)))
				System.out.print("  ");
			else if ((o <= n / 2 + 1 && o >= 0) && ((i == 0) || (i == n - 1)))
				System.out.print(" O");

			if ((o == 0 || o == n / 2 + 1) && (!(i == 0 || i == n - 1)))
				System.out.print(" O");
			else if ((o > 0 && o < n / 2 + 1) && ((i > 0 && i < n - 1)))
				System.out.print("  ");

		}
		System.out.print("     ");

	}

	void U(int i, int n) {
		for (int u = 0; u <= n / 2; u++) {
			if ((u >= 1 && u <= n / 2 - 1) && (i == 0))
				System.out.print("  ");
			else if (u == 0 && i == n - 1)
				System.out.print("  ");
			else if ((u < n / 2 && u >= 1) && (i == n - 1))
				System.out.print(" U");
			else if (u <= n / 2 && i == n - 1)
				System.out.print("  ");

			if ((u == 0 || u == n / 2) && (!(i == n - 1)))
				System.out.print(" U");
			else if ((u > 0 && u < n / 2 + 1) && ((i > 0 && i < n - 1)))
				System.out.print("  ");

		}
		System.out.print("     ");

	}

	void G(int i, int n) {
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

	void L(int i, int n) {
		for (int l = 0; l <= n / 2; l++) {
			if (l == 0 || i == n - 1)
				System.out.print(" L");
			else
				System.out.print("  ");
		}
		System.out.print("    ");

	}

	void A(int i, int n) {
		for (int j = 0; j <= n - i - 1; j++)
			System.out.print(" ");

		System.out.print(" A");

		if (i == n / 2) {
			for (int z = 0; z < n / 2; z++)
				System.out.print(" A");
			System.out.print(" ");
		} else {

			for (int k = 0; (k < i + i - 1); k++)
				System.out.print(" ");
			if (i != 0)
				System.out.print(" A");
			else
				System.out.print(" ");
		}
		for (int j = 0; j < n - 1 - i; j++)
			System.out.print(" ");

		System.out.print("  ");

	}

	void S(int i, int n) {
		if (i <= n / 2 || i == n - 1)
			System.out.print("     S");
		else
			System.out.print("      ");
		for (int j = 0; j < n / 2; j++) {
			if (i == 0 || i == n / 2 || i == n - 1)
				System.out.print(" S");
			else
				System.out.print("  ");
			if (i == n / 2 && j == n / 2 - 1 || i == 0 && j == n / 2 - 1)
				System.out.print(" S");
		}
		if (i > n / 2)
			System.out.print(" S");
		else if (i > 0 && i < n / 2)
			System.out.print("  ");

	}

}
