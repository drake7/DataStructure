package practice;

public class InsertionSortRecur {

	public static void main(String... s) {
		int[] a1 = { 112, 21, 4, 53, 23, 11, 242312, 23, 5 };
		insertionSort(a1, a1.length - 1);
		for (int i : a1) {
			System.out.print(i + ",");
		}
	}
//recurive approach for the insertionsort
	public static void insertionSort(int[] a1, int n) {
		// if array length is zero return;
		if (n < 1) return;
		// keep sorting the array for smaller size
		insertionSort(a1, n - 1);
		// key can be any from the array
		int key = a1[n];
		// will start comparing from the left of an array
		int j = n - 1;
		// will do that till j greater than zero and the element at the left is greater
		// than the key value
		while (j >= 0 && a1[j] > key) {
			System.out.println(a1[j]);
			// if condition is true then we will swap the values of thsoe two element
			a1[j + 1] = a1[j];
			--j;
		}
		// key will be updated.
		a1[j + 1] = key;

	}

}
