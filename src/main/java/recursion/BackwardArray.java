package recursion;

public class BackwardArray {

	public static void main(String[] args) {
		int[] arrayInfo= {1,2,3,4,5,6,7,8,9};
		printBackwardArray(arrayInfo, 4);
	}
	
	private static void printBackwardArray(int[] arrayInfo,int countPortion) {
		//if array length is 10 and user ask to print 12 element.
		if(arrayInfo.length<countPortion)
		{	System.out.println("Invalid count Portion");
			return;
		}
		if(countPortion<1)
		{
			return;
		}
		
		printBackwardArray(arrayInfo, countPortion-1);
		System.out.println(arrayInfo[arrayInfo.length-countPortion]);

	}
}
