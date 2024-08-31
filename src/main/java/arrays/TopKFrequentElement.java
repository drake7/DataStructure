package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElement {

	
	public static void main(String[] args) {
		
		 HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
	    int[] nums = {1,2,2,3,3,3,4};
	    int k = 2;
	    
	    System.out.println(Arrays.toString(topKFrequent(nums,k)));
	    
		
	}
	
    public static int[] topKFrequent(int[] nums, int k) {
        

    	int[] arr = new int[k];
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        for(int num : nums)
        {
        	if(result.get(num)== null)
        	{
        		result.put(num, 0);
        	}
        	result.put(num, result.get(num)+1);
        }
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->result.get(a)-result.get(b));
        
        for (int key : result.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the lowest frequency
            }
        }
        int[] resultFinal = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            resultFinal[i] = heap.poll();
        }
        return resultFinal;
    }
    
}
