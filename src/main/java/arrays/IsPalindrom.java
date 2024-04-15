package arrays;

public class IsPalindrom {
	public static void main(String[] args) {
		int x = 121;
		
		System.out.println(isPalindrome(x));
		
		
		
		
	}
	private static boolean isPalindrome(int x)
	{
		if(x < 0)
			return false;
		int checkX = x;
		int reverse = 0;
		int counter = 0;
		
		if (x==0)
		{
			return true;
		}
		while (x!=0)
		{
		int remainder =	x % 10;
		reverse = reverse * 10 + remainder;
		x = x/10;
		}
		System.out.println( reverse + "," + checkX);
		if(reverse == checkX)
		{
			return true;
		}
		
		return false;
	}
}
