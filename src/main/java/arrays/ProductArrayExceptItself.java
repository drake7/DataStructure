package arrays;

public class ProductArrayExceptItself {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		proudct(nums);
		
	}
	
	private static int[] proudct(int[] nums) {
		
		int[] output = new int[nums.length];
		output[0] = 1;
		
		for(int i = 1;i<nums.length;i++)
		{
			output[i] = output[i-1]*nums[i-1];
			System.out.println(output[i-1]+","+nums[i-1]+','+output[i]);
		}
		int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= rightProduct;
            rightProduct *= nums[i];
            System.out.println(rightProduct+","+nums[i]+','+output[i]);
        }
        
        return output;
		
		
	}
}
