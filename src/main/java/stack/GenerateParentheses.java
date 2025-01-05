package stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: when the current string is a valid combination
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Add an open parenthesis if we haven't used all of them
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // Add a closing parenthesis if it's valid to do so
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Number of pairs of parentheses
        List<String> combinations = generateParentheses(n);

        // Print the generated combinations
        System.out.println("Combinations of well-formed parentheses:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
