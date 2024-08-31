package leetcode75;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
public class BestDayToBuyStock {
	
	public static void main(String[] args) {
		int[] a= {7,1,5,3,6,4,11,1,21};
		
		System.out.println(checkDays(a));
		
	}
	
	private static  int checkDays(int[] a) {
		int diff=0,maxProfit = 0;
		int slow = 0,fast = 1;
		
		//slow pointer and fast pointer , fast is less than length so we are checking till last day
		while(fast<a.length)
		{
			
			//now we will check what we are selling at
			diff = a[fast] - a[slow];
			//if diff greater than max profit, move
			if(diff>maxProfit)
			{
				
				maxProfit = diff;
			//	fast++;
			}
			//System.out.println(maxProfit+","+fast+","+slow);
			//if the next day price is less then change to next day and then work
			//for example 10,1,5 -> now 1 < 10 so we will check from 1 onward
			if(a[fast]<a[slow])
			{
				slow = fast;
			//	fast++;
			}
			fast++;
		}
		return maxProfit;
	}

}
