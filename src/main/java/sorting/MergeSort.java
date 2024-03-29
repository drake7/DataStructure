package sorting;

public class MergeSort {

	  public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){
	      
	      int i=0,l=0,r = 0;
	      //The while loops check the conditions for merging
	      while(l<left_size && r<right_size){
	          
	    	  //if left's first element is smaller than right's first element 
	    	  //than put that element in array and enhance
	          if(left_arr[l]<right_arr[r]){
	              arr[i] = left_arr[l];
	              //and move one step further
	              i++;l++;
	          }
	          else{
	        	  //add  the right array element
	              arr[i] = right_arr[r];
	              i++;
	              r++;
	          }
	      }
	      //then add the remaining one to the array 
	      while(l<left_size){
	          arr[i++] = left_arr[l++];
	      }
	      //then add the remaining one to the array
	      while(r<right_size){
	        arr[i++] = right_arr[r++];
	      }
	  }

	  //we called the merge sort
	  public static void mergeSort(int [] arr, int len){
	      //if length is less than 2 then no need to sort.
		  if (len < 2){
	    	  return;
	    	  }
	      
		  //find mid and create twwo different array
	      int mid = len / 2;
	      //left array size should be till mid
	      int [] left_arr = new int[mid];
	      //right needs to be remaining portion
	      int [] right_arr = new int[len-mid];
	      
	      //copying the array into two different portions of left and right
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              left_arr[i] = arr[i];
	          }
	          else{
	              right_arr[k] = arr[i];
	              k = k+1;
	              
	          }
	      }
	    // Recursively calling the function to divide the subarrays further
	      mergeSort(left_arr,mid);
	      mergeSort(right_arr,len-mid);
	    // Calling the merge method on each subdivision
	      merge(left_arr,right_arr,arr,mid,len-mid);
	  }

	  public static void main( String args[] ) {
	        int [] array = {12,1,10,50,5,15,45};
	        //call the merge sort with array and its length
	        mergeSort(array,array.length);
	        for(int i =0; i< array.length;++i){
	            System.out.print(array[i]+ " ");
	        }
	    }
	}
