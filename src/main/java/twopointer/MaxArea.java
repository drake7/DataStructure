package twopointer;

public class MaxArea {

	public static void main(String[] args) {
		int[] height = {1,7,2,5,4,7,3,6};
		System.out.println(maxArea(height));
	}
	public static int maxArea(int[] heights) {
		
		int left = 0,right = heights.length-1;
		int maxArea = 0;
				
		while(left!=right)
		{
			int current = 0;
			if(heights[left]>=heights[right])
			{
				current = (right-left)*heights[right]; 
				right -- ;
			}
			else
			{

				current = (right-left)*heights[left]; 
				left ++ ;
			}
			
			if(current>=maxArea)
			{
				maxArea= current;
			}
		}
		
		
		
		return maxArea;
	}

}
