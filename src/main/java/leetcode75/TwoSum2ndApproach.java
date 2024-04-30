package leetcode75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2ndApproach {

	
	public static void main(String[] args) {
		int[] a = {1,25,21,23,5,78,2};
		int target = 28;
		
		checkVal(a,target);
		int[] a1 = checkVal2(a,target);
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
	}
	
	
	public static void checkVal(int[] arrCheck, int target)
	{
		Map<Integer,Integer> check = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arrCheck.length;i++)
		{
			int n = target - arrCheck[i];
			if(check.get(n) == null)
			{
				check.put(arrCheck[i],i);
			}
			else
			{
				System.out.println(i+","+check.get(n));
				break;
			}
		}
		
		
	}
	
	public static int[] checkVal2(int[] arrCheck, int target)
	{
		Map<Integer,Integer> check = new HashMap<Integer,Integer>();
		for(int i=0;i<arrCheck.length;i++)
		{
			int n = target - arrCheck[i];
			if(check.containsKey(n))
			{
				check.put(arrCheck[i],i);
				return new int[]{check.get(n),i};
			}
			check.put(arrCheck[i],i);
		}
		return null;
	}
}
