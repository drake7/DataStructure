package leetcode75;

public class MaxSumSubArray {
	
	public static void main(String[] args) {
		int[] arrCheck = { -2, 1, -3, 4, 4 };

		System.out.println(checkMaxSubArray(arrCheck));
	}

	private static int checkMaxSubArray(int[] nums) {
		
		
		int currentSum = 0;
		int maxSum = nums[0];
		
		
		for (int i = 0; i<nums.length;i++)
		{
			if(currentSum < 0)
			{
				currentSum = 0;
			}
			currentSum = currentSum + nums [i];
			maxSum = Math.max(currentSum, maxSum);
		}
		
		
		
		// TODO Auto-generated method stub
		return maxSum;
	}

}
