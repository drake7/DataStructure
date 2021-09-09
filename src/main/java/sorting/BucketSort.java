package sorting;

import java.util.Vector;

public class BucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray= {10,20,30,15,45,90,60,50,100,160,12};

		
		
	}
	static void bucketSort(int[] a,int n)
	{
		//if number of element is less than  OR equals to 0 ,no need to check further
		if(n<=0)
			return;
		
		
		//Create n numbers of empty buckets;
		//Using verctor here becuase it is dynamic array,similar to ArrayList but synchronized
		@SuppressWarnings("uncheked")
		Vector<Integer> buckets = new Vector<Integer>(n);
		
		 for (int i = 0; i < n; i++) {
	//            buckets[i] = new Vector<Float>();
	        }
	}

}
