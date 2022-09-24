package sorting;

public class SelectSort {

	public static void main(String[] args) {
		int[] a= {12,5,21,56,21,8,8,213};

//		System.out.println(findShortest(a, 0));
		
		
		for(int i=0;i<a.length-1;i++)
		{
			int index=findShortest(a, i+1);
			
			
			
			//if current index is greater than the shortest element,replace the values 
			
			if(a[i]>=a[index])
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
		for (int i : a) {
			System.out.print(i +",");
		}
		
	}

	public static int findShortest(int[] arr,int index)
	{
		int temp=arr[index];
		int indexLocal=index;
		for(int i=index;i<arr.length-1;i++)
		{
			if(arr[i]<=temp)
			{
				temp=arr[i];
				indexLocal=i;
			}
		}
		return indexLocal;
	}

}

