package neetcode.binarysearch;

public class Solution {

	public static void main(String[] args) {




		/*You are given an integer array piles where piles[i] is the number of bananas in the ith pile. You are also given an integer h, which represents the number of hours you have to eat all the bananas.

		  You may decide your bananas-per-hour eating rate of k. Each hour, you may choose a pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, you may finish eating the pile but you can not eat from another pile in the same hour.

		  Return the minimum integer k such that you can eat all the bananas within h hours.*/

		int[] piles =  {1,4,3,2};
		int maxHours = 9;
		System.out.println(minEatingSpeed(piles,maxHours));

	}

	public static int minEatingSpeed(int[] piles, int h) {

		int left = 1;
		int right = getMaxPile(piles);

		while(left<right)
		{
			//middle value for k
			int k = left + (right-left)/2; 
		}
		return 0;
	}

	private static int getMaxPile(int[] piles) {
		// TODO Auto-generated method stub
		int max = 0;
		for (int pile : piles) {
			max = Math.max(max, pile);
		}
		return max;
	}

}
