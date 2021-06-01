package stringQue;

import java.util.Arrays;

public class Anagram {
	public static void main(String...s)
	{
		String input1="abc";
		String input2="cbe";
	System.out.println(isAnagram(input1,input2));	
	}

	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		
		
		return sort(s1).equals(sort(s2));
		
		
	}
	 public static String sort(String s)
	 {
		 
		 char[] ars=s.toCharArray();
		 Arrays.sort(ars);
		 String s1="";
		 for(int i=0;i<ars.length;i++)
		 {
			 s1=s1+ars[i];
			 
		 }
		 return s1;
	 }
	 
}
