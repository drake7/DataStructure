package practice;

public class MergeSort {

	public static void main(String... s) {
		int[] a1 = { 112, 21, 4, 53, 23, 11, 242312, 23, 5 };
		mergeSort(a1, 0,a1.length-1);
		for (int i : a1) {
			System.out.print(i + ",");
		}
	}
	
	
	private static void mergeSort(int[] arr,int left,int right) {
		
		
		if(left<right)
		{
			int mid=(left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid,right);
			merge(arr,left,mid,right);
		}
	}
	
	private static void merge(int[] arr,int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		
		
		//array creation
		int[] leftArr=new int[n1];
		int[] rightArr=new int[n2];
		
		//left and right array insertion
		for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];
        
        
        //starting index
 
        int i=0,j=0;
        
        //submerged array index
        int k=1;
        while(i<n1 && j<n2)
        {	//compare left and right array and add accordingly
        	 if (leftArr[i] <= rightArr[j]) {
                 arr[k] = leftArr[i];
                 i++;
             }
             else {
            	 //put right array
                 arr[k] = rightArr[j];
                 j++;
             }
             k++;
        }
        
        /* Copy remaining elements of leftArray */
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        
        
 
        
	}
}
