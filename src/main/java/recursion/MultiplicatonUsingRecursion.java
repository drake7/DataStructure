package recursion;

public class MultiplicatonUsingRecursion {

	public static void main(String[] args) {
	
		System.out.println(multiply(7,4));
	}
	
	
	public static int multiply(int count,int value)
	{
		
		if(count<=1)
		{
			return value;
		
		}
	
		return multiply(count-1,value)+value;
		
	}
}
