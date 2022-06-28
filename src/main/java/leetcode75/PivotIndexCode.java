package leetcode75;

//pivot index is index where left of array and right of array is of same sum
public class PivotIndexCode {

    public static int pivotIndex(int[] nums) {
        
        int sum=0,leftsum=0;
        for(int i=0;i<nums.length;i++)
        {
          sum=sum+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if (leftsum == (sum-leftsum-nums[i])) return i;
        
                leftsum +=nums[i];
                }
    return -1;
    }
    
    
    public static void main(String...s)
    {
    	int[] nums= {10,20,30,40,50,2,6,2};
    	System.out.println(pivotIndex(nums));
    }
}
