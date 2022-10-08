package sorting;

public class SelectionSortRecursive {
	public static void main(String... s) {
		int[] a1 = { 112, 21, 4, 53, 23, 11, 242312, 23, 5 };

	//	System.out.println(findMinIndex(a1, 0));
		sortRec(a1, 0);

		for (int i : a1) {
			System.out.print(i + ",");
		}

	}
	
	//select minimum and replace (SELECTION)

	private static void sortRec(int[] a1, int index) {
		if (a1.length == 0) {
			System.out.println("empty arrat");
			return;
		}
		if(a1.length==index)
		{
			return;
		}
		//find minimum element's index and replace that with the current index
			int min = findMinIndex(a1, index);
			System.out.println(a1[min]);
			int temp = a1[min];
			a1[min] = a1[index];
			a1[index] = temp;
			sortRec(a1, index + 1);
		}
		

	private static int findMinIndex(int[] a, int index) {
		if (index == a.length)
			return -1;

		int temp = a[index];
		int counter = 0;
		for (int i = index; i < a.length; i++) {
			if (temp >= a[i]) {
				temp = a[i];
				counter = i;
			}
		}
		return counter;

	}

}
