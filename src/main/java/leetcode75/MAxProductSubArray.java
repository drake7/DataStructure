package leetcode75;

public class MAxProductSubArray {

	public static void main(String[] args) {
		int[] arrCheck = { -2, 1, -3, 4, 4 };

		System.out.println(checkMaxSubArray(arrCheck));
	}

	public static int checkMaxSubArray(int[] arr) {

		int totalSum = 0;
		int slow = 0, fast = 1;
		int maxTotal = 0;
		while (fast <= arr.length) {
			totalSum = totalSum + arr[slow];
			if (totalSum <= 0) {
				totalSum = 0;
			}
			if (totalSum > maxTotal) {
				maxTotal = totalSum;
			}
			slow++;
			fast++;
		}
		return maxTotal;
	}

	public int maxSubArray(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		}

		int maxSum = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			// Calculate the maximum sum ending at the current element
			currentSum = Math.max(nums[i], currentSum + nums[i]);

			// Update the overall maximum sum
			maxSum = Math.max(maxSum, currentSum);
		}

		return maxSum;
	}
}
