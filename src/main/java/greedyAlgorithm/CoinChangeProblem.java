package greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeProblem {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,10,50,100};
		int value = 225;
		
		 minCoinsRequired(arr,value).forEach((n)->System.out.println(n+","));;
		
	}

	private static List<Integer> minCoinsRequired(int[] arr,int value) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		
		if (value <= 0)
			return result;
		
		while(value>0)
		{
			int ld = largestDenominator(arr,value);
		//	System.out.println(ld+","+value);
			value = value - ld;
			result.add(ld);
		}
		
		
		return result;
	}
	
	private static int largestDenominator(int[] arr,int value) {
		// TODO Auto-generated method stub
		
		int maxDenominator = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=value && arr[i]>maxDenominator)
			{
				
				maxDenominator = arr[i];
			//	System.out.println(value+" ,"+maxDenominator);
			}
			
		}
		
		
		return maxDenominator;
	}
}
