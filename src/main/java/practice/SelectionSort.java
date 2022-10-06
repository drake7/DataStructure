package practice;

//find smallest place it at current index and move forward
public class SelectionSort {

	public static void main(String...s)
	{
		int[] a1= {1,21,4,53,23,11,242312,23,5};
		
		Sort(a1);
		
		for (int i : a1) {
			System.out.println(i);
		}
		
	}
	
	public static void Sort(int[] data)
	{
	
		for(int i=0;i<data.length-1;i++)
		{
			//find the smallest and replace that with the given value of current I
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j])
				{
					int temp=0;
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}	
			}
		}
		
	}	
	
	
}
