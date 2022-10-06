package search;

public class BinarySearchRecursive {

public static void main(String[] args) {
		
		int[]  arrayN= {10,12,23,123,212,322,334,338,3678,4567,765442};
		System.out.println("index:"+BinarySearchRec(arrayN,334,0,arrayN.length));
		
}

private static int BinarySearchRec(int[] arr,int number,int left,int right) {
	int mid=(left+right-1)/2;
	System.out.println("middle:"+arr[mid]);
if(arr[mid]==number)
{
return mid;
}
if(arr[mid]>number)
{
return BinarySearchRec(arr,number,0,mid);	
}
if(arr[mid]<=number)
{
return BinarySearchRec(arr,number,mid,arr.length);	
}
return -1;
}

}
