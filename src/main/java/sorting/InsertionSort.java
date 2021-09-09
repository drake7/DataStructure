package sorting;

public class InsertionSort {

	public static void main(String...s)
	{
		
		int[] a= {4,1,5,1020,21,5,12};
		
		//insertion sort is like card placements
		//choose the card and keep comparing with its next element unless u find an appropriate location
		
		
		for(int i=1;i<a.length;i++)
		{
			
			int k=a[i];//take first element of unsorted array,Second element of array because single element is always sorted
			int j=i-1;//because compare starts from first element
			
			while (j>=0 && a[j]>k)//define if there is need to swap or not
			{
				//when the sortedArray element is greater than unsortedArrayElement then swapping
				System.out.println("index="+j+",value at index="+a[j]+",Value at index + 1= "+a[j+1]);
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=k;
			
		}
		
		for (int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}

	}
		
//We can use when we have the continous inflow of data;		
//time Complexity is O(n2);
	
	
	
	
// Difference between insertion and selection is:insertion takes first element and selection takes min.
	
}
