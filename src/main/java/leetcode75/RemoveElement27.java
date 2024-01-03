package leetcode75;

public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
    	int counter=0;
    	
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]!=val)
    		{
    			counter++;
    		}
    	}
    	
    	
        
    	return counter;
    }
    
    public static void main(String[] args) {
    	int[] arrayTest = new int[]{3,2,2,3};
    	
    	System.out.println(removeElement(arrayTest,3));
    	
	}
}