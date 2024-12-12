package arrays;

public class MajorityElement {

	public static void main(String[] args) {
		System.out.println();
		
		int[] arr = {1,3,3,3,3,4,2};
		
		
		System.out.println(majorityElement(arr));
	}

	private static int majorityElement(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int majorityElement = arr[0],count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(majorityElement==arr[i])
			{
				count ++;
			}
			else
			{
				count --;
				if(count <1)
				{
					majorityElement = arr[i];
				}
			}
			
		}
		
		
		return majorityElement;
	}
}
