package assignment3;

public class Duplicate 
{
	public static void main(String...s)
	{
		
		int[] sortArray= {1,2,3,4,4,4,4,5,5,5,5,6,7,8,8,8,8,8,9};
		
		int[] newArray=new int[sortArray.length];
		int j=0;
		for(int i=0;i<sortArray.length-1;i++)
		{
			if(sortArray[i]!=sortArray[i+1])
			{
			newArray[j]=sortArray[i];
			j+=1;
			}
		
		}
		//because cant check the last element,so store it anyway
		newArray[j++] = sortArray[sortArray.length-1];
		System.out.println("Array before removing duplicates:");
		for(int i=0;i<sortArray.length;i++)
		{
			System.out.print(sortArray[i]+" ");
		}
		System.out.println();
		System.out.print("Array after removing duplicates:");
		
		for(int i=0;i<j;i++)
		{
			System.out.print(newArray[i]+" ");
		}
		System.out.println();
		System.out.println("new size:"+j);
	}
	
}
