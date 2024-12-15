package binarySearch;

import java.util.Iterator;

public class FirstLastPosition {
	
	public static void main(String[] args) {
		
	int[] arr =  {1,2,2,4,5,6,7,7,7,7,7,9,10};
	int target = 7;
	
	int[] result = findRange(arr,target);
	for (int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	}

	public static int[] findRange(int[] arr,int target)
	{
		int leftPosition = left(arr,target);
		int rightPosition = right(arr,target);
		
		int[] ans = {leftPosition,rightPosition};
		
		return ans;
	}
	public static int left(int[] arr, int target)
	{
		int start = 0,end = arr.length-1;
		int ans = -1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]<target)
			{
				start = mid+1;
			}
			else if(arr[mid]>target)
			{
				end = mid-1;
			}
			else
			{
				ans = mid;
				end = mid-1;
			}
		}
		return ans;
	}
	public static int right(int[] arr, int target)
	{int start = 0,end = arr.length-1;
	int ans = -1;
	while(start<=end)
	{
		int mid = (start+end)/2;
		if(arr[mid]<target)
		{
			start = mid+1;
		}
		else if(arr[mid]>target)
		{
			end = mid-1;
		}
		else
		{
			ans = mid;
			start = mid+1;
		}
	}
	return ans;
	}
}
