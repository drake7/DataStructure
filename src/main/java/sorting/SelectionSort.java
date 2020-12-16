package sorting;

public class SelectionSort 
{
public static void main(String...s)
{

	int[] a= {12,5,1,21,56,21,8,8,213};

	
	for(int i=0;i<a.length-1;i++)
	{
		int temp=0;
		 for(int j=i+1;j<a.length-1;j++)
		 {
			 // compare the first index with all the elements of array and then shift to next index
				 if(a[i] > a[j])  
	               {  
	                   temp = a[i];  
	                   a[i] = a[j];  
	                   a[j] = temp;  
	               } 
			 
 
		 }
	}
	
	for (int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}

}
}
