package game;

public class Connect4 {

	private final int rows = 6;
	private final int columns =7;
	private char board[][];
	private final char EMPTY = '.';
	private Connect4() {
		board = new char[rows][columns];
		//initialised with empty value
		for(int i=0;i<rows;i++)
		{
			for (int j = 0; j < columns; j++) {

				board[i][j] = EMPTY; 
			}
		}
	}

	//to drop the disc in the game
	public boolean dropDisc(int col,char playerDisc)
	{
		//because we only need column to drop disc
		//if column is less than 0 or greater column board 
		//then 
		if(col<0 || col>=columns)
		{
			return false;
		}
		// because we are going to insert it into a last row, we will start checking fromt the bottom
		//6 -> 5
		for(int row=rows-1;row>=0;row--)
		{
			//if that position is empty only than insert
			if(board[row][col] == EMPTY)
			{
				//assign player disc to that position
				board[row][col] = playerDisc;

				//then check if he wins
				return checkWin(row,col,playerDisc);
			}
		}
		return false;

	}


	private boolean checkWin(int row, int col, char playerDisc) {
		// TODO Auto-generated method stub
		return checkDirection(row,col,playerDisc,1,0)  //check horizontal
				|| checkDirection(row, col, playerDisc, 0, 1) // Check vertical
				|| checkDirection(row, col, playerDisc, 1, 1) // Check diagonal \
				|| checkDirection(row, col, playerDisc, 1, -1); // Check diagonal /
	}


	private boolean checkDirection(int row, int col, char playerDisc, int rowDir, int colDir) {
		// TODO Auto-generated method stub
		//why there is count 1 ,because we are adding a number
		int count = 1;
		// Check in one direction
		count += countConsecutive(row, col, playerDisc, rowDir, colDir);
		// Check in the opposite direction
		count += countConsecutive(row, col, playerDisc, -rowDir, -colDir);
		return count >= 4;
	}

	private int countConsecutive(int row, int col, char playerDisc, int rowDir, int colDir) {

		int count = 0;
		int r = row+ rowDir; //
		int c = col + colDir;

		while (r >= 0 && r < rows //less than total rows rows
				&& c >= 0  && c < columns //given values are board information 
				&& board[r][c] == playerDisc) {
			count++;
			r += rowDir;
			c += colDir;
		}
		return count;
	}

	public void printBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("********************");
	}

	public static void main(String[] args) {



		// when you drop a disc or assign a position to the disc, it will go to the lowest line or row
		Connect4 game = new Connect4();
		game.dropDisc(0, 'R');

		game.printBoard();
		game.dropDisc(0, 'Y');

		game.printBoard();
		game.dropDisc(0, 'R');

		game.printBoard();
		game.dropDisc(1, 'Y');


		game.printBoard();
		game.dropDisc(0, 'R');


		game.printBoard();
		game.dropDisc(1, 'Y');
		game.printBoard();
		game.dropDisc(0, 'R');


		game.printBoard();

		boolean winner = game.dropDisc(0, 'R');

		game.printBoard();
		if (winner) {
			System.out.println("Red wins!");
		} else {
			System.out.println("No winner yet.");
		}
	}
}
