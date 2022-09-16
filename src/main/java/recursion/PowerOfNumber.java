package recursion;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		System.out.println(power(7,4));
	}
	
	
	public static int power(int count,int value)
	{
		
		if(count<=1)
		{
			return value;
		
		}
	
		return power(count-1,value)*value;
		
	}
}
