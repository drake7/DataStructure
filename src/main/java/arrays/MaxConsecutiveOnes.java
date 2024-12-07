package arrays;

public class MaxConsecutiveOnes {

	
	public static void main(String[] args) {
		
		int[] nums = {1,1,1,1,0,1,1,1};
		
		int maxConsecutive  = findMaxConsecutiveArray(nums);
		System.out.println(maxConsecutive);
	}

	private static int findMaxConsecutiveArray(int[] nums) {
		// TODO Auto-generated method stub
		int ans = 0;
		int count = 0;
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]==0)
			{
				count = 0;
			}
			else
			{
				count ++;
			}
			if(count>ans)
			{
				ans = count;
			}
		}
		
		
		return ans;
	}
}
