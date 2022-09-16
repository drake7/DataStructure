package recursion;

public class LargestElement {
	static int index=0;
	static int max=0;
	public static void main(String[] args) {
		
		
		
		int[] element= {1,5,18,23,2};
		System.out.println(largest(element,element.length));
		
	}
	
	public static int largest(int[] elementStack,int length)
	{
	if(length==1)
		return elementStack[length-1];
		
	 if(elementStack[length-1]>=largest(elementStack,length-1))
		 return elementStack[length-1];  //compare these two largest(elementStack,length-1);
	 
	 else
		 return largest(elementStack,length-1);
	}
	
}
