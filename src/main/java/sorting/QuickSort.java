package sorting;

public class QuickSort {

	public static void quickSort(int arr[], int begin, int end) {

		// while not reaching to end
		if (begin < end) {
			// get the partition index
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int arr[], int begin, int end) {
		int pivot = arr[end];

		System.out.println(pivot);
		int i = (begin - 1);
		System.out.println(i);
		for (int j = begin; j < end; j++) {
			// compare all the element till the pivot index while comparing with pivot
			if (arr[j] <= pivot) {
				i++;

				// if bigger than swap
				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = swapTemp;

		return i + 1;
	}

	public static void main(String args[]) {
		int[] array = { 12, 1, 10, 50, 5, 15, 45 };
		// call the merge sort with array and its length
		quickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
	}
}
