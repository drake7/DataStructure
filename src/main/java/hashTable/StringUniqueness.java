package hashTable;

import java.util.Hashtable;
import java.util.Map;

public class StringUniqueness 
{
	public static void main(String...s)
	//to check if string has all unique Character
	{
		String testcase1="asdfghjkl";
		Map<String , Integer> table = new Hashtable<>();
		for (int i=0;i<testcase1.length();i++)
		{
			String a=String.valueOf(testcase1.charAt(i));
			table.put(a, i);
		}
		if(testcase1.length()==table.size())
			System.out.println("String has unique characters");
		else
			System.out.println("String has repeatable characters");
	}
}
