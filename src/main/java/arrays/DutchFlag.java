package arrays;

public class DutchFlag {
	
	public static void main(String[] args) {
		int[] nums = {0,2,1,0,1,1,2,0,0};
		
		dutchFlagSort(nums);
	}

	private static void dutchFlagSort(int[] nums) {
		// TODO Auto-generated method stub
		
		int left = 0,right = nums.length-1;
		
		int i = 0;
		while(i<=right)
		{
			if(nums[i]==0)
			{
				
				int temp = nums[left];
				nums[left] = nums[i];
				nums[i] =  temp;
				left++;
				i++;
				
			}
			else if(nums[i]==2)
			{
				int temp =  nums[right];
				nums[right] = nums[i];
				nums[i] = temp;
				right --;
				
			}
			else
			{
				i++;
			}
				
		}
		for(int k = 0;k<nums.length;k++)
		{
		System.out.println(nums[k]);
		}
	}

}
