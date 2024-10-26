package twopointer;

import java.util.ArrayList;

public class RemoveDuplicate {

	/*
	 *How to remove duplicates from the sorted array
	 *1. you can use the hashmap or some other kind of data structure which does not allow the duplicates in them.
	 *2. Brute force - create new array and check that array all the time before inserting if 
	 *3. 2 pointer approach -> where you run two pointers if you find difference then you can switch  
	 *
	 *
	 *
	 */

	public static void main(String[] args) {
		int[] data = {1,1,1,1,1,5,6,9,12,31,34,34,34,78,590};


		ArrayList<Integer> e = RemoveDuplicate(data);
		for(Integer elem:e)
		{
			System.out.println(elem);
		}
	
	}

	private static ArrayList<Integer> RemoveDuplicate(int[] data) {
		// TODO Auto-generated method stub
		int slow = 0;
		int fast = 1;
		ArrayList<Integer> e = new ArrayList<>();
		//fist element is always distinct so adding that in the start
		e.add(data[slow]);
		
		
		//check elements but skip one so started from 1
		for(int i = 1;i<data.length;i++)
		{
			
			fast = i;
			//if data dont match then add the fast one
			if(data[slow]!=data[fast])
			{
				//add the second element
				e.add(data[fast]);
				
				//move your last fist point to new address where we found the element is different and now from here we have to compare
				slow = fast;
				fast = i;
			}
			
		}
		return e;
	}

}
