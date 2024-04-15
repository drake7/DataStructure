package arrays;

public class RemoveDuplicate {
	

	    public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
	        int k = removeDuplicates(nums);
	        System.out.println("Number of unique elements: " + k);
	        System.out.print("Array after removing duplicates: [");
	        for (int i = 0; i < k; i++) {
	            if (i > 0) {
	                System.out.print(", ");
	            }
	            System.out.print(nums[i]);
	        }
	        System.out.println("]");
	    }

	    public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }

	        int uniqueCount = 1; // if only single element then ofcouse
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {    //if position i and i-1 not same
	                nums[uniqueCount] = nums[i];  // then unique count which is right now 1, here we will put the ith element because different else we won't
	                uniqueCount++; //and increase the unique value count
	            }
	        }

	        return uniqueCount;
	    }
	}



