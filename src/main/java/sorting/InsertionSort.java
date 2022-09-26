package sorting;

public class InsertionSort {

	public static void main(String...s)
	{
		
		int[] a= {12,4,1,2,4,1,5,0,5,1020,21,5,12};
		
		//insertion sort is like card placements
		// choose the card and keep comparing with its next element unless u find an appropriate location
		
		
		
		for(int i=1;i<a.length;i++)
		{
			
			int k=a[i];
			int j=i-1;
			
			while (j>=0 && a[j]>k)
			{
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
		
		
		
	
}
