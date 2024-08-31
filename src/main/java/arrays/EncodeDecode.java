package arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EncodeDecode {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();

		str.add("deepak");
		str.add("kumar");
		str.add("chandan");
		str.add("brothers");

		System.out.println(encode(str));

		System.out.println(decode(encode(str)));
	}

	public static String encode(List<String> strs) {

		StringBuilder encodedString = new StringBuilder();

		for(String str : strs)
		{
			encodedString.append(str.length()).append("#").append(str);

		}
		return encodedString.toString();

	}

	public static List<String> decode(String str) {


		//6#deepak5#kumar7#chandan8#brothers
		List<String> decodedString = new ArrayList<String>();
		int i=0;
		//41
		while(i<str.length())
		{
			//j=0
			int j = i;
			//get where u put the #
			while(str.charAt(j)!='#')
			{

				j++;
			}
			//now j=1
			int length = Integer.valueOf(str.substring(i,j)); //str.substring(0,1) = 6
			i=j+1+length; //to skip the length of data. 1+1+6
			decodedString.add(str.substring(j+1,i)); //2,8 deepak
		}
		
		return decodedString;

	}
}
