package arrays;

public class MoveValuesToLeft {
	
	public static void main(String[] args) {
		int[] nums = {1,23,4,2,3,23,12};
		
		
		for(int i =0;i<nums.length-1;i++)
		{
			nums[i]=nums[i+1];
		}
		
		
		for(int i=0;i<nums.length;i++)
		{
		System.out.print(nums[i]+",");
		}
	}

}
