package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LongestSubsequence {

	public static void main(String[] args) {
		//		int[] nums  =  {0,3,2,5,4,6,1,1};
		//int[] nums  =  {0,0};
		int[] nums = {2,20,4,10,3,4,5};

		System.out.println(longestSubsequence(nums));
	}



	public static int longestSubsequence(int[] nums) {


		int maxLength = 0;
		//remove duplicates
		Set<Integer> numSet = new HashSet<>();
		for(int num:nums)
		{
			numSet.add(num);
			System.out.println(num);
		}

		System.out.println(numSet);

		Iterator<Integer> iterator = numSet.iterator();
		int[] numUnique = new int[numSet.size()];
		int k = 0;
		while (iterator.hasNext()) {
			int element = iterator.next();
			numUnique[k] = element;
			k=k+1;
		}

		Arrays.sort(numUnique);
		int length = 0;
		if(numUnique.length == 1)
		{
			return 1;
		}
		for(int i = 0;i<numUnique.length-1;i++)
		{

			if((numUnique[i+1]-numUnique[i])==0)
			{
				System.out.println("condition 1");
				System.out.println(numUnique[i+1]+" , "+numUnique[i]);
				continue;
			}
			if((numUnique[i+1]-numUnique[i])==1)
			{
				if(length ==0)
				{
					length = 1;
				}

				System.out.println("condition 2");
				System.out.println(numUnique[i+1]+" , "+numUnique[i]);
				length = length+1;
			}
			else
			{
				length = 0;
			}
			System.out.println("length = "+length);
			if(length>=maxLength)
			{
				maxLength = length;

			}

		}




		/*
		for(int i = 0;i<numSet.size();i++)
		{

			if((numSet[i+1]-nums[i])==0)
			{


				System.out.println("condition 1");
				System.out.println(nums[i+1]+" , "+nums[i]);
				continue;
			}
			if((nums[i+1]-nums[i])==1)
			{
				if(length ==0)
				{
					length = 1;
				}
				System.out.println("condition 2");
				System.out.println(nums[i+1]+" , "+nums[i]);
				length = length+1;
			}
			System.out.println("length = "+length);
			if(length>=maxLength)
			{
				maxLength = length;

			}

		}
		/*
		 * List<Integer> numsList = new ArrayList<>(); for(int i = 0;i<nums.length;i++)
		 * { numsList.add( nums[i]); } Collections.sort(numsList);
		 * 
		 * Set<Integer> sortedSet = new HashSet<>(numsList);
		 * 
		 * 
		 * for(int val : sortedSet) {
		 * 
		 * }
		 */
		return maxLength;
	}
}
