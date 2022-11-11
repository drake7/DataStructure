package leetcode75;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;

public class Life {

	public static void main(String[] args) {

		BufferedReader br = null;

		int height = 0, width = 0;

		try {
			br = new BufferedReader(new FileReader("C:/Users/deepa/git2/DataStructure/src/main/java/leetcode75/input.txt"));
			height = Integer.parseInt(br.readLine());
			width = Integer.parseInt(br.readLine());


		} catch (IOException e) {
			e.printStackTrace();
		}

		char[][] BOARD = new char[width][height]; // actual board to be displayed with asterisk and space
		int[][] board = new int[width][width]; //similar to board with number values to calculate neighbors
		
		String line;
		try {
			while((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				int x = Integer.parseInt(tokens[0]);
				int y = Integer.parseInt(tokens[1]);
				
				board[x][y] = 1;
				BOARD[x][y] = '*';
			}
			
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		gameOfLife(board, BOARD, width, height);

	}
	
	public final static void clearConsole() {
		/*
		 * clearConsole method to clear the console if you are using Windows' command
		 * prompt or Linux-based system This method does not work in Eclipse IDE.
		 */
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

	public static void gameOfLife(int[][] board, char[][] BOARD, int width, int height) {
		
		//calculating time
		LocalTime now = LocalTime.now();
		int lastSec = now.getSecond();
		
		while (true) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					encode(board, i, j);
				}
			}

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					update(board, BOARD, i, j);
				}
			}

			//printing
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					System.out.print(BOARD[i][j]);
				}
				System.out.println();
			}
			
			//changing time
			lastSec++;
			
			// clearing console
			clearConsole();
			
		}
	}

	public static void encode(int[][] board, int i, int j) {

		int aliveCount = 0;

		for (int r = -1; r <= 1; r++) {
			for (int c = -1; c <= 1; c++) {
				int neighR = i + r;
				int neighC = j + c;

				if (neighR >= 0 && neighR < board.length && neighC >= 0 && neighC < board.length) {
					int neighborValue = board[neighR][neighC];
					if (r == -1 || (r == 0 && c < -1)) {
						neighborValue = neighborValue / 10;
					}
					if (neighborValue == 1 && !(r == 0 && c == 0)) {
						aliveCount++;

					}
				}
			}
		}
		board[i][j] = board[i][j] * 10 + aliveCount;

	}

	public static void update(int[][] board, char[][] BOARD, int i, int j) {

		int neighborCount = board[i][j] % 10;
		boolean isAlive = board[i][j] / 10 == 1;

		// checking rules

		// All live cells die in the next generation
		if (isAlive) {
			board[i][j] = 0; // dead
			BOARD[i][j] = ' ';
		}
		// Any live cell with two or three live neighbors survives in the next
		// generation
		else if (isAlive && (neighborCount == 2 || neighborCount == 3)) {
			board[i][j] = 1; // alive
			BOARD[i][j] = '*';
		}
		// Any dead cell with three live neighbors becomes a live cell in the next
		// generation
		else if (neighborCount == 3) {
			board[i][j] = 1; // alive
			BOARD[i][j] = '*';
		}
		// All other dead cells stay dead in the next generation
		else {
			board[i][j] = 0; // dead
			BOARD[i][j] = ' ';
		}

	}

}
