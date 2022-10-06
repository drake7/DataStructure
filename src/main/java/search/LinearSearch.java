package search;

public class LinearSearch {

	public static void main(String... s) {
		int[] arrayN = { 10, 12, 0, 4323, 12124112, 12, 33412, 23, 123, 212, 322, 334, 338, 3678, 4567, 765442 };
	
		System.out.println(LinearSearchIte(arrayN,4323));
	
	
	
	}

	private static int LinearSearchIte(int[] arr, int number) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return i;
			}
		}
		return -1;
	}

}
