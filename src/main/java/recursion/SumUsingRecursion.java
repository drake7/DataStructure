package recursion;


public class SumUsingRecursion {

	public static void main(String[] args) {
	
		System.out.println(sum(5));
	}
	
	public static int sum(int n) {
		// TODO Auto-generated method stub

		if(n==1)
		{
			return 1;
		}		
		else
		{
			return sum(n-1)+n;
		}
	}
}
