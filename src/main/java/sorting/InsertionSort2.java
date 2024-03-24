package sorting;

public class InsertionSort2 {

	
	public static void main(String[] args) {
		int[] unsortedArray = {1,12,3,2,5,123,12,4,2};
		
		
		// insertion sort say, imagine you have the sorted array and 
		// put element one by one in that sorted array
		//start with one 
		for(int i=1;i<unsortedArray.length; i++)
		{
			int tmp = unsortedArray[i]; int j = i;
			while(unsortedArray[j-1]>tmp && j>0)
			{
				unsortedArray[j] = unsortedArray[j-1];
				j--;
			}
			unsortedArray[j] = tmp;
		}
		
		for(int n:unsortedArray)
		{
			System.out.print(n + " ");
		}
	}
}
