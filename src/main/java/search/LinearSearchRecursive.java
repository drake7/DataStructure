package search;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arrayN= {10,12,23,123,212,322,334,338,3678,4567,765442};
		System.out.println(LinearSearchRec(arrayN,0,322));
	}
	
	
	private static int LinearSearchRec(int[] arr,int index,int n) {
		// TODO Auto-generated method stub
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==n)
		{
		return index;
		}
		
		return LinearSearchRec(arr,index+1,n);
	}

}
