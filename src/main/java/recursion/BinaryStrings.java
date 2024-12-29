package recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        int N = 2; // Length of the binary strings
        generateBinaryStrings(N, "");
    }

    private static void generateBinaryStrings(int N, String current) {
        if (current.length() == N) { // Base case: if the current string is of length N
            System.out.println(current);
            return;
        }

        // Recursive case: Add '0' and recurse
        generateBinaryStrings(N, current + "0");

        // Recursive case: Add '1' and recurse
        generateBinaryStrings(N, current + "1");
    }
}
