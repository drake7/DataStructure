package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {

	public static void main(String[] args) {

		String[] arr = {"act","pots","tops","cat","stop","hat"};
		System.out.println(groupAnagrams(arr));


	}

	public static List<List<String>> groupAnagrams(String[] strs) {

//		List<List<String>> result = new ArrayList<>();
		
		
		Map<String, List<String>> anagramMap = new HashMap<>();

	        for (String str : strs) {
	            // Convert the string to a char array, sort it, and then convert it back to a string
	            char[] charArray = str.toCharArray();
	            Arrays.sort(charArray);
	            String sortedStr = new String(charArray);

	            // Add the original string to the list of its sorted representation
	            if (!anagramMap.containsKey(sortedStr)) {
	                anagramMap.put(sortedStr, new ArrayList<>());
	            }
	            anagramMap.get(sortedStr).add(str);
	        }

	        // Return the values of the map as a list of lists
	        return new ArrayList<>(anagramMap.values());
	}

	
	public static boolean checkAnagram(String str1 ,String str2) {
		
		if(str1.length() != str1.length())
		{
			return false;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
		    return true;
		}

		
		
		return false;
	}
}
