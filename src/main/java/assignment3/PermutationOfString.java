package assignment3;

public class PermutationOfString {

	public static void main(String...s)
	{
		
		
		
		String input="GOD";
		
		  int N = input.length();
		  //starting 
		  permute(input, 0, N - 1);
		
	}
	
	
	
	//swapping a characters of string
	 public static String swap(String a, int i, int j) {
		  char temp;
		  char[] charArray = a.toCharArray();
		  temp = charArray[i];
		  charArray[i] = charArray[j];
		  charArray[j] = temp;
		  return String.valueOf(charArray);
		}
	 
	 //method signature(string value,starting index,and size of an array)
	 private static void permute(String s, int index, int N) {
		 //if length is equal to index then string is already completed 
		 if (index == N)
		    System.out.println(s);
		  
		  else {
			  //swap and enhance the index one by one 
		    for (int i = index; i <= N; i++) {
		  //swap the characters of string at given location i.e. 0 and 0 for starter
		    	s = swap(s, index, i);
		    	//swap the character at 1 and length of the string and so on
		      permute(s, index + 1, N);
		      //swap the character at index and i location
		      s = swap(s, index, i);
		    }
		  }
		}
}
