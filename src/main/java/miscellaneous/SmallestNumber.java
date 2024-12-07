package miscellaneous;

public class SmallestNumber {

	
	public static void main(String[] args) {
			System.out.println(smallestNumber(10,2));
	}
	
	
    public static int smallestNumber(int n, int t) {
        int result = 0;
        for(int i=n; ;i++)
        {
        	
        	if(isDivisble(i,t))
        	{
        		result = i;
        	break;
        	}
        }

    	return result;
    }
    
    public static boolean isDivisble(int i,int t)
    {
    	
    	 int product = 1;
         while (i != 0) {
             int digit = i % 10;  // Get the last digit
             product *= digit;         // Multiply it to the product
             i /= 10;             // Remove the last digit
         }
    	return (product%t==0);
    }
}
