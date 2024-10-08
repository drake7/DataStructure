package recursion;

public class MinMaxElement {

	public static void main(String[] args) {
		int[] arr1 = {1,4,32,1,-19,2};
		System.out.println("Finding min element");
		
		int min = findMinElement(arr1,arr1.length);
		System.out.println(min);
	}

	private static int findMinElement(int[] arr1,int length) {
		// TODO Auto-generated method stub
		if (length == 1)
				return arr1[length-1];
		
		if(arr1[length-1]<=findMinElement(arr1, length-1))
			return arr1[length-1];
		
		return findMinElement(arr1,length-1);
	}
}

