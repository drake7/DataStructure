package circularSingleLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodBreackets {
    public static List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            if (valid(current))
                result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos+1, result);
            current[pos] = ')';
            generateAll(current, pos+1, result);
        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }



public static void main(String...s)
{	
	 int[] intArray = {4,8,3,2};
int maxNum = intArray[0];

    for (int j : intArray) {
        if (j > maxNum)
            maxNum = j;
    }
    
    List<Integer> arr=new ArrayList<Integer>();
    arr.add(4);
    arr.add(8);
    arr.add(3);
    arr.add(2);

    MNGS(4, arr);

List<String> output=generateParenthesis(maxNum);
System.out.println();
System.out.println(output.size());
		
//output.forEach((action) ->  System.out.println(action));		
}

public static int MNGS(int N,List<Integer> arr)
{
	
	
	List<String> output=generateParenthesis(Collections.max(arr));
	return output.size();
}
}