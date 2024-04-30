package leetcode75;

public class MAxProductSubArray {
	
	public static void main(String[] args) {
		int[] arrCheck = {-2,1,-3,4,-1,2,-5,4};
		
		System.out.println(checkMaxSubArray(arrCheck));
	}

	public static int checkMaxSubArray(int[] arr)
	{
		
		int totalSum = 0;
		int slow = 0,fast = 1;
		for(int i=0;i<arr.length;i++)
		{
			
			int sum = totalSum + arr[slow];
		
			
			
		}
		
		
		
		return 0;
	}
}
