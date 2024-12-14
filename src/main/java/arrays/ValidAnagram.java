package arrays;

import java.util.Arrays;

public class ValidAnagram {
	
	public static void main(String[] args) {
		System.out.println("Valid anagram ");
		
		
		String s1 = "dog";

		String s2 = "god";
		
		
		System.out.println(validAnagram(s1,s2));
		
	}

	private static boolean validAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		
		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		char[] c2 = s2.toCharArray();
		Arrays.sort(c2);
		
		
		return Arrays.equals(c1, c2);
	}

}
