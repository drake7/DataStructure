package amazon;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int i = 0,j=0, k=0;
       
       int[] newArr = new int[nums1.length + nums2.length];
       
       while(i <nums1.length && j < nums2.length)
       {
    	   if(nums1[i]<= nums2[j])
    	   {
    		   // k++ means assign first and then increase value so i dont need separate ++ condition
    		   newArr[k++] = nums1[i++];
    	   }
    	   else
    	   {
    		   newArr[k++] = nums2[j++];
    	   }
    	   
       }
       //do need to check for the remaining parts of the array
       while(i<nums1.length)
       {
    	   newArr[k++] = nums1[i++];
       }
       while(j<nums2.length)
       {
    	   newArr[k++] = nums2[j++];
       }
 
       
       double median;
       int length = newArr.length;
       if (length % 2 == 1) {
           // Odd length: median is the middle element
           median = newArr[length / 2];
       } else {
           // Even length: median is the average of the two middle elements
           median = (newArr[(length / 2) - 1] + newArr[length / 2]) / 2.0;
       }
       return median;
   }
}
