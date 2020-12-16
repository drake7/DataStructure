package sorting;

public class MergeSort 
{
	public static void main(String...s)
	{
		
		int[] a= {21,32,12,4,21,1,43,12,54,6,7,8,3,54,32,56,76,89};
		
		
		MergeSort ob=new MergeSort();
		ob.sort(a, 0, a.length-1);
		
		for (int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}	
	}
	
	void sort(int[] a,int l,int r)
	{
		//starting is smaller than ending
		if (l<r)
		{
			
			int m=(l+r)/2;
			sort(a,l,m);
			sort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	
	void merge(int[] a,int l,int m,int r)
	{
		
		//size of arrays which  to be merged
		int n1=m-l+1;//left to mid
		int n2=r-m;//mid to right distance
		
		
		//temp arrays generations
		
		int [] left=new int[n1];
		int [] right=new int[n2];
		
		
		//copy data to temp arrays
		for(int i=0;i<n1;++i)
			left[i]=a[i+1];
		for(int j=0;j<n2;++j)
			right[j]=a[m+1+j];
		
		//initial indexes of first and second subarray
		
		
		int i=0;int j=0;
		
		//initial index of merged subarray
		int k=l;
		
		
		while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of left[] if any */
        while (i < n1-1) {
            a[k] = left[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of right[] if any */
        while (j < n2-1) {
            a[k] = right[j];
            j++;
            k++;
        }
	}

}
