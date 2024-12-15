package binarySearch;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,7,9,21,23,25,27,356,357,921};
		int number = 23;
		System.out.println(binarySearch(arr,number));
	}

	private static int binarySearch(int[] arr, int number) {
		// TODO Auto-generated method stub
		
		int start = 1, end  = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]<number)
			{
				start = mid + 1;
			}
			else if (arr[mid]>number)
			{
				end = mid -1;
			}
			else
			{
				return mid;
			}
		}
		
		return -1;
	}

}
