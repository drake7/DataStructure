package hashTable;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

	public static void main(String[] args) 
	{
		String ip1="abc";
		String ip2="vca";

		//System.out.println(ip1.codePointAt(0));

		Map<String,Integer> table=new HashMap();
		for (int i=0;i<ip1.length();i++)
		{
			String a=String.valueOf(ip1.charAt(i));
			String b=String.valueOf(ip2.charAt(i));
			table.put(a, i);
			table.put(b, i);
		}
		if(ip1.length()==table.size())
			System.out.println("String is permutated");
		else
			System.out.println("String is not permutated");
	}

}
