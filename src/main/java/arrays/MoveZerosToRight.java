package arrays;

public class MoveZerosToRight {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,3,12,0,2};
		moveZerosToRight(nums);
	}

	private static void moveZerosToRight(int[] nums) {
		// TODO Auto-generated method stub
		int k = 0; //position that i have to swap
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				int temp = nums[k];
				nums[k] = nums[i];
				nums[i] = temp;
				System.out.println("k = "+k + ",i="+i+"," + "nums[k]="+nums[k]+",nums[i]="+nums[i]);
				for(int l=0;l<nums.length;l++)
				{
				System.out.print(nums[l]);
				System.out.print(",");
				}
				System.out.println();
				k++;
			}
		}
		
		for(int i=0;i<nums.length;i++)
		{
		System.out.print(nums[i]);
		System.out.print(",");
		}
		}
}
