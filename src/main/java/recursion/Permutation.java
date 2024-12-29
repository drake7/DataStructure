package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> result =  new ArrayList<>();
		
		generatePermutation(nums,0,result);
		System.out.println(result);
	}

	private static void generatePermutation(int[] nums, int index, List<List<Integer>> result) {
		// TODO Auto-generated method stub
		//starting index =0 ,nums.length = 3, 
		if(index == nums.length)
		{
			
		}
	}

}
