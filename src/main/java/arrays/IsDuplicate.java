package arrays;

public class IsDuplicate {
	
	public static void main(String[] args) {
	
		String s = "helothisdpkk";
		
		char[] ch = s.toCharArray();
		
		System.out.println(" "+isDuplicate(s));
		
	
	}
	
	public static boolean isDuplicate(String str)
	{
		//if length is greater than 128 then ofcourse duplicate
		if(str.length() > 128)
			return false;
		
		boolean[] char_set = new boolean[128];
		for(int i = 0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			int val = str.charAt(i);
			if(char_set[val])
			{
				return true;
			}
			char_set[val] = true;
		}
		return false;
		
	}
}


//time complexity = n, because one loop
//space compleixty is o(1) or o(c) where the size of character is fixed
