package practice;

public class InsertionSort {
	public static void main(String... s) {
		int[] a1 = { 112, 21, 4, 53, 23, 11, 242312, 23, 5 };

		insertionSort(a1);
		for (int i : a1) {
			System.out.print(i + ",");
		}

	}
	
	
	public static void  insertionSort(int[] a) {
		
		//think of any card that you want to choose,lets say we choose the first one
		
		
		for(int i=1;i<a.length;i++)
		{
			//starting with the key and moving one step ahead if replace happens
			int key=a[i];
			int j=i-1;//check the left side element of the card
			
			//j from starting index of left element of the key  && comparing the initial value with the key
			while(j>=0 && key<=a[j])
			{
				a[j+1]=a[j];
				--j;
			}
			
			
			
			a[j+1]=key;
			
			
			
		}
		
		
	}
	
}
