package sorting;

public class ShellSort {

	public static void main(String[] args) {
		
		int[] a= {12,23,1,42,1};
		
		sortingByShell(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	private static  void sortingByShell(int[] arrayForSort) {
		
		int length=arrayForSort.length;
		System.out.println("Length of an array:"+length);
	
		//now we need to divide this into small shells of same sizes
		//div is half of the length, and condition for this to finish that div should not reach to 0 
		//and will split by half every time(not that we are splitting divs not length)
		for (int div=length/2;div>0;div /=2)
		{
			//now apply insertion sort for this div of array(lets assume div is 4 right now)
			for(int i=div;i<length;i++)
			{
				//get the first element of array in the temp
				int temp=arrayForSort[i];
				
				int j;
				for(j=i;j >= div && arrayForSort[j-div]>temp; j=j-div )
				{
					arrayForSort[j]=arrayForSort[j-div];
					
				}
				arrayForSort[j]=temp;
				
			}
			
		}
		
		
		
	}
}
