package leetcode75;

public class MoveZerosToRight {
	public static void main(String[] args) {
		int[] nums = {1,0,3,0,21,12};
		
		
		moveZeroes(nums);
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(" "+nums[i]);
		}	
	}
	
	 public static void moveZeroes(int[] nums) {
	        
	        if(nums.length==1)
	        return ;

	        //took left pointer and right pointer
	        int L = 0, R = 1;
	        //run while the fast pointer doesnt reach to end
	        while(R<nums.length)
	        {
	        	//if slow pointer != zero which means element is correct and we will just move both pointer to the next one
	        	if(nums[L]!=0) {
	        		
	        		L++;
	        		R++;
	        	}
	        	
	        	//else if the fast pointer is zero then we will  eg L=1,R=0 -> already correct until we see non zero number so R++
	        	else if (nums[R]==0) {
	        		R++;
	        	}
	        	
	        	//else we are in condition where L is zero and R is not zero so we will swap the element
	        	else
	        	{
	        		int temp = nums [R];
	        		nums[R] = nums[L];
	        		nums[L] = temp;
	        	}
	        	
	        	
	        }
	    }
}
