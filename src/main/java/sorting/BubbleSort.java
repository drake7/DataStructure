package sorting;

public class BubbleSort
{

	public static void main(String...s)
	{
		
		int[] a= {12,23,1,42,1,521,34};
		int temp=0;
		for(int j=0;j<a.length-1;j++)
		{
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		
		for (int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
