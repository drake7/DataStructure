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
		while(fast<a.length)
		{
			diff = a[fast] - a[slow];
			if(diff>maxProfit)
			{
				maxProfit = diff;
			//	fast++;
			}
			//System.out.println(maxProfit+","+fast+","+slow);
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
