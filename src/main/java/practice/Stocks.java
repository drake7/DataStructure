package practice;

public class Stocks {

	public static void main(String[] args) {
		int[] a = { 44,30,24,32,35,30,40,38,15 };
		int[] b = {10,9,6,2};

		System.out.println(getStocks(b));
	}
	
	private static int getStocks(int[] a)
	{
		int temp=-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]<a[j])
			{
				if(a[j]-a[i]>temp)
				{
					temp=a[j]-a[i];
				}
			}
		}
		
		return temp;
	}
}
