package recursion;

public class CallTrace {
	public static void main(String[] args) {

		System.out.println(f(16));
	}

	public static int f(int n) {
		int result = 0;
		if (n <= 4) {
			result = 1;
			return result;
		} else {
			result = f(n / 2) + f(n / 4);
		}
		return result;
	}

}
