package leetcode75;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
	
		int[] a= {1,2,5,1,8};
		
		int[] result = getProducts(a);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+ " ");
		}
	}
	

	private static int[] getProducts(int[] a2) {
		// TODO Auto-generated method stub
		
		int product = 1;
		for(int i=0;i<a2.length;i++)
		{
			product = product* a2[i];
		}
		int[] answer = new int[a2.length];
		for(int i=0;i<a2.length;i++)
		{
			answer[i]= product/a2[i];
		}
		
		
		
		return answer;
	}
}
