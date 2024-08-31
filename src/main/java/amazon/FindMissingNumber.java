package amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present 
 * except one number x. You have to find x. 
 * The input array is not sorted. Look at the below array and give it a try before checking the solution.
 * */
public class FindMissingNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,8,4,3,6,7};
		int n = 8;
//		System.out.println(findMissing(nums,n));
		System.out.println(findMissingUsingSum(nums,n));
	}


	private static int findMissing(int[] nums, int n) {

		HashSet<Integer> result = new HashSet<>();
		for (int num : nums) {
			result.add(num);
		}
		for(int i = 1;i<= n;i++)
		{
			if(result.add(i)==true)
			{
				return i;
			}
		}
		return n;
	}

	private static int findMissingUsingSum(int[] nums, int n) {
		int sum = 0;
		for(int i = 0;i<nums.length;i++)
		{
			sum = sum + nums[i];
			
		}
		return ((n*(n+1))/2)-sum;
	}
}
