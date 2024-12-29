package recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void main(String[] args) {
        int n = 4; // Change this value for different board sizes
        List<List<String>> solutions = solveNQueens(n);
        //get the list of strings
        
        printSolutions(solutions);
    }

    public static List<List<String>> solveNQueens(int n) {
        
    	// create a list of list in the solution
    	List<List<String>> solutions = new ArrayList<>();
    	//create a board of size 4
        char[][] board = new char[n][n];
        
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        //start the board and assign the values with .
        solve(0, board, solutions, n);
        return solutions;
    }

    //solve the values
    private static void solve(int row, char[][] board, List<List<String>> solutions, int n) {
       
    	// if size is same
    	if (row == n) {
            solutions.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, solutions, n);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    private static void printSolutions(List<List<String>> solutions) {
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
