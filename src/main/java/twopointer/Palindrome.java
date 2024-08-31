package twopointer;

public class Palindrome {


	public static void main(String[] args) {
		String s = "No lemon, no melon";
		System.out.println(isPalindrome(s));
	}
	
	
	
    public static boolean isPalindrome(String s) {
        
    	
        char[] strData = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
    	int left = 0;
    	int right = strData.length-1;
    	if(strData.length==0 || strData.length==1)
    		return true;
    	
    	int mid = strData.length/2;
    	while(left != mid)
    	{
    		
    		if(strData[left]!=strData[right])
    		{
    			return false;
    		}
    		System.out.println(left+","+right);
    		left ++;
    		right --;
    		
    	}
        
        
        
        return true;
    }
	
}
