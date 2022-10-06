package search;

public class BinarySearch {

	
	public static void main(String[] args) {
		
		int[]  arrayN= {10,12,23,123,212,322,334,338,3678,4567,765442};
		System.out.println("index:"+BinarySearchIter(arrayN,123));
		
		
	}
	
	
	public static int BinarySearchIter(int[] arr,int n)
	{
		int right=arr.length-1;
		int left=0;
	
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			System.out.println(arr[mid]);
			if(arr[mid]<n)
			{
				left=mid;
				right=arr.length;
				continue;
			}
			if(arr[mid]>n)
			{
				left=0;
				right=mid;
				continue;
			}
			if(arr[mid]==n)
			{
				return mid;
			}
			
		}
		
		return 0;
	}
}
