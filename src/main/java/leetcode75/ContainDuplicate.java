package leetcode75;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

	
	public static void main(String[] args) {
		int[] a1 = {1,32,12,23,5};
		System.out.println(checkDuplicate(a1));
		
	}
	
	public static boolean checkDuplicate(int[] a)
	{
		Set<Integer> e = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			
			if(!e.add(a[i]))
			{
			return true;	
			}
		}
		return false;
	}
}
